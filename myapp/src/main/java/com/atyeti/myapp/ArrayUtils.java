package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {

        /*
         * Arrays.sort(arr);
         * return arr[arr.length-2];
         * 
         */
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[1];
    }

    public int sumDivisibleBy3(int[] arr) {
        int sum= 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%3==0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
