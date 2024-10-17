package com.atyeti.myapp;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class LibraryManagement 
{
    ArrayList<String>books=ArrayList<>();
    String borrowed_book="";
    
    public void addBook(String title) {
        books.add(title);
        System.out.println("Book  added succesfully..")
    }

    public void displayBooks() {
        books.forEach(x->System.out.println(x));
    }

    public void borrowBook(String title) 
    {
        if(books.contains(title))
        {
           System.out.println("book borrowed succesfully.");
           borrowed_book+=title;
        }
        else{
            System.out.println("book not available.");

        }
    }

    public void returnBook(String title) 
    {
       if(title.equals(borrowed_book)) 
       {
         System.out.println("book returned succesfully.");
       }
    }

    public Boolean isBookAvailable(String title) 
    {
      if(books.contains(title))
      {
        return true;
      }
        return false;
    }

    public static void main(String args[])
    {
        
    }
}
