package com.digitalnurture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.error("This is an error message - Something critical failed!");
        logger.warn("This is a warning message - Something unexpected happened, but we can recover.");
        logger.info("This is an info message - Just letting you know the application is running.");
    }
}