package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i <= numbers.length-1; i++) {
            System.out.println(numbers[i]);
        }
    }

    public void printNumbersSafely() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    /*  alternative way to loop through the array to avoid such
    issues in the future.

     */

    public void alternative_way () {
        List<Integer> list = new arraylist<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(Integer a:list){
            Ststem.out.println(a);
        }
    }


}
