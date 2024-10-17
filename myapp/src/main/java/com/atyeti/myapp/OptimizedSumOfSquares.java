package com.atyeti.myapp;

public class OptimizedSumOfSquares {

    public static int calculateSum(int n) {
        int sum=(n * (n + 1) * (2 * n + 1)) / 6;
        return sum;
        #in the begining theere is a for loop so the time complxinty is o(n)
        so now the time complexity is o(1) so thats why i used logic instead of the for loop
    }

    public int improvedCalculateSum(int n) {
        return 0;
    }
}
