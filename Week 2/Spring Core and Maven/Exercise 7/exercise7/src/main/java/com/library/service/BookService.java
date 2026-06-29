package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    
    private BookRepository bookRepository;

    // Constructor for Constructor Injection
    public BookService(BookRepository bookRepository) {
        System.out.println(" 1. Constructor Injection Triggered! ");
        this.bookRepository = bookRepository;
    }

    // Setter for Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        System.out.println(" 2. Setter Injection Triggered! ");
        this.bookRepository = bookRepository;
    }

    public void manageLibrary() {
        System.out.println("BookService: Managing the library...");
        bookRepository.fetchBooks();
    }
}