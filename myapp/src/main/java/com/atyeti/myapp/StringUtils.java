package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) 
    {
        String k="";
        for(i=str.length-1;i>0;i--)
        {
            k=k+str.chatAt(i);
        }
        if(k==str)
        {
            return true;
        }
        else
        {
            return false;
        }


        return false;
    }

    public int countVowels(String str)
    {
        int vcount=0
        for(int i=0;i<str.length;i++)
        {
            k=str.chatAt(i);
            if(k=='a' || k=='e' ||k='i'||k='o'||k='u')
            {
                vcount=vcount+1;
                retrun vcount;
            }
        }
    }
}
