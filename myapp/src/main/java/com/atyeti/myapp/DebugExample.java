package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    // output above code : 2 , 3 , 4 , 5
    // it skipping the first index

    public void printNumbersSafely() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
// Out-put of CorrectCode Will be : 1 , 2  , 3 ,4 ,5

// suggesting the alternative method for looping the array
// -> you can use for-in loop
/*

 alternative loop

 

 */

