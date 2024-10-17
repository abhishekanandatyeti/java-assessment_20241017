package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {
        int temp;
        for(int i = 0; i<arr.length; i++ )
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-1];
    }

    public int sumDivisibleBy3(int[] arr) {
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%3 == 0)
                sum += arr[i];
        }
        return sum;
    }
}
