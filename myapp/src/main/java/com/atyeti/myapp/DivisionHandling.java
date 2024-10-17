package com.atyeti.myapp;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a Java program that takes two integers from the user and divides the
first by the second. Implement exception handling to manage 'ArithmeticException' (division by
zero) and 'InputMismatchException' (invalid input). Display a custom error message in each
case.
 */


public class DivisionHandling {
    public double divideNumbers(int a, int b) {
        try
		{
			return a/b;
		}
		catch(ArithmeticException e)
		{
			return "Error:"+e.getMessage();
		}
		catch (InputMismatchException f) {
			return "Error:"+f.getMessage();  
        }  
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
