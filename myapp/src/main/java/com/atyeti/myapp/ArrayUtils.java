package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {
        int store;
        for(int i=0; i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                store=arr[i];
                arr[i]=arr[j];
                arr[j]=store
            }
          }
        }
        return arr.length-2;
    }
}

return a[total-2];  

    public int sumDivisibleBy3(int[] arr) {
        int sum;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                sum+=arr[i];
            }
        }
        return 0;
    }

