package com.pluralsight.models;

import java.util.ArrayList;

public class DealerShip {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> vehicles;

    public DealerShip(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }



}
