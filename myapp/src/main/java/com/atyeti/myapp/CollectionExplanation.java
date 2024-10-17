package com.atyeti.myapp;
import java.util.HashSet;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.
     */
    public static void main(String[] args) {
        HashSet<String> studentNames = new HashSet<>();
        studentNames.add("Raju");
        studentNames.add("Ravi");
        studentNames.add("Hari");
        studentNames.add("Kiran");
        studentNames.add("Vivek");
        System.out.println(studentNames);
    }

    /*
    - ArrayList:
        ArrayList is a growable array data structure
        It is the subclass of List Interface
        It was introduced in 1.2 Version
        It is index based DS
        It is known for its quick access data nature
        It can have duplicates

    - LinkedList: 
        LinkedList is a growable doubly linkedlist data structure
        It is the subclass of List Interface
        It was introduced in 1.2 Version
        It is node based
        It is known for its quick insertion and deletion
        It can have duplicates

    - HashMap: 
        HashMap is Hashtable data structure like dictionary
        It is the subclass of Map Interface
        It was intoduced in 1.2 Version
        It can store Key- Value pairs
        Keys must be unique
        Values may/maynot be duplicates

    */
}
