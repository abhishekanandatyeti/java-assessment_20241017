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
        // Using the mathematical formula for sum of squares
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        // Test with n = 10
        System.out.println(improvedCalculateSum(10));
        //Output: 385
    }

    /*
    Time Complexity:
    Loop-based approach: O(n) — It loops from 1 to n, performing n additions.
    Formula-based approach: O(1) — The sum is calculated in constant time, regardless of the size of n.
    */
}
