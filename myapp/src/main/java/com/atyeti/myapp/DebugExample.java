package com.atyeti.myapp;

public class DebugExample {
    public void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
    /*
    
->Follow-up Question: What would be the output of the corrected code?

Output:
    1
    2
    3
    4
    5


->Follow-up Question: Suggest an alternative way to loop through the array to avoid such
issues in the future.

Answer:

We can use for-each loop like shown below

for(int num:numbers){
System.out.println(num);
}


*/

    public void printNumbersSafely() {

}
