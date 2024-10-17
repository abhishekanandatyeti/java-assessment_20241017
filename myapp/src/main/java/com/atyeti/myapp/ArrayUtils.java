package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>max)
           {
            max=arr[i];
           }
        }
        int secondMax=0;
         for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>secondMax && arr[i]!=max)
           {
            secondMax=arr[i];
           }
        }

        return secondMax;
    }

    public int sumDivisibleBy3(int[] arr) {
       int sum=0;
        for(int i =0; i<arr.length;i++)
        {
           if(arr[i]%3==0)
           {
            sum+=arr[i];
           }
        }
        return sum;
    }
}
