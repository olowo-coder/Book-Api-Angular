package com.example.bookangularpro.repository;

import com.example.bookangularpro.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, Long> {
}
