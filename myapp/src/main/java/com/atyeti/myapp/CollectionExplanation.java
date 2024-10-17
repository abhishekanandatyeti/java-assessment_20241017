package com.atyeti.myapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.
     */
   HashSet<String> set=new HashSet<>();
   set.add("vamshi");
   set.add("altaaf");
   set.add("xaviar");
   set.add("sobani");
   set.add("tanuja");

   ArrayList<String> list=new ArrayList<>(set);
   Collections.sort(list);
   System.out.println(list);


       /*
    - ArrayList: ArrayList is dynamic (no fixed size like array ) so it can store as much as we require.
    
    1)by comparing with Array it don't have fixed length
    2)it stores same datatype in ArrayList like array
    3)it increase size based on formula 3(n-1)/2 


    - LinkedList: It uses node to store the values.

    1) Node starts with head and ends with null
    2) Used for insertion,deletion and updation because of less time complexity.
    3) Node have two column shaped one is called head and other one is address
    4) Head stores element and end stores next element address

    similary LinkedList there are others like Double LinkedList, Circular LinkedList uses Node for operations.

    

    - HashMap: It stores data in the format of Key-Value pair mostly used to assign key to some value like below example:

    roll     name
    101      vamshi
    103      sai
    118      sobani

    By using HashMap, get rid of data Concurrency and easy to excess data based on key (or) value.
    */

}
