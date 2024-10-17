package com.atyeti.myapp;

public class Vehicle {

    private String VehicleType;
    private String VehicleColor;
    
    public Vehicle( String VehicleType,String VehicleColor)
    {
        this.VehicleType=VehicleType;
        this.VehicleColor=VehicleColor;

    }
    public String getVehicleType()
    {
        return VehicleType;
    }
    public String getVehicleColor()
    {
        return VehicleColor;
    }
    public String toString()
    {
        return "Vehicle Type "+VehicleType+"vehicle COlor "+VehicleColor;
    }

}

