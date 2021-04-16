package com.sample.soap.service;

import com.sample.soap.model.Vehicle;

public interface VehicleService {
	public Vehicle getVehicle(int id);
	 
    public boolean removeVehicle(int id);
 
    public boolean addVehicle(Vehicle vehicle);
}
