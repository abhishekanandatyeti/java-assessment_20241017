package com.atyeti.myapp;

public class OptimizedSumOfSquares {

    //  TIME COMPLEXITY IS O(n)
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }
    //  TIME COMPLEXITY IS O(1)
    public int improvedCalculateSum(int n) {
        return (n*(n+1)*((2*n)+1))/6;
    }
}
