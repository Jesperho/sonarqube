package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    // Create a logger instance
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Running as: Jesper Niklas");
            logger.info(String.format("Result of addMe(12, 4): %d", addMe(12, 4)));
            logger.info(String.format("Result of subtractMe(12, 4): %d", subtractMe(12, 4)));
        }
    }

    // Method to add two integers and return the result immediately
    public static int addMe(int a, int b) {
        return a + b;  // Directly return the sum without using a temporary variable
    }

    public static int subtractMe(int a, int b) {
        return a - b;  // Directly return the sum without using a temporary variable
    }
}
