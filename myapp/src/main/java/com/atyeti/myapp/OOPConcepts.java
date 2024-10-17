package com.atyeti.myapp;

public class OOPConcepts {
    // Explanations of OOP Concepts

    /*
    Inheritance: Passing all the details from Parent to Child is defined as Inheritance.
    There are 5 types of inheritance in java.
       -Single Level Inheritance(parent->child)
       -multilevel Inheritance(grand-parent->parent->child)
       -Hierarchial Inheritance
       -Hybrid Inheritance
       -Multiple inheritance

    -e.g

    class Drink
    {
       public void order()
       {
       }
    }
    class Coffee extends Drink
    {
       @override
       public void order()
       {
       }
       

    }
    class Main
    {
     public static void main(String args[])
        {
          Coffee c= new Coffee();
          c.order();
        }
    }
    
    Polymorphism: It is nothing but many forms.
    there are 2 types of polymorphism in java
      -1)Static Polymorphism /Compile-Time Polymorphism
            it based on the method overloading which is defined as having same methodn signature but with differnt parameteer in same or diff class.

           e.g-
           class Demo
           {
              public void sum(int a,int b)
              {
              }

              public void sum(int a,int b,int c)
              {
              }



               public static void main(String args[])
               {
               }

           }
       -2)Dynamic Polymorphism /Run-Time Polymorphism
         
         -it is based on method oveerriding

    
    Encapsulation:it is defined as the all the data rapped up within the methods
     
    
    Abstraction: Showing the essential data and hiding the un esseential data
    we can achieve abstraction using interface in java
    */



public static void main(String args[])
        {
          Vehicle v1=new Car();
          v1.Running();

          Vehicle v2=new Bike();
          v2.Running();
        }

}
