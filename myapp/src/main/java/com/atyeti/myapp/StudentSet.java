package com.atyeti.myapp;

import java.util.Set;
import java.util.TreeSet;

public class StudentSet {
    public Set<String> getStudentNames() {
        HashSet<character>students =new HashSet<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        Array.sort(numbers);
       //set dosent store any duicates
       for(int elements:students){
        System.out.println(students.get(elements));//sorting using arrays.sort method which is provided by java.util package
    }
    }
    //******************output----- Alice
                                       Bob
                                       charlie
                                       David             
                                        Eve*/
/*
 1.ArrayList
->it is Resizable array.
-> Implements the List interface.
When you need fast random access to elementss
When the size of the list is relatively stable, and you expect more reads than writes.
Suitable for scenarios where you mostly iterate over the elements.
2. LinkedList
-> Doubly linked list.
->Implements both the List interface  and Deque interfaces.
When you need to frequently insert or remove elements when at the beginning or end of the list.
and When you are dealing with large data sets.
3. HashMap
implementation of Hash table.
Implements the Map interface.
Performance:
When you need to store key-value pairs and require insertions, and deletions.
Suitable when the order of elements is not important as it does not maintain any specific order.
Ideal for sceinarios where you want to access elements by a unique key (like a dictionary in python)