package com.atyeti.myapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("racecar"));
        assertTrue(utils.isPalindrome("A man a plan a canal Panama")); // Spaces and case-insensitive
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("a"));
    }

    @Test
    public void testCountVowels() {
        StringUtils utils = new StringUtils();
        assertEquals(5, utils.countVowels("aeiou"));
        assertEquals(2, utils.countVowels("hello"));
        assertEquals(0, utils.countVowels("bcdfghjklmnpqrstvwxyz"));
    }

    @Test
    public void testCountVowelsWithEmptyString() {
        StringUtils utils = new StringUtils();
        assertEquals(0, utils.countVowels(""));
    }
}
