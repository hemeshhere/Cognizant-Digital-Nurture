package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // STEP 3 REQUIREMENT: Load context and test
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        BookService service = (BookService) context.getBean("bookService");
        service.manageLibrary();
    }
}