package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {

        int max=Integer.Min_value;
        int secondlarges = Integer.Min_value;



        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondlargest=max;
                max=arr[i];
            }

            if(arr[i]>secondlarges && arr[i] != max){
                secondlarges=arr[i];
            }
        }
        System.out.println("The second largest no is:"+secondlarges)
        return secondlarges;
    }

    public int sumDivisibleBy3(int[] arr) {


        int sum=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                sum +=arr[i];
            }
        }

        System.out.println("The sum of array is divisible by 3 is:"+sum);


        return sum;
    }
}
