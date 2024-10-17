package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    //Index 5 out of bounds for length 5
    //in the above program we are starting loop with 1 and it equals with length


    public void printNumbersSafely() {
      
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

    }   // its correct
}
