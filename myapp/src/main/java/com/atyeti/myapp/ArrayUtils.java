package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            if(arr[i]>secondlargest && secondlargest!=largest){
                secondlargest=arr[i];
            }
        }

        return secondlargest;
    }




    public int sumDivisibleBy3(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
