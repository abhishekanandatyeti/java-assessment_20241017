package com.atyeti.myapp;

public class OOPConcepts {
    // Explanations of OOP Concepts

    /**
    Inheritance: 
                 Inheritance is a one of the pillar of OOPS Concept
                Definition of Inheritance : Acuring the property of Parent class to the Base class AutoMatically except private and final

                Inheritance is mainly used for Reusablity of Code.

                Types of Inheritance :
                                      1)Single level Inheritance
                                      2) Multi Level Inheritance
                                      3) Hybrid inheritance 
                                      4)Multiple Inheritance(In java at class level Multiple Inheritance is not possible(Diamond  Problem) but at interface level it possible )
         Example of Inheritance : 
           public class Parent
           {
              private String Name;

              public void setName(String name)
              {
                this.name=name;
              }
              public String getName()
              {
                return name;
              }
              //to String
           } 
           class child extends Parent
           {
             private String Name ;

             public void getDetails()
             {
                System.out.println("My name is "+Name +"And my Father Name is "+super.getName());
             }
           }


    
    Polymorphism:  
                  Polymorphism is a Greek Word and the meaning of word 
                  Poly = many  and morphism = forms 

                  so polymorphism is nothing but many forms 
                  There are two types of polymorphism 
                  i)compile time polymorphism  :
                   best Example of compile time polymorphism is Method Overloading.
                   Overloading means a method having same name but differen parameters 
                   so it works many diffenrent differnet Task 

                   we can change the return type of Method overrlaoding
                

                  ii) Runtime polymorphism  : 
                   best Example of compile time polymorphism is Method overreding .

                   method overreding having same method signature(same name same parameters and same return type)
                   we can't change the return type of Method overreding but from java 1.5 onwards we have CO- variant concept by using this concept we can change return type
    
    Encapsulation: 

    Encapsulation is a pillar of OOPConcepts it gives us to the Security in the form of Bindding data with Associate Methods 
     we can AChive Encapsulation by Deaclring all varaibales as a private and providing Getter and setter

     we have two type of Encapsulation i)loosly Encapsulation : When we decalre a Some varaibles as a private and some as public and some as a default so it is called as loosly Encapsulation
      ii)Tightly Encapsulation : when we decalrre all the  Variable as private so it called Tightly Encapsulation

    
    Abstraction:  Hidding the no essential Data and showing essential Data 
        we can achive Abstraction by using Decalring all the instance variable as private :
    */


}
