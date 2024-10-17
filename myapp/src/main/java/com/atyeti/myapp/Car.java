package com.atyeti.myapp;

public class Car extends Vehicle {
private String modelname;
    private String companyname;
    private int price;
    
    public Car(){
        super();
        modelname="city";
        companyname="honda";
        price=1334327;
    }
    public Car(int vehicleno, String name, String vehicletype, String companyname,String modelname,int price){
        super(vehicleno,name,vehicletype);
        this.companyname=companyname;
        this.modelname=modelname;
        this.price=price;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void display(){
        super.display();
          System.out.println("Companyname"+companyname+"modelname"+modelname+"Price"+price)
    }
}

