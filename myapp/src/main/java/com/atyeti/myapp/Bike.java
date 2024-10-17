package com.atyeti.myapp;

public class Bike extends Vehicle {

    private String BikeNUmber;
    private int BikeeCapcity;
    Vehicle vehicle //Has-A realtion

    public Bike (String BikeNUmber,int BikeeCapcity, Vehicle vehicle)
    {
        this.BikeNUmber = BikeNUmber;
        this.BikeeCapcity= BikeeCapcity;
        this.vehicle= vehicle;
    }
    public String toString()
    {
        return "Bike Number "+BikeNUmber+" BikeeCapicity"+BikeeCapcity+" "+vehicle;

    }



}
