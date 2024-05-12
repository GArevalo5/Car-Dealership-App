package com.pluralsight.models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public static void displayAllVehicles() {
        System.out.println("All vehicles in the dealership:");
        try {
            DealerShip dealerShip = DealershipFileManager.getDealershipObjects();

            System.out.println("Dealership: " + dealerShip.getName() + " " + dealerShip.getAddress() + " " + dealerShip.getPhone() + " ");
            for (Vehicle vehicle : dealerShip.vehicles) {
                System.out.println("Vin: " + vehicle.getVin());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make: " + vehicle.getMake());
                System.out.println("Model: " + vehicle.getModel());
                System.out.println("Color: " + vehicle.getColor());
                System.out.println("Odometer: " + vehicle.getOdometer());
                System.out.println("Price: " + vehicle.getPrice());
            }
            System.out.println("-".repeat(60));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void addVehicle() {
        System.out.println("Work in progress");
        try{
            DealerShip dealerShip = DealershipFileManager.getDealershipObjects();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static void removeVehicle()
    {
        System.out.println("Work in progress");
        try{
            DealerShip dealerShip = DealershipFileManager.getDealershipObjects();
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
