package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("This is a palindrome");
            return true;
        } else {
            return false;
        }
    }


    public int countVowels(String str) {
        char[]Vowels={"a","e","i","o","u"}
        int count=0;;
        for (int i=0;i<str.length;i++) {
           char add = str.charAt(i);
        }
        for(int i=0; i<str.length;i++){
            if(add==Vowels){
                count++;
                break;
            }
        }
        return count;
    }
}
