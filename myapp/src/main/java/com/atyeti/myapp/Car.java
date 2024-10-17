package com.atyeti.myapp;

public class Car 
{
    private int carModel;
	private String carName;
	public int getCarModel() {
		return carModel;
	}
	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	@Override
	public String toString() {
		return "car [carModel=" + carModel + ", carName=" + carName + "]";
	}
	
}

