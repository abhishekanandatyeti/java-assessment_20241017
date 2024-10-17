package com.atyeti.myapp;

public class Vehicle {

{
    String brand;
    int speed;

    void displayDetails()
    {
        System.out.println("brand" +brand +" speed" + speed);
    }

}

 class bike extends vehicle {
    int milege;

void display1(){
    displayDetailsl();
    System.out.println("milege" +milege);
}

}
class Car extends vehicle {
    int milege;

void display1(){
    displayDetailsl();
    System.out.println("milege" +milege);
}
}

public class Bike{   

public static void main(String [] args){
bike b1=new bike();
b1.brand="jawa";
b1.speed=100;
b1.milege=40;
System.out.println("bike Details:");
b1.display1();

car c1=new car();
c1.brand="tata";
c1.speed=100;
c1.milege=40;
System.out.println("Car1 Details:");
c1.display1();

}
}

