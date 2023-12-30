package com.springmongodb.springmongodb.repository;

import com.springmongodb.springmongodb.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
