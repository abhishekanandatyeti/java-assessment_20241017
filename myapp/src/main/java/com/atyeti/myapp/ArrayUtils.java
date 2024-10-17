package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) 
    {
        int imax=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>imax)
            {
                int temp=arr[i];
                arr[i]=imax;
                imax=temp;
            }
        }
        int secondLarget=arr[1];
        return secondLargest;
    }

    public int sumDivisibleBy3(int[] arr)
     {
        int sum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]%3==0)
            {
                sum1=sum1+arr[i];
            }
        }
        return sum1;
    }
}
