package com.atyeti.myapp;

public class    OptimizedSumOfSquares {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i*i;
        }
        return sum;
    }

    public int improvedCalculateSum(int n) {
        int sum=n*(n+1)*(2*n+1)/6;

        return sum;
    }
}

//The formula used is n*(n+1)*(2n+1)/6

//The previous code is having time complexity of O(n) as it is using for loop
// in the optimized code as we have used the formula the time complexity eill be O(1).
