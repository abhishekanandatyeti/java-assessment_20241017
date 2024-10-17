package com.atyeti.myapp;

import java.util.Collections;
import java.util.HashSet;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.
     */

    // Writing the code for adding the 5 students and displaying the students into the hashset

    // Hashset Created with name myset;
    HashSet<String> myset = new HashSet<String>();

    // Creating function for adding and displaying the students present in the hashset

    // insert
    public void Insert(String studentName){
        myset.add(studentName);
    }
    // displaying the studentname
    public void Display(){
        System.out.println( myset.toString() );
    }

    /* Difference Between
    - ArrayList:
    - LinkedList:
    - HashMap:

    ArrayList
    -> Arraylist it is just the collection of the elements with
    multiple dataTypes . it is contineous block memory storage process
    -> Arraylist can store elements of multiple data types
    -> Arraylist is the advance version of arrays
    -> Arraylist take least Meomry as compare to the LinkedList
    -> Arraylist also store the objects

    LinkedList :
    -> Linkedlist it is type of data-structure which we use to store the data
    -> Each Linkedlist Element have three members : 1) data , 2) next Pointer
    -> LinkedList are two types 1) singly linkedlist 2) Doubly-Linkedlist
    -> Linkedlist takes the addition space to store the address of the next pointers
    -> Linkedlist is non-contigeous memory block and this blocks are connected with
    each other by next pointers
    -> Iteration on LinkedList is sometime become tedious when there is multiple blocks
    are connected to each other finding the perticular elements require much time

    Hashset :
    -> Hashset it also the collection of the elements with same data types
    -> each block have the separeate hashset
    -> searching in hashset is easy as compare to Linkedlist
























    */




}
