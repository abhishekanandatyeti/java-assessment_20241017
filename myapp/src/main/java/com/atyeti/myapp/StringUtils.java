package com.atyeti.myapp;
import java.util.*;
public class StringUtils {
    public boolean isPalindrome(String str) {
        for(int i = str.length()-1; i >= 0 ; i--) 
        {
            String revStr = revStr.append(str.charAt(i));  //To store reversed string
        }
        if(str.equalsIgnoreCase(revStr.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public int countVowels(String str) {
        int count = 0;
        str = str.toUpperCase();
        for(int i=0;i<=str.length();i++)
        {
            if(charAt[i] == 'A' || char[i] == 'E' || char[i] == 'I' || char[i] == 'O' || char[i] == 'U')
                count++;
        }
        return count;
    }
}
