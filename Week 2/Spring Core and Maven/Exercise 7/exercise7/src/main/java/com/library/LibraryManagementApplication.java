package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("Initializing Spring IoC Container...\n");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        System.out.println("\nContainer Initialized. Retrieving Bean...\n");
        
        BookService service = (BookService) context.getBean("bookService");
        service.manageLibrary();
    }
}