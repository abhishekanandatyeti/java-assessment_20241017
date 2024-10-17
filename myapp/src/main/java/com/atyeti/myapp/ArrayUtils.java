package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {

/*
import java.util.Arrays;
Arrays.sort(arr);
return arr[arr.length-2];
*/
        int max=arr[0];
for(int i=0;i<arr.length;i++){
    if(arr[i]>max)
        max=arr[i];
}
        int secondH=0;
for(int j=0;j<arr.length;j++){
    if(arr[j]>secondH && arr[j]!=max)
        secondH=arr[j];
}
        return secondH;
    }

    public int sumDivisibleBy3(int[] arr) {
       int three=0;

       for(int i=0;i<arr.length;i++){
        if(arr[i]%3==0)
        three+=arr[i];
       }
        return three;
    }
}
