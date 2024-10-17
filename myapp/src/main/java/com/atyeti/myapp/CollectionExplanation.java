package com.atyeti.myapp;
import java.util.*;
import java.util.HashSet;
import java.util.Collections;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.

     */
    public static void main(String [] args) 
    { 
         
        HashSet<String> student = new HashSet<String>(); 

        student.add("revathi"); 
        student.add("chandra"); 
        student.add("tanuja"); 
        student.add("ram"); 
        student.add("raju");
  
        System.out.println("Original HashSet: "+ student); 
  
    
        List<String> list = new ArrayList<String>(student); 
        Collections.sort(list); 
  

        System.out.println("HashSet elements in sorted order using List: "+ list); 
    } 
}
    /*
    - ArrayList: it is a java class used to store the list of the object and it is resizeble array
    When you need fast random access to elements using their index.
    - LinkedList: It is dynamic data structure where the size is increase and decreases remove the elements in the array
    When you need to frequently insert and delete elements, especially from the beginning or end of the list.
    - HashMap:  hash map is stores the data from key value pair   and access them by index
    When you need to store data in key-value pairs and require fast access to values based on keys.
    */

