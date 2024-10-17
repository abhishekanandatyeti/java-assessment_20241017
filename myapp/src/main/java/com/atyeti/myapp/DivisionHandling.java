package com.atyeti.myapp;

import java.util.Scanner;

/**
 * Write a Java program that takes two integers from the user and divides the
first by the second. Implement exception handling to manage 'ArithmeticException' (division by
zero) and 'InputMismatchException' (invalid input). Display a custom error message in each
case.
 */

 



import java.util.InputMismatchException;
import java.util.Scanner;
class ExceptionHnadling extends Exception
{
	public ExceptionHnadling(String msg)
	{
		super(msg);
	}
}
class DivisionHandling {
    public double divideNumbers(int a, int b) throws ExceptionHnadling {
        // Exception Handling 
    	double c=0;
        try
        {
              c = a/b;
        }
        catch(ArithmeticException e1)
        {
             throw new ExceptionHnadling("Dont divide by Zero");
        }
        catch( InputMismatchException e1)
        {
        	throw new ExceptionHnadling("Invallid");
        }

        return c;
    }

public class DivisionHandling {
	
	

	    public static void main(String[] args) throws Exception {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two integers:");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();

	        
	        


	        DivisionHandling dh = new DivisionHandling();
	        System.out.println("Result: " + dh.divideNumbers(num1, num2));
	  
	    }
	}

}
	
	
