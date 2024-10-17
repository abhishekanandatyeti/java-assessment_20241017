package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        /*  GIVEN CODE
         * int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        } 
        *
        */

        // CORRECT CODE
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void printNumbersSafely() {
        // TO AVOID THOSE PROBLEMS WE CAN USE FOR EACH LOOP (ALTERNATIVE WAY)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i: numbers) {
            System.out.println(i);
        }
    }
}
