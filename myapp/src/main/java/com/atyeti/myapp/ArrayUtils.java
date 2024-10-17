package com.atyeti.myapp;

public class ArrayUtils {
    public int findSecondLargest(int[] arr) {
              int largest = -1;//storimg minimam value in larges
        int secondLargestElement = -1;// storing minimum vlaue in secondLargest
          for (int number : arr) { //itrating the array
            // Update largest and second largest accordingly
            if (number > largest) {
                secondLargestElememt = largest;  // Update second largest
                largest = num;            // Update largest
            } else if (number > secondLargestElement && num != largest) {
                secondLargestElement = num;      // Update second largest only if it's less than largest element
            }
    }//*******input 1,2,3,4,5,6****output 5 */

    public int sumDivisibleBy3(int[] arr) {
        int sumofElements=0;//initialize 
        for(elements:arr){
            if(elements % 3==0){//Checking elements are divisivle by 3
                sumOElements+=elements;// if divisible the 3 then add to sum Of Elements
            }
        }
        return sumOfElemnts;
    }
}//input 1,2,3,4,6********output 9
