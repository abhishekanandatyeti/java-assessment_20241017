package com.atyeti.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class OptimizedSumOfSquaresTest {

    @Test
    public void testSumOfSquares() {
        OptimizedSumOfSquares sum = new OptimizedSumOfSquares();
        assertEquals(385, sum.sumOfSquares(10));  // Sum of squares from 1 to 10: 1^2 + 2^2 + ... + 10^2
    }

    @Test
    public void testSumOfSquaresForSmallN() {
        OptimizedSumOfSquares sum = new OptimizedSumOfSquares();
        assertEquals(1, sum.sumOfSquares(1));  // For n = 1, sum = 1
        assertEquals(5, sum.sumOfSquares(2));  // 1^2 + 2^2 = 5
    }
}
