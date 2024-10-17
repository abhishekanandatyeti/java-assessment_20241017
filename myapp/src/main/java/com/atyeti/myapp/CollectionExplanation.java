package com.atyeti.myapp;

public class CollectionExplanation {
    /*
        Write a Java program to store and display the names of 5 students using a
        'HashSet'. The names should be stored in sorted order without duplicates.

     */
    HashSet<String> h1 = new HashSet<>();
		    Scanner sc = new Scanner(System.in);
		    for(int i=0;i<5;i++)
		    {
		      System.out.println("Enter the Name :");
		      String Name= sc.nextLine();
		      h1.add(Name);
		    }
		  
		    
		   for(int i=0;i<h1.size();i++)
		   {
			   for(int j=i+1;j<h1.size();j++)
			   {
				  
			   }
		   }
	    //Displaying the Name : 	    
        System.out.println("5 Names are .");
	   h1.forEach(x->System.out.println(x));
    /*

    - ArrayList: 
                 ArrayList is Data Structure of Java it comes Under the List interface 
                 ArrayList come in Java 1.2 version 
                 ArrayList is Working on indexs 
                 ArrayList Accepts Duplicate and Null Objects 
                 *ArrayList is mainly used for fetching the Object Data .;
                  it Extends with AbstractList Class and iplemts with List


    - LinkedList: 
                  Linked is a classs is also comes under the List interface it also come in java 1.2 version
                  Linked is also accepting Duplicate and it is a dynamically growable lengt
                  Limked list in interconnect with linking each other 
                  so the it Mainly used for Searching and insertion of elements 
                  it Extends with AbstractList Class and iplemts with List
    - HashMap: 
                the above two data structures are used for the dealing with the Single Objects 
                So we need to deal with two objects we have a HashMap Class 
                it comes in java 1.2 versions 
            it works on key- value pairs 
    */

}
