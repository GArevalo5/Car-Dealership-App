package com.pluralsight.models;
import java.util.ArrayList;
import java.util.Scanner;

public class DealerShip {
    private String name;
    private String address;
    private String phone;
    ArrayList<Vehicle> vehicles;

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
        Scanner userInput = new Scanner(System.in);
        try{
            Vehicle newVehicle = new Vehicle();
            DealerShip dealerShip = DealershipFileManager.getDealershipObjects();
            for (Vehicle vehicle: dealerShip.vehicles) {
                // vin
                System.out.println("Enter the vin: ");
                int vin = userInput.nextInt();
                newVehicle.setVin(vin);

                //year
                System.out.println("Enter the year: ");
                int year = userInput.nextInt();
                newVehicle.setYear(year);

                // make
                System.out.println("Enter the make: ");
                String make = userInput.next();
                newVehicle.setMake(make);

                // model
                System.out.println("Enter the model: ");
                String model = userInput.next();
                newVehicle.setModel(model);

                // vehicle type
                System.out.println("Enter the vehicle type: ");
                String vehicleType = userInput.next();
                newVehicle.setVehicleType(vehicleType);

                //color
                System.out.println("Enter the color: ");
                String color = userInput.next();
                newVehicle.setColor(color);

                //odometer
                System.out.println("Enter the odometer: ");
                int odometer = userInput.nextInt();
                newVehicle.setOdometer(odometer);

                // price
                System.out.println("Enter the price: ");
                double price = userInput.nextDouble();
                newVehicle.setPrice(price);

                //should add the new vehicle to the array list.
                dealerShip.addVehicle(newVehicle);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void removeVehicle()
    {
        System.out.println("Work in progress");
        Scanner userInput = new Scanner(System.in);
        try{
            DealerShip dealerShip = DealershipFileManager.getDealershipObjects();
            for (Vehicle vehicle : dealerShip.vehicles)
            System.out.println("Please enter the vin: ");
            int vin = userInput.nextInt();
            dealerShip.vehicles.remove(vin);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
