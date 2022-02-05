package com.example.bookangularpro.service;

import com.example.bookangularpro.entity.Book;
import com.example.bookangularpro.repository.BookRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
@Slf4j
public class BookServiceImpl {

    private final BookRepository bookRepository;
    private final SequenceGeneratorService sequenceGeneratorService;

    public Book create(Book book) {
        log.info("Saving new server: {}", book.getTitle());
        book.setId(sequenceGeneratorService.generateSequence(Book.SEQUENCE_NAME));
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }


}
