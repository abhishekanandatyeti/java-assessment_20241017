package com.atyeti.myapp;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {
    private String title;
    private String author;
    private String isbn;

    public LibraryManagement(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addBook(String title) {

    }

    public void displayBooks() {
        
    }

    public void borrowBook(String title) {
        
    }

    public void returnBook(String title) {
        
    }

    public Boolean isBookAvailable(String title) {
        return false;
    }
}
