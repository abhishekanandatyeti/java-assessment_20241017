package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void printNumbersSafely() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

/*
  the output of the corrected code is
  1
  2
  3
  4
  5
*/
