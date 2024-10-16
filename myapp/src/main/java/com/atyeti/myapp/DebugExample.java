package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) { // Corrected loop condition
            System.out.println(numbers[i]);
        }
    }

    public void printNumbersSafely() {
        for (int num : new int[]{1, 2, 3, 4, 5}) {
            System.out.println(num);
        }
    }
}
