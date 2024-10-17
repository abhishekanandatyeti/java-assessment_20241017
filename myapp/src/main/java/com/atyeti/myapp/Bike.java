package com.atyeti.myapp;

public class Bike extends Vehicle {

     Bike(){
         super();
         this.Tyre = 2;
         this.speed = 90;
         this.Door = 0;
         this.Engine = "100cc";
     }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.MaxSpeed(20);
        bike.VehicalType("Petrol"); // I have use the Vehical class methods and properties in Bike class
    }


}
