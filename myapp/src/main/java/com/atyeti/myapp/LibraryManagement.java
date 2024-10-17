package com.atyeti.myapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {

    // Implementing the LibraryManagement System
    String title;
    String Author;
    int ISBN ;
    ArrayList<LibraryManagement>MyLibrary = new ArrayList<>();


    public void addBook(LibraryManagement b) {
        b.addBook(b); // so this will add the all book objects into the arraylist
    }

    public void displayBooks() {
        System.out.println(MyLibrary.toString());
    }

    public void borrowBook(String title) {
        if(isBookAvailable()){
            MyLibrary.remove(title);
            System.out.println("Book Borrowed successfully");
        }


    }

    public void returnBook(String title) {
        MyLibrary.add(title);
        System.out.println("Book Returning successfully");
    }

    public Boolean isBookAvailable(String title) {
        if(MyLibrary.contains(title))
        {
            return true;
        }
        return false;
    }
}
