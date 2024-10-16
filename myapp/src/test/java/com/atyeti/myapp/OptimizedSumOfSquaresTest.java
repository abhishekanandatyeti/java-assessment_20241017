package com.atyeti.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class OptimizedSumOfSquaresTest {

    @Test
    public void testSumOfSquares() {
        OptimizedSumOfSquares sum = new OptimizedSumOfSquares();
        assertEquals(385, sum.calculateSum(10));  // Sum of squares from 1 to 10: 1^2 + 2^2 + ... + 10^2
        assertEquals(385, sum.improvedCalculateSum(10));
    }

    @Test
    public void testSumOfSquaresForSmallN() {
        OptimizedSumOfSquares sum = new OptimizedSumOfSquares();
        assertEquals(1, sum.calculateSum(1));  // For n = 1, sum = 1
        assertEquals(5, sum.calculateSum(2));  // 1^2 + 2^2 = 5
        assertEquals(1, sum.improvedCalculateSum(1));  
        assertEquals(5, sum.improvedCalculateSum(2));
    }
}
