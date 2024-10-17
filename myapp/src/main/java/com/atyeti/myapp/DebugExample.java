package com.atyeti.myapp;

    Changes are made

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

         After writing the correct code:

    public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i <= numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }
    }
    
    Suggest an alternative way to loop through the array to avoid such
                 issues in the future:

    public void printNumbersSafely() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num:number) {
            System.out.println(num);
        }

    }
}
