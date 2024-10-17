package com.atyeti.myapp;

public class Vehicle {
    private int wheels;
    private String color;
    public Vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color  = color;
    }
    public void drive(){
        System.out.println("Driving a Vehicle");
    };
}

