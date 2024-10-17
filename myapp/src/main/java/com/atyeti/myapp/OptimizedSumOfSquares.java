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
        int x=n*(n+1)*(2*n+1)/6;
        return x;
    }

    /*
    Follow-up Question: What is the time complexity of the original code vs. the optimized
version?

Time complexity mostly depends on the input but we can write the efficient code to reduce Space and Time complexity.

1) In CalculateSum(Method) we used a loop which means it iterates 'n' number of times until the condition reaches 
   0 (or) base case which takes longer time for Operating System and Takes longer Time.

2) In improvedCalculateSum(method) we used a formula which means it iterates only once so Operating System don't 
   require More time as  compared with CalculateSum(Method).

   CalculateSum(Method) time complexity : O(n^2)    Big O of square because of i,sum.

   improvedCalculateSum(method) time complexity : O(1)  Big O of one because of x.




*/
}
