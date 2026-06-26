package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Starting Spring Application ---");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService libraryService = (BookService) context.getBean("bookService");
        
        libraryService.manageLibrary();
    }
}