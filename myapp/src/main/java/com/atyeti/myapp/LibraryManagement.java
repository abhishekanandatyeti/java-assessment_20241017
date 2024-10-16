package com.atyeti.myapp;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {
    private Map<String, Boolean> books = new HashMap<>();

    public void addBook(String title) {
        books.put(title, true);
    }

    public void displayBooks() {
        books.forEach((title, available) -> System.out.println(title + " (Available: " + available + ")"));
    }

    public void borrowBook(String title) {
        if (books.containsKey(title) && books.get(title)) {
            books.put(title, false);
            System.out.println("You've borrowed: " + title);
        } else {
            System.out.println("Book is unavailable.");
        }
    }

    public void returnBook(String title) {
        if (books.containsKey(title)) {
            books.put(title, true);
            System.out.println("You've returned: " + title);
        } else {
            System.out.println("Book not found.");
        }
    }

    public Boolean isBookAvailable(String title) {
        return books.containsKey(title) && books.get(title);
    }
}
