package com.atyeti.myapp;

public class OOPConcepts {
    // Explanations of OOP Concepts

    /*
    Inheritance:
    Defination : Inheritance it is one of the pillor of java which is use to Inherite the
    Parent properties and Parent class Methods into the Child class. so the child can able
    to access the all data members and methods of the parent class.

    how to do Inheritance in java : for doing the Inheritance we have to use the extends keyword
    for Inheriting the Parent proprties into the child class
    Eg :
    class Parent{
      int bankBalance;
      int house;
      }
     Class child extends Parent{
        so we are Inheriting the Parents properties into the child class
        so all the data members of parents class can able to access in the child class
        System.out.println(this.bankBalance);

     }
    
    Polymorphism: PolyMorphism it is also the pillor of Object Oriented-Programming
    it the ability of the function to present in the multiple forms but the name of the function remains same
    but the parameters and type of the parameter should be different

      There are two methods to Achive the Polymorphism
      --> run-time PolyMorphism / static polyMorphism ( achive by Method overloading )
      --> Compile-timePolyMorphism / Dynamic-Polymorphism ( Achive by Methods Over-riding)

      eg:
      ( Run-time Polymorphism )
      class Calculator{

            int a ;
            int b ;

             void sum ( int a , int b ) {
                  System.out.println( a+b )
             }
             void sum( int a , int b , int c )
             {
                System.out.println( a+b+c )
             }
             void sum( int a , flaot b , double c )
             {
             System.out.println( a+b+c )
             }
            public static void main(){
                Calculator calculator = new Calculator();
                calculator.sum( 10 , 20  ) it will the function with two parameter
                calculator.sum(10 , 20 , 30 ) it will call the function with 3 parameter
            }
      }


//    ( Compile-Time PolyMorphism )
           abstract  class Calculator{

            int a ;
            int b ;

            abstract void sum ( int a , int b )
             void sum( int a , int b , int c )

            abstract void sum( int a , flaot b , double c )

            public static void main(){
                Calculator calculator = new Calculator();
                calculator.sum( 10 , 20  ) it will the function with two parameter
                calculator.sum(10 , 20 , 30 ) it will call the function with 3 parameter
            }
      }

      class Sum{

        @Override
        sum(a , b){
            System.out.println( a + b ) // it will decide which method to call at the run time
        }

      }


    
    Encapsulation: Encapsulation it is also the pillor of Object-Oriented-Programming which is use encapsulate the code into the single unit
    Encapsulation is use to protect the data members and uses the getters ans setters for the setting and getting the values so no one can see the internal Implementaion of the code


    Eg :
     class Car{
        private String Engine;
        private String Brand;

        public void setEngine( String Engine ){
            this.Engine = Engine;
     }
     public void getEngine( String Engine ){
        return Engine;
        }


    
    Abstraction: Abstraction is also the pillor of Object-Oriented-Programming which is use to
    Hide the internal Implementation of the methods and class just showing the useful information to user
    Abstraction 100% abstraction we can achive by using the interfaces in java.

    EG :

   Abstract class Animal{

      String Sound;
      abstract sound()


}
class Dog{

    @Override
    sound(){
        System.out.println( "Dog is barked") // This way we can achive the abstraction over our data
    }
}

  */
