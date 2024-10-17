package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {
        for (int num : arr) {
            if (num > lar) {
                secondLargest = lar; 
                lar = num; 
            } else if (num > secondLargest && num != lar) { 
                secondLargest = num; 
            }
        }

        return secondLargest;
    }

    public int sumDivisibleBy3(int[] arr) {
        int sum=0;
        for(int num:arr)
        {
            if(num%3==0)
            {
                sum+=num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 15, 3, 7, 8, 22, 2, 9, 18};
        findSecondLargest sl = new findSecondLargest();
        System.out.println("Second largest number is: " + s1.findSecondLargest(numbers));
        SumDivisibleBy3 s3 = new SumDivisibleBy3();
    
        System.out.println("Sum of elements divisible by 3 is: " + s3.sumDivisibleBy3(numbers));
    }

}
