package com.atyeti.myapp;

public class Vehicle {
     private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display vehicle details which it will print
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }


    public static void main(String[] args) {
        // Creating instances of Car and Bike
        Car myCar = new Car("Toyota", 2020, 4);
        Bike myBike = new Bike("Yamaha", 2018, true);

        // Displaying details of Car and Bike as printing in  output
        myCar.displayCarDetails();
        System.out.println();
        myBike.displayBikeDetails();
    }
}

