package com.atyeti.myapp;

public class Car extends Vehicle{

    public void car1(){
        System.out.println("Car");
    }

    public static void main(String[] args) {
        Car obj=new Car();
        obj.start();
        obj.car1();

    }
}

