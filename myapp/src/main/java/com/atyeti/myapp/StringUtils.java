package com.atyeti.myapp;

public class PalindromeString    
{    
    public static void main(String[] args) {    
        String string = "Madam";    
        boolean flag = true;    
        string = string.toLowerCase();    
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else
        {
            System.out.println("Given string is not a palindrome");
        }




    
public class  Main{
    public static void main(String[] args) {
		String s = "Atyeti";
		char[] c = s.toCharArray();
		int vowel=0;
	    for (int i = 0; i < s.length(); i++) { 
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
            vowel++; 
		}
    System.out.println("Vowels: " + vowel);
    }
}
    

