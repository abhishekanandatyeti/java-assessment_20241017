package com.atyeti.myapp;

public class OptimizedSumOfSquares {
    public int sumOfSquares(int n) {
        return n * (n + 1) * (2 * n + 1) / 6; // O(1) complexity
    }
}
