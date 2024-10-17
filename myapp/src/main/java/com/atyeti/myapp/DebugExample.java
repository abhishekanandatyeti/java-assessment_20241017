package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void printNumbersSafely() {
        int [] num={1,2,3,4,5}
        for (int n:num)
        {
            System.out.println(n);
        }


    }

    public static void main(String [] args)
    {
       DebugExample de= new DebugExample();
       de.printNumbers();
       de.printNumbersSafely();
    }
}

/*output:
1
2
3
4
5*/
