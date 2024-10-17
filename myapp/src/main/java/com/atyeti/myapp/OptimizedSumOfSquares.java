package com.atyeti.myapp;

public class OptimizedSumOfSquares {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }

    public int improvedCalculateSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(i);
        }
        return sum;
    }
}
