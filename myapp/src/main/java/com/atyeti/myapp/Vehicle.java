package com.atyeti.myapp;

public class Vehicle 
{
    private String fuel;
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	private int noOfSeats;
	private String model;
	private String engineType;
    private int gears;
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getModel() {
		return model;
	}
	@Override
	public String toString() {
		return "vehincle [fuel=" + fuel + ", noOfSeats=" + noOfSeats + ", model=" + model + ", engineType=" + engineType
				+ ", gears=" + gears + "]";
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getGears() {
		return gears;
	}
	public void setGears(int gears) {
		this.gears = gears;
	}


}

