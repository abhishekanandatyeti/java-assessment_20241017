package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) {
        String s1="";
        String s2="";
        for(int =0;i<=<str.length();i++)
        {
            if(str.charAt(i)!= ' ')
            {
                s1+=i;
            }
        }
        for(int i=0;i<s1.length();i++)
        {
            s2+=i;
        }
for(int i=0;i<s1.length();i++)
{
    if(s1.charAt(i)!=s2.charAt(i))
        return false;
}

        return true;
    }

    public int countVowels(String str) {
        int count=0;
        for(nt i=0;i<str.length();i++)
        {
            if(str.charAt(i)=="a"||str.charAt(i)=="e"||str.charAt(i)=="i"||str.charAt(i)=="o"||str.charAt(i)=="u")
            {
                count++;
            }
        }


        return count;
    }
     public static void main(String [] args)
     {
        StringUtils s= new StringUtils();
        String s3="revathichandra";
        System.out.println("palindrome"+s.isPalindrome(s3));
        System.out.println("count vowel" +s.countVowels(s3));        
     }
}
