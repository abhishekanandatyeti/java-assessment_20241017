package com.atyeti.myapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionHandling {
    public double divideNumbers(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed.");
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter two integers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            DivisionHandling dh = new DivisionHandling();
            System.out.println("Result: " + dh.divideNumbers(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers.");
        }
    }
}
