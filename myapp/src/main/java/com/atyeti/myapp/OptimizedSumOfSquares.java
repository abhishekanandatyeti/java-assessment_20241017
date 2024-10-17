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
        public class SumOfSquares {
    public static int calculateSum(int n) {
        return (n *(n + 1)*(2 * n + 1))/ 6; // maths formula
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(input)); 
        // if input will 10 then This will output 385
    }
    }
}
//time complixity of given code o(n)because it will iterated by loop
//time complixity of my code will be o(1) because it dosent iterated we use math equation