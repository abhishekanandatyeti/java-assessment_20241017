package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) throw new IllegalArgumentException("Array must have at least 2 elements.");
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public int sumDivisibleBy3(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 3 == 0) sum += num;
        }
        return sum;
    }
}
