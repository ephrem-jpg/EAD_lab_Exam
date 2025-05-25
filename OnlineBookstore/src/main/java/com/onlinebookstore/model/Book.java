package com.onlinebookstore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Book {
    private Long id;
    private String title;
    private String author;
    private double price;
}