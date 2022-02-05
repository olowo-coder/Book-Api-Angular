package com.example.bookangularpro.controller;

import com.example.bookangularpro.entity.Book;
import com.example.bookangularpro.repository.BookRepository;
import com.example.bookangularpro.service.BookServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
@Slf4j
public class BookController {
    private final BookServiceImpl bookService;

    @CrossOrigin("http://localhost:4200")
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks(){
//        return Stream.of(new Book(101, "Java", 304),
//                new Book(102, "Python", 607),
//                new Book(103, "C++", 123)).collect(Collectors.toList());
        log.info("getting all Books");
        return bookService.getAllBooks();
    }

    @CrossOrigin("http://localhost:4200")
    @PostMapping(path = "/save")
    public Book saveBooks(@RequestBody Book book){
        log.info("Saving Book");
        return bookService.create(book);
    }

}
