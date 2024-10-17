package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) {

        String rev="";

        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev))
        return true;
        else
        return false;
    }

    public int countVowels(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            count++;
        }
        return count;
    }
}
