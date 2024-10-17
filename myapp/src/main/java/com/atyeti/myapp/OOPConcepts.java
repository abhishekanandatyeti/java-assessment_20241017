package com.atyeti.myapp;

public class OOPConcepts {
    // Explanations of OOP Concepts

    /*
    Inheritance: 

    - Inheritance is an OOP concept/ it is the process of inheriting the properties from parents to the child
    - In Java Inheritance can be done by using 'extends' keyword

    Ex: 
    class Vehicle {
        ...
    }
    class Car extends Vehicle{
       ...
    }
    In the above example the car can have all the properies where the vehicle can have

    -------------------------------------------------

    Polymorphism: 

    - Polymorphism means many forms or it is the process of exists in differnt forms in the given system
    - In Java we can acheive polymorphism in two ways 
      1. Compile Time polymorphism / Method Overloading
        - if two or more methods having same name but different in parameters
      2. Run Time polymorphism / Method Overriding
        - if two methods having same method signature 
        - we can acheive this using Inheritance only

    Ex: 
    Method Overloading:
    class A{
        public int add(int a, int b){return a+b;}
        public int add(int a, int b, int c){return a+b+c;}  
    }
    
    Method Overriding:
    class A{
        public int add(int a, int b){return a+b;}
    }
    class B extends A{
        public int add(int a, int b){return a+b;}
    }

    ---------------------------------------------------------

    Encapsulation: 

    - It is the process of Wrapping/Binding up of the data together in a single unit
    - we can acheive encapsulation by making our data members as private and data methods as public
      and providing getters to access the data

    Ex: 
    class A{
    // data members    
    private int a;
        private int b;

        // data methods
        public int getA(){
            return a;
        }
        public int getB(){
            return b;
        } 
    }

    ------------------------------------------------------

    Abstraction:

    - Abstraction is the process of hiding the internal components/complexity and
      provides only functionality outside to the user
    - In Java we can acheive abstarction using abstract classes and interfaces
    Ex:
    - we can extend an abstarct class to acheive abstraction through abstarct classes

    public abstract class User{
    }
    class NormalUser extends User{
    }
    class PremiumUser extends User{
    }
    
    or
    - we can implement an interface to acheive abstraction through interfaces

    public interface User{
    }
    class NormalUser implements User{
    }
    class PremiumUser implements User{
    }
    */
}
