package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        System.out.println("--- Booting Library Application ---");
        
        // Load the IoC container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // Retrieve the fully wired bean
        BookService service = (BookService) context.getBean("bookService");
        
        // Test it
        service.manageLibrary();
    }
}