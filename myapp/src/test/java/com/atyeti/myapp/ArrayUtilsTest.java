package com.atyeti.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilsTest {

    @Test
    public void testFindSecondLargest() {
        ArrayUtils utils = new ArrayUtils();
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(40, utils.findSecondLargest(arr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindSecondLargestWithInvalidArray() {
        ArrayUtils utils = new ArrayUtils();
        int[] arr = {10};  // Only one element, should throw exception
        utils.findSecondLargest(arr);
    }

    @Test
    public void testSumDivisibleBy3() {
        ArrayUtils utils = new ArrayUtils();
        int[] arr = {3, 6, 9, 12, 15};
        assertEquals(45, utils.sumDivisibleBy3(arr));
    }

    @Test
    public void testSumDivisibleBy3WithNoDivisibleElements() {
        ArrayUtils utils = new ArrayUtils();
        int[] arr = {1, 2, 4, 5};
        assertEquals(0, utils.sumDivisibleBy3(arr));
    }
}
