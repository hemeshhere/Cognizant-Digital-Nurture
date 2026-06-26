package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void manageLibrary() {
        System.out.println("Service: Managing library requests...");
        if (bookRepository != null) {
            bookRepository.fetchBooks();
        } else {
            System.out.println("Error: Repository was not injected!");
        }
    }
}