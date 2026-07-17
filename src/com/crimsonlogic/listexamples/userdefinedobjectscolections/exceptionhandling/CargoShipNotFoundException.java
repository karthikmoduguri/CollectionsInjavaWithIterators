package com.crimsonlogic.listexamples.userdefinedobjectscolections.exceptionhandling;

public class CargoShipNotFoundException extends Exception{
    public CargoShipNotFoundException(String message){
        super(message);
    }
}
