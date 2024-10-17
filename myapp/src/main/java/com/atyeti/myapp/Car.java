package com.atyeti.myapp;

public class Car extends Vehicle {

    private String CarNUmber;
    private int CarCapcity; //Engine Capcity
    Vehicle vehicle //Has-A realtion

    public Bike (String CarNUmber,int CarNUmber, Vehicle vehicle)
    {
        this.CarNUmber = CarNUmber;
        this.CarCapcity= CarCapcity;
        this.vehicle= vehicle;
    }
    public String toString()
    {
        return "Car Number "+CarNUmber+" CarCapicity"+CarCapcity+" "+vehicle;

    }
   //Creating Object For Vechicle and car bike
   public static void main(String [] args)
   {
         vehicle v1 = new vehicle("Car","Red");
         Car c1 = new Car("MH-23-M4656",560,v1);
         System.out.println(c1);
         vehicle v2= new vehicle("Bike","Black");
         Bike b1 = new Bike("MH-23-M 998",220,v2);

   }
}

