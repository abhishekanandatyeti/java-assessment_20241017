package com.atyeti.myapp;

public class OOPConcepts {
    // Explanations of OOP Concepts

    /*
    Inheritance: 
    ->Inheritence is the concept of acquiring the properties of old class(parent class) and making new class(child class)
    ->Example child acquiring proprerties of parent like skinTone,etc.
    ->Exampe
    // Base class (Parent class)
     class Animal {
     String sound="Barks";
    // Method
    public void sound() {
        System.out.println("Animal make sound");
    }
}

// Derived class (Child Class) 
class Dog extends Animal {
// Overriding the sound method
    @Override
    public void sound(sound) {
        System.out.println(Dog will + sound);
    }
}

public class OOPExample {
    public static void main(String[] args) {
        // Creating an object of the Dog class --an instance of Animal
        Dog mydog = new Dog();

        // Calling the overridden method
        myDog.sound();  // Output: barks
    }
}

    Polymorphism: 
    This property will make same code to perform different in different sitations
     proper def-> Polimorphism has ability to take more than one form
     example 
     class PolyExampe{
     public int add(int a, int b){
     return a+b
    }
    publiv int add(int a ,Double b){\
    return a+b;
    }
    public int add(Double a,Double b){
    return a+b;
    }
    Public Static void main(sString[] args){
    PolyExample p = new PolyExample(int a, int b)//it will call method who having only integer as parameter
    }
    Encapsulation: 
    Binding of properties and behaviour in to single unit
    ->the advantage of encapsulation is datahiding
    example
    class Person {
    // Private attributes
    private String name;
    private int age;
 // Constructor to initialize the values
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
 this.age=age;
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person(25);
    }
}

    
    Abstraction:
    abstraction is use to storing the implementation and reveling the specification 
    abstraction class must have abstract methds //oniy have implenation no function body
    example
    abstract class Animal {
    public abstract void sound();

    // general method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

// Subclass ->inheriting from the abstract class
class Dog extends Animal {
    // Providing implementation of the abstract method
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Animal myDog = new Dog();

        // Calling the implemented method
        myDog.sound();  

        // Calling the non-abstract method from the abstract class
        myDog.sleep();  
    }
}
    */
}

