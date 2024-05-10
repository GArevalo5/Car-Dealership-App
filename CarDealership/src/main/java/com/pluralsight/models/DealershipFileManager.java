package com.pluralsight.models;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DealershipFileManager {
public void inventoryFileReader{
        //file reader
        try (FileReader file = new FileReader("files/inventory.csv")) {
            Scanner fileScanner = new Scanner(file);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
