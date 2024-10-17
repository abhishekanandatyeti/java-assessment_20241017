package com.atyeti.myapp;

import java.util.ArrayList;

public class LibraryManagement {
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("Book was successfully added");
    }

    public void displayBooks() {
        for(Book b: books){
            System.out.println(b);
        }
    }

    public void borrowBook(String title) {
        for(Book b: books){
            if(b.getBookTitle().equals(title)){
                System.out.println("Successfully Borrowed");
                break;
            }
        }
    }

    public void returnBook(String title) {
        for(Book b: books){
            if(b.getBookTitle().equals(title)){
                System.out.println("Successfully Returned");
                break;
            }
        }
    }

    public Boolean isBookAvailable(String title) {
        for(Book b: books){
            if(b.getBookTitle().equals(title)){
                return true;
            }
        }
        return false;
    }
}
