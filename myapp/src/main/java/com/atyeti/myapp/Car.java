package com.atyeti.myapp;

public class Car extends Vehicle {

    Car(){
        super();
        this.Tyre = 4;
        this.speed = 150;
        this.Door = 4;
        this.Engine = "500cc";
    }

    public static void main(String[] args) {
        Car bike = new Car();
        bike.MaxSpeed(200);
        bike.VehicalType("Disel"); // I have use the Vehical class methods and properties in Car class
    }

}

