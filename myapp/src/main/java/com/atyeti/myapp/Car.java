package com.atyeti.myapp;

public class Car extends Vehicle{
    private String modelName;
    public Car(int wheels, String color, String modelName){
        super(wheels, color);
        this.modelName = modelName;
    }
    public void drive(){
        System.out.println("Driving a "+modelName+" Car");
    }
}

