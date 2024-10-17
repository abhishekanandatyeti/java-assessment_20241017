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
        return (n*(n+1)*(2*(n+2)))/6;
    }
    public static void main(String [] args)
    {
        int n=12;
        OptimizedSumOfSquares num= new OptimizedSumOfSquares;
        System.out.println("sqaures"+calculateSum(n));
        System.out.println("calculate sum" + improvedCalculateSum(n));

    }
}
