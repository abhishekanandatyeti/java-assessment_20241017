package com.atyeti.myapp;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {
    
    public void addBook(String title) 
    {
        Arraylist<String> Book=new Arraylist<String>;
        Book.add(title)
    }

    public void displayBooks() 
    {
        for(String i:Book)
        {
            Book.get(i);
        }
    }

    public void borrowBook(String title) 
    {
        Book.remove(title);    
    }

    public void returnBook(String title) 
    {
        Book.add(title)
    }

    public Boolean isBookAvailable(String title)
    {
        for(String i:Book)
        {
            if(i==title)
            {
                retrun true
            }

        }
        return false;
    }
}
