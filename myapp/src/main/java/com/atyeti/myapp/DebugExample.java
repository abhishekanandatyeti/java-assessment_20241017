package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
//        in this code the indexing is starting from 1 as array in java starts from 0
//        To fix this we use indexing from 0 and use the < operator
//        so that it will print all elements from the array

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void printNumbersSafely() {
        int[] numbers ={1,2,3,4,5};
    for(int i=0; i<numbers.length;i++){
        System.out.println(numbers[i]);
    }
    }
}

// An alternative way to loop through is to use for each loop and also along woth the
// stream api provided by java 8.

