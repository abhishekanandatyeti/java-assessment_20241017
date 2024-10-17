package com.atyeti.myapp;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {
    private String title;
    private String author;
    private String isbn;

    public LibraryManagement(){
        title="Java";
        author="oracle";
        isbn="385643fd96";
    }
    public LibraryManagement(String title, String author, String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
     public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void addBook(String title) {
        
    }

    public void displayBooks() {
        System.out.println("title"+title+"author"+author+"isbn"+isbn)
    }

    public void borrowBook(String title) {
        
    }

    public void returnBook(String title) {
        
    }

    public Boolean isBookAvailable(String title) {

        return false;
    }
}
