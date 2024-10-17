package com.atyeti.myapp;

public class ArrayUtils {

    public static int findSecondLargest(int[] arr) {

        // finding the second larget element in the array
        /*
        * approch : sorting the array ( For BruteForce aplying the sort )
        * returning the 2nd largest
        *  */

        for(int i = 0 ; i <arr.length-1 ; i++){
            for(int j = 0 ;j<arr.length-1 ; j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }

    public int sumDivisibleBy3(int[] arr) {

        int sum = 0 ;
        for(int i = 0 ; i<arr.length ; i++)
        {
            if( arr[i]%3 == 0 )
            {
                sum = sum+arr[i];
            }
        }

        return sum;
    }
}
