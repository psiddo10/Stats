package com.example.sid.Stats.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.sid.Stats.Entity.StatsEntity;
import com.example.sid.Stats.Repository.StatsRepo;

import reactor.core.publisher.Flux;

@Service
public class ServiceImpl implements StatsService {

	private ScheduledExecutorService executor;
	private ScheduledFuture<?> future;
	WebClient webClient=WebClient.builder().baseUrl("https://api2.pocketbits.in").defaultHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE).build();

	@Autowired
	StatsRepo repo;
	
	@Autowired
	StatsEntity entity;
	
	@Override
	public void putdata() {
		
		executor = Executors.newSingleThreadScheduledExecutor();
		   
		 
		 future = executor.scheduleAtFixedRate(new Runnable(){

			@Override
			public void run() {
				Flux<StatsEntity> mongo =webClient.get().uri("api/v1/ticker").retrieve().bodyToFlux(StatsEntity.class);
				
				double temp=entity.getClose();
				 repo.saveAll(mongo.collectList().block()) ;
				 
				 entity.setOpen(temp);
			}
	},0,5,TimeUnit.SECONDS);

}
}