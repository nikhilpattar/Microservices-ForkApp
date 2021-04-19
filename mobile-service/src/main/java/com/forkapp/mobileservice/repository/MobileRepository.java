package com.forkapp.mobileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.forkapp.mobileservice.model.Mobile;

public interface MobileRepository extends MongoRepository<Mobile, Integer>{

}
