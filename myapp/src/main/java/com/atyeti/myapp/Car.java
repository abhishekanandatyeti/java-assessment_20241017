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


 class Car1 extends vehicle {
    int milege;

void display1(){
    displayDetailsl();
    System.out.println("milege" +milege);
}

}
class car2 extends vehicle{
    String color;
    void display2(){

    displayDetails();
    System.out.println("color"+ color);
    }
}

  public class car{   

public static void main(String [] args){
car1 c1=new car1();
c1.brand="tata";
c1.speed=100;
c1.milege=40;
System.out.println("Car1 Details:");
 c1.display1();

car2 c2 =new car2();
c2.brand="nexa";
c2.speed=120;
c2.color="blue"
System.out.println("Car2 Details:");
c2.display2();

  }
  }



