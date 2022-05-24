package com.hexagonal.mongo.repository;

import com.hexagonal.mongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, Integer> {
}
