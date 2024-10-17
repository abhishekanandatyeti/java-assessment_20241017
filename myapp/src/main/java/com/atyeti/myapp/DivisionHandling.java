package com.atyeti.myapp;

import java.util.Scanner;

/**
 * Write a Java program that takes two integers from the user and divides the
first by the second. Implement exception handling to manage 'ArithmeticException' (division by
zero) and 'InputMismatchException' (invalid input). Display a custom error message in each
case.
 */
public class DivisionHandling {
    public double divideNumbers(int a, int b) 
    {
        try
        {
        	double divide=a/b;
        }
        catch(Exception e)
        {
        	System.out.println("Either arthimetic exception or input missmatch exception occur");
        }
        return 0;


        /* 
            1-here in the first test case there is a inputmissmatch it means a user type any string in the output it would be raise on array is inputmussmatch
            2- here in the second case there is arthimeticxception occur and the output would be more showimg error without any disturbance.
        
        */
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        DivisionHandling dh = new DivisionHandling();
        System.out.println("Result: " + dh.divideNumbers(num1, num2));

    }
}
