package com.atyeti.myapp;

public class StringUtils {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		char[] chArr = str.toCharArray();
		for(char ch: chArr) {
			if(ch==' ') {
				continue;
			}
			sb.append(ch);
		}
		StringBuilder sb2 = new StringBuilder(sb.reverse());
        if(sb2.equals(sb)){
            return true;
        }
        return false;
    }

    public int countVowels(String str) {
        int count = 0;
        char[] ch = str.toLowerCase().toCharArray();
        for(char c: ch){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        return count;
    }
}
