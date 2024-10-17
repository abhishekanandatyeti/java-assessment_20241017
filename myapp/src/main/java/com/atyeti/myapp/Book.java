package com.atyeti.myapp;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String bookISBN;

    public Book(String bookTitle){
        this.bookTitle = bookTitle;
    }
    
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }

    public String getBookAuthor(){
        return this.bookAuthor;
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }

    public String getBookISBN(){
        return this.bookISBN;
    }
    public void setBookISBN(String bookISBN){
        this.bookISBN = bookISBN;
    }

    public String toString(){
        return "Book[ Title: "+bookTitle+", Author: "+bookAuthor+", ISBN: "+bookISBN+" ]";
    }
}
