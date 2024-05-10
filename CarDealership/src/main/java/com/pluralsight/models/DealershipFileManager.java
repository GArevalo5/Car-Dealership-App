package com.pluralsight.models;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DealershipFileManager {

    //file reader
FileReader fileReader = new FileReader("files/inventory.csv");

    public DealershipFileManager() throws FileNotFoundException {
    }
}
