package com.atyeti.myapp;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.
     */
    /*
    - ArrayList:ArrayList is implemented using a dynamic array, offering fast access to elements based on index.
      >However, inserting or deleting elements in the middle requires shifting elements, impacting performance.
      >ArrayList consumes contiguous memory for elements, potentially leading to wasted space if the initial capacity is too high. 
     
    - LinkedList: LinkedList shines in scenarios with frequent insertions and deletions but can be slower for access operation.
       >In contrast, LinkedList uses nodes with references to the next and previous elements, making it efficient for frequent insertions and deletions in the middle but slower for random access due to traversal.
       >LinkedList uses more memory per element due to node overhead but can adapt dynamically to memory needs.

    - HashMap:HashMap provides fast access for key-based retrieval and is ideal for mapping keys to values efficiently.
       >HashMap stores key-value pairs and offers constant-time complexity for basic operations like put, get, and remove. 
       >It uses hashing to map keys to indices in an array, providing efficient retrieval.
        
    */
}
