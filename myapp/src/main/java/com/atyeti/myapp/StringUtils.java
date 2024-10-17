package com.atyeti.myapp;

import java.util.Objects;

public class StringUtils {
    public boolean isPalindrome(String str) {
        String reversed="";

        for(int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }

        if(reversed==str){
            return true;
        }
        return false;
    }

    public int countVowels(String str) {

        int count = 0;
        for(int i=0;i<str.length();i++){
         if(str.charAt(i) == 'a' ||
            str.charAt(i) == 'e' ||
            str.charAt(i) == 'i' ||
            str.charAt(i) == 'o' ||
            str.charAt(i) == 'u'
         ){
             count++;
         }

        }
        return count;
    }
}
