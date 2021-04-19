package com.forkapp.laptopservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.forkapp.laptopservice.model.Laptop;

@Repository
public interface LaptopRepository extends MongoRepository<Laptop, Integer>{

}
