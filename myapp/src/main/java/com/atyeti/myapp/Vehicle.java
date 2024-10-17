package com.atyeti.myapp;

public class Vehicle {
private int Vehicleno;
    private String name;
    private String vehicletype;
    
    public Vehicle(){
        Vehicleno=1234;
        name="XYZ";
        vehicletype="Bike";
    }
    public Vehicle(int vehicleno, String name, String vehicletype) {
        Vehicleno = vehicleno;
        this.name = name;
        this.vehicletype = vehicletype;
    }

    public int getVehicleno() {
        return Vehicleno;
    }

    public void setVehicleno(int vehicleno) {
        Vehicleno = vehicleno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }
    public display(){
        System.out.println("VehicleNo"+vehicleno+"Vehicle Name"+name+"VehicleType"+vehicletype);
    }


}

