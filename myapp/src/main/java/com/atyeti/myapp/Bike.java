package com.atyeti.myapp;

public class Bike extends Vehicle {
    private String companyname;
    private String modelname;
    private int price;
    public Bike(){
        super();
        companyname="OLA";
        modelname="S1PRO";
        price=120000;
    }
    public Bike(int vehicleno, String name, String vehicletype, String companyname,String modelname,int price){
        super(vehicleno,name,vehicletype);
        this.modelname=modelname;
        this.companyname=companyname;
        this.price=price;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void display(){
        super.display();
        
    }
    public void display(){
        super.display();
         System.out.println("Companyname"+companyname+"modelname"+modelname+"Price"+price)
    }

}
