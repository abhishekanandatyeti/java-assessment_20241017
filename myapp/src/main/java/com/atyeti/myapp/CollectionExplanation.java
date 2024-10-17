package com.atyeti.myapp;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.
     */
    /*
    - ArrayList: it is used to store the data according to index ,it accepts dulplicates,
    arraylist is best for fetching the data .
    - LinkedList: 
    it is used for searching of data.
    - HashMap: Hashmap is based on the Key , and Value in which key must be unique and value may be duplicate.
    is is used for storing the group of object.
    
    */

   public static void main(String args[])
   {
    StudentSet s=new StudentSet();
    s.getStudentNames();
   }
}
