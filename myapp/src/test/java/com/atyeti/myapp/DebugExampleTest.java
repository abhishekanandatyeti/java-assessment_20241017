package com.atyeti.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class DebugExampleTest {

    @Test
    public void testPrintNumbers() {
        DebugExample example = new DebugExample();
        example.printNumbers();  // Should print numbers 1 to 5 correctly

        example.printNumbersSafely();  // Should also print numbers 1 to 5 safely
    }
}
