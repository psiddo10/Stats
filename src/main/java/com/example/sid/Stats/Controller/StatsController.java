package com.example.sid.Stats.Controller;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.sid.Stats.Entity.StatsEntity;
import com.example.sid.Stats.Repository.StatsRepo;
import com.example.sid.Stats.Service.StatsService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("stats")
public class StatsController {
	
	@Autowired
	StatsService service;

	
	WebClient webClient=WebClient.builder().baseUrl("https://api2.pocketbits.in").defaultHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE).build();
	private ScheduledExecutorService executor;
	private ScheduledFuture<?> future;
	
	@PostMapping("/put")
	public void get() throws InterruptedException{

		service.putdata();

		
		
		
		 

	}
}
