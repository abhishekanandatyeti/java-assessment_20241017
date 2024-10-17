package com.atyeti.myapp;

public class Vehicle {
    // Inheritacnce
    int Tyre ;
    int Door ;
    String Engine;
    int speed ;

    Vehicle(){
        this.speed = 0;
        this.Door = 0;
        this.Tyre = 0;
        this.Engine = "No Engine";
    }

    public int MaxSpeed(int speed){
        return this.speed = speed;
    }
    public void VehicalType(String type){
        this.Engine = type;
    }
}

