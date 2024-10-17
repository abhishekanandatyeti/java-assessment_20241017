package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) {

       //char b[] = str.toCharArray();
        String ch="";

        for(int i=str.length-1;i>=0;i--){
            ch +=str[i];

        }
        if(ch.equals(str)){
            System.out.println("The string is palindrom");
           ch= ch.strip();
            System.out.println(ch);
        }else{
            System.out.println("The string is not palindrom");
        }




        return false;
    }

    public int countVowels(String str) {
     int count=0;
        for(int i=0;i<str.length;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
                    str.charAt(i)=='o' || str.charAt(i)=='u' ){
                System.out.println(str.charAt(i));
                count++;
            }
        }
        System.out.println("The count of string is:"+count);


        return 0;
    }
}
