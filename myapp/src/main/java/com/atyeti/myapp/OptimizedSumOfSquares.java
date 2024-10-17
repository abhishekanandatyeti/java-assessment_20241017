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
        return 0;
    }
}

After Re-writing the above code by using mathematical formula of sum of squares:

public class SumOfNaturalNumber5  
{   
  static int sumOfNaturalNumbers(int n)   
  {   
    return n * (n + 1) / 2;   
  }   
public static void main(String args[])   
  {   
   int n = 5;   
   System.out.println("Sum of Natural Numbers is: "+sumOfNaturalNumbers(n));   
  }   
}   

Time complexity:
>The time complexity of original code:O(n)
>The time complexity of the optimized code is:O(1)

