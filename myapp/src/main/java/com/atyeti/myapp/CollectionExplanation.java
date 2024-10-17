package com.atyeti.myapp;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.

    HashSet: here is a hasset means duplicates are not alolowed and order is different 

    - ArrayList: it a array which accepts any datatype in the array and it stores and retrive the data easily and duplicates are  allowed and order is differ
    - LinkedList:in the linked list there is a connectinon bewtween the 2 nodes and adress of the previous and other node have a data later here order is same and duplicated are allowed and  order is differhere 
    and here is there less time compliexity compare to the other list an there is no any order here
    - HashMap:  here there is a key and value pair in the hashmap and have duplicates keys ar not and alllowed and duplicates values are allowed and here is same order and get the values easily with the help of the other data structures by using the key and vlaues pairs


    */
   HashSet<String> hs=new HashSet<String>();
        hs.add("sai");
        hs.add("safi");
        hs.add("sawi");
        hs.add("sadi");
        hs.add("sagi");
        hs.add("sagi"); # here sagi is not excuted becasue it is a duplicte...
    System.out.println(hs);


}
