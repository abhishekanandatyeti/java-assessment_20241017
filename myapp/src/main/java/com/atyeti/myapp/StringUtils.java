package com.atyeti.myapp;

public class StringUtils 
{
    
    public boolean isPalindrome(String str) 
    {
        String new="";
        for(int i=str.length()-1;i>=0;i--)
        {
          
             new+=str.charAt(i);


        }
        if(str.equals(new))
        {
            return true;
        }
        else
        {
            return false;
        }
       
    }

    public int countVowels(String str) 
    {
        //String str1=str.equalIgnorecase()

      int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a' ||str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u'|| str.charAt(i)=='A' ||str.charAt(i)=='E'|| str.charAt(i)=='I' || str.charAt(i)=='O' ||str.charAt(i)=='U')
            {
               count++;
            }
            else{
                count=0;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a String:");
        String s= sc.next();

        System.out.println("The String is palindrome:"+isPalindrome(s));

        System.out.println("the count vowel in string:"+countVowels(s));
    }
}
