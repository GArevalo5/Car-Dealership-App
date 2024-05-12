package com.pluralsight.models;

import java.io.*;
import java.util.Scanner;

public class DealershipFileManager {

    public static DealerShip getDealershipObjects() throws IOException {
        //file reader

        try (FileReader file = new FileReader("files/inventory.csv")) {
            Scanner fileScanner = new Scanner(file);
            String line = fileScanner.nextLine();
            String[] parts = line.split("\\|");
            //get dealership first
            DealerShip dealership = new DealerShip(parts[0], parts[1], parts[2]);
            //get list of vehicles to put into dealership
            while (fileScanner.hasNextLine()) {
                line = fileScanner.nextLine();
                String[] vehicleParts = line.split("\\|");
                int vin = Integer.parseInt(vehicleParts[0]);
                int year = Integer.parseInt(vehicleParts[1]);
                int odometer = Integer.parseInt(vehicleParts[6]);
                double price = Double.parseDouble(vehicleParts[7]);
                Vehicle vehicle = new Vehicle(vin, year, vehicleParts[2], vehicleParts[3], vehicleParts[4], vehicleParts[5], odometer, price);
                dealership.addVehicle(vehicle);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public static void addVehicle() {
        String filePath = "files/inventory.csv";
        File file = new File((filePath));
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            Scanner userInput = new Scanner(System.in);
            //vin
            System.out.print("Please enter the vin: ");
            int vin = userInput.nextInt();
            bufferedWriter.write(vin);
            bufferedWriter.write("|");
            //year
            System.out.print("Please enter the year: ");
            int year = userInput.nextInt();
            bufferedWriter.write(year);
            bufferedWriter.write("|");
            //make
            System.out.print("Please enter the make: ");
            String make = userInput.nextLine().strip();
            bufferedWriter.write(make);
            //model
            System.out.print("Please enter what it was for: ");
            String model = userInput.nextLine().strip();
            bufferedWriter.write(model);
            bufferedWriter.write("|");
            //vehicleType
            System.out.print("Please enter what it was for: ");
            String vehicleType = userInput.nextLine().strip();
            bufferedWriter.write(vehicleType);
            bufferedWriter.write("|");
            //color
            System.out.print("Please enter what it was for: ");
            String color = userInput.nextLine().strip();
            bufferedWriter.write(color);
            bufferedWriter.write("|");
            //odometer
            System.out.print("Please enter what it was for: ");
            int odometer = userInput.nextInt();
            bufferedWriter.write(odometer);
            bufferedWriter.write("|");
            //price
            System.out.print("Please enter amount deposited: ");
            double price = userInput.nextDouble();
            bufferedWriter.write(String.valueOf(price));
            bufferedWriter.close();
            System.out.println();
            } catch (IOException e) {
            throw new RuntimeException(e);
            }
        }
}
