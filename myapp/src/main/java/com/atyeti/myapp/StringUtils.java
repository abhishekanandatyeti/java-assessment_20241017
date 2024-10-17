package com.atyeti.myapp;

public class StringUtils {
   public boolean isPalindrome(String str) {
	        String str1="";
	        for(int i=str.length()-1;i>=1;i--)
	        {
	            str1+=str.charAt(i);
	        }
	        if(str.equalsIgnoreCase(str1))
	        {
	        	return true;
	        }
	        return false;
	    }

    public int countVowels(String str) {
        
    String str1 =str.toUpperCase();
	int count=0;
	char ch[] = str1.toCharArray();
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]=='A'||ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U'||ch[i]=='E')
		{
			count++;
		}
	}
        
        return count;
  
    }
}
