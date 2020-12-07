package com.example.sid.Stats.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sid.Stats.Entity.StatsEntity;

public interface StatsRepo extends MongoRepository<StatsEntity, Long> {

}
