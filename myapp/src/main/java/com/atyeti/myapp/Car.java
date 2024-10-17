package com.atyeti.myapp;

public class Car extends vehicle {
      private int numberOfDoors;

    // Constructor
    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year); // Calling the constructor of the superclass
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display car details will print
    public void displayCarDetails() {
        System.out.println("Car Details:");
        displayDetails(); // Calling the method from the superclass
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}

