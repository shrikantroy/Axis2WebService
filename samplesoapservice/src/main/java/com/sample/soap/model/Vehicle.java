package com.sample.soap.model;

public class Vehicle {
	private int id;

	private String brand;

	private String model;

	private int noOfSeats;
	public Vehicle() {
		
	}
	public Vehicle(int id, String brand, String model, int noOfSeats){

		this.id =id;
		this.brand =brand;
		this.model = model;
		this.noOfSeats = noOfSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
}
