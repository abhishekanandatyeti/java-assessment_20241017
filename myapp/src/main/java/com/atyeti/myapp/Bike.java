package com.atyeti.myapp;

public class Bike extends Vehicle{
    private String modelName;
    public Bike(int wheels, String color, String modelName){
        super(wheels, color);
        this.modelName = modelName;
    }
    @Override
    public void drive(){
        System.out.println("Driving a "+modelName+"Bike");
    }
}
