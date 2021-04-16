package com.sample.soap.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.sample.soap.model.Vehicle;
import com.sample.soap.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {

	public static Map<Integer, Vehicle> vehicleMap = new HashMap<Integer, Vehicle>();

	public Vehicle getVehicle(int id) {
		Vehicle vehicle;
		if (vehicleMap.get(id) == null) {
			vehicle = new Vehicle(0, "Default", "Default", 4);
		} else {
			vehicle = vehicleMap.get(id);
		}
		return vehicle;
	}

	public boolean removeVehicle(int id) {
		if (vehicleMap.containsKey(id)) {
			vehicleMap.remove(id);
			return true;
		}
		return false;
	}

	public boolean addVehicle(Vehicle vehicle) {
		if (vehicleMap.containsKey(vehicle.getId())) {
			return false;
		}
		vehicleMap.put(vehicle.getId(), vehicle);
		return true;
	}

}
