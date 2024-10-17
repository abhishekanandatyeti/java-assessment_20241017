package com.atyeti.myapp;

public class ArrayUtils 
{
    int max=0;
    int secondMax=0;
    int sum=0;
    public int findSecondLargest(int[] arr) 
    {
       // Arrays.sort(arr);
       
      
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
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


      for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%3==0)
            {
                sum+=arr[i];
            }
        }

        return sum;
    }


   
}
