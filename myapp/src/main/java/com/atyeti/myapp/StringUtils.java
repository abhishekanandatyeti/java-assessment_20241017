package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) {
        boolean status = false;
        int start = 0;
        int end = str.length()-1;
        while( start<end )
        {
            if( str[start] == str[end] )
            {
                status = true;
                start++;
                end--;
            }else {
                status = false;
                start++;
                end--;
            }

        }
        if(status == true){
            return true;
        }
        return false;
    }

    public int countVowels(String str) {
        int count = 0;
        for( int i = 0 ; i<str.length() ; i++ )
        {
            if(str[i] = "a" || str[i] == "e" || str[i] == "i" || str[i]=="o" || str[i]=="u")
            {
                count = count+1;
            }
        }
        return count;
    }
}
