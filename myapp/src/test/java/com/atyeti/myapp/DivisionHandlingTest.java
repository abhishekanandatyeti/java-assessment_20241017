package com.atyeti.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionHandlingTest {
    @Test
    public void testDivision() {
        DivisionHandling dh = new DivisionHandling();
        assertEquals(2.0, dh.divideNumbers(4, 2), 0.0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        DivisionHandling dh = new DivisionHandling();
        dh.divideNumbers(4, 0);
    }
}
