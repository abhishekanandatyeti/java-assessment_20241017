package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) {
        // Initialize two variables one at the start and one at the end
        int left = 0;
        int right = str.length() - 1;
        // Check if characters from both the ends are the same are not
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true;//if above conditions fails return true
        }
        //input mam ----output mam true----
    
    public int countVowels(String str) {
       // Converting the string to lowercase to handle both uppercase and lowercase vowels of a string
        str = str.toLowerCase();
        int countOfVolwes=0;//initialize the countOfVowels to stote the count of volwes        
        // Loop through each character in the string
        for (int i=0;i <str.length();i++) {
            char eachChararcter = str.charAt(i);
            // Check if the character is a vowel
           if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') {
                CountOfVowels++;
           }
        }
     return CountOfVowels;//returning count of variables
    }

//********input althaf    output----2 */