package com.atyeti.myapp;

public class Bike extends vehicle {
      private boolean hasCarrier;

    // Constructor
    public Bike(String brand, int year, boolean hasCarrier) {
        super(brand, year); // Calling the constructor of the superclass(parent class)
        this.hasCarrier = hasCarrier;
    }
// Method to display bike details will print
    public void displayBikeDetails() {
        System.out.println("Bike Details:");
        displayDetails(); // Calling the method from the superclass
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
    }

}
