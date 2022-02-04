package com.example.bookangularpro.controller;

import com.example.bookangularpro.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return Stream.of(new Book(101, "Java", 304),
                new Book(102, "Python", 607),
                new Book(103, "C++", 123)).collect(Collectors.toList());
    }

}
