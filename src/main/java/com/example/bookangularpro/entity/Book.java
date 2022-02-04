package com.example.bookangularpro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

//    private Long id;
    private Integer courseCode;
    private String title;
    private Integer pages;

}
