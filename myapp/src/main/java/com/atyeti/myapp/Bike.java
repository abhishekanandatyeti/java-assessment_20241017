package com.atyeti.myapp;

public class Bike extends Vehicle{

    public void bike1(){
        System.out.println("Bike");
    }

    public static void main(String[] args) {
        Bike obj=new Bike();
        obj.start();
        obj.bike1();
    }
}
