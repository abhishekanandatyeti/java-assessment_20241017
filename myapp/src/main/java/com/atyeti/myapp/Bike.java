package com.atyeti.myapp;


public class vehicle
{
    String brand;
    int speed;

    void displayDetails()
    {
        System.out.println("brand" +brand +" speed" + speed);
    }

}


 class bike1 extends vehicle {
    int milege;

void display1(){
    displayDetailsl();
    System.out.println("milege" +milege);
}

}
class bike2 extends vehicle{
    String color;
    void display2(){

    displayDetails();
    System.out.println("color"+ color);
    }
}

  public class Bike{   

public static void main(String [] args){
bike1 b1=new bike1();
b1.brand="RE";
b1.speed=100;
b1.milege=40;
System.out.println("bike1 Details:");
b1.display1();

bike2 b2 =new bike2();
b2.brand="honds shine ";
b2.speed=80;
b2.color="green"
System.out.println("bike2 Details:");
b2.display2();

  }
  }





