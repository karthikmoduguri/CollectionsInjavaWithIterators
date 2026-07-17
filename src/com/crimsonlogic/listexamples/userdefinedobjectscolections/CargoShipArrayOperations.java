package com.crimsonlogic.listexamples.userdefinedobjectscolections;

import java.util.Arrays;
import java.util.Scanner;

public class CargoShipArrayOperations {
    CargoShip[]addCargoship= new CargoShip[5];
    Scanner sc=new Scanner(System.in);
    public  void addCargoArrayOperation(){
        CargoShip c= null;
        for(int i=0;i<addCargoship.length;i++){
            c = new CargoShip();
            System.out.println("enter the cargo ship id");
            c.setCargoShip(sc.nextInt());
            System.out.println("enter the cargo ship name");
            c.setCargoShipName(sc.next());
            System.out.println("enter the cargo ship capacity");
            c.setCargoShipCapacity(sc.nextFloat());
            addCargoship[i]=c;
        }
        System.out.println(Arrays.toString(addCargoship));
    }

    public void compareCargoArrayOperation(){

    }
}
