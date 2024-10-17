package com.atyeti.myapp;

import java.util.HashMap;
import java.util.Map;

public class LibraryManagement {
    ArrayList<String> Books = new ArrayList<>();
	 Scanner sc = new Scanner(System.in);
	    public void addBook(String title) {
	        Books.add(title);
	    }

	    public void displayBooks() {

	        System.out.println("Books in Our LibraryMangement .");
	       Books.forEach(x->System.out.println(x));
	          
	    }

	    public void borrowBook(String title) {
	    	if(isBookAvailable(title))
	    	{
	    		System.out.println("Hii Welcome to the Our Library..");
	    		System.out.println("plz Enter Your Good Name ");
	    		String name =sc.nextLine();
	    		System.out.println("Enter Your Conatact Number ");
	    		long number= sc.nextInt();
	    		
	    		System.out.println("Thank you for Sharing Your details with us");
	    		System.out.println("Mr."+name+"Contact Number"+number+" "+title+" Book issued Sucessfully Thank You Visit Again");
	    		
	    	}
	    	else
	    	{
	    		 System.out.println("Sorry "+title+" is Not Available");
	    	}
	        
	    }

	    public void returnBook(String title) {
	    	
	        System.out.println("Thank You for returning the Book : "+title);
	    }

	    public boolean isBookAvailable(String title) {
	    	if(Books.contains(title))
	    	{
	    		return true;
	    	}
	        return false;
	    }
	}

