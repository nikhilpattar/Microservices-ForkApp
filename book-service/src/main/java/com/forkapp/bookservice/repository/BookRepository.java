package com.forkapp.bookservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.forkapp.bookservice.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer>{

}
