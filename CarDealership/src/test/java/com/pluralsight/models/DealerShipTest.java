package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DealerShipTest {
    
@Test
public void should_Add_A_Vehicle_To_Csv_File(){
    // arrange
    DealerShip dealerShip = new DealerShip("Joe's", "445 Larkin st ", "510-666-9090");
    Vehicle vehicle = new Vehicle(22222, 1994,"Ford","Ranger","truck","red", 123456,1900 );
    // act


    // assert

}
@Test
public void should_Remove_A_Vehicle_On_The_Csv_File(){
    // arrange
    DealerShip dealerShip = new DealerShip("Joe's", "445 Larkin st ", "510-666-9090");
    Vehicle vehicle = new Vehicle(22222, 1994,"Ford","Ranger","truck","red", 123456,1900 );
    // act


    // assert

}
}