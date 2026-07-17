package com.crimsonlogic.listexamples.userdefinedobjectscolections;

import com.crimsonlogic.listexamples.userdefinedobjectscolections.Exception.CargoShipNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CargoShipOperations {
    ArrayList<CargoShip> cargoShipList=new ArrayList<CargoShip>();
    Scanner sc= new Scanner(System.in);

    //method to add cargoShip objects in the arraylist
    public void addCargoShip(){
        System.out.println("enter the number of the cargo ships to add in the list ");
        CargoShip c= null;
        int noCargoShips = sc.nextInt();
        for (int i = 0; i < noCargoShips; i++) {
            c = new CargoShip();
            System.out.println("enter the cargo ship id");
            c.setCargoShip(sc.nextInt());
            System.out.println("enter the cargo ship name");
            c.setCargoShipName(sc.next());
            System.out.println("enter the cargo ship capacity");
            c.setCargoShipCapacity(sc.nextFloat());
            cargoShipList.add(c);
            System.out.println(cargoShipList);
        }
    }

    public void cargoShipCapacityComparison(){
        CargoShip c1= cargoShipList.get(0);
        CargoShip c2= cargoShipList.get(1);

        if(c1.equals(c2)){
            System.out.println("both ships are equal");
        }else {
            System.out.println("they are not equal");
        }


        if(c1.getCargoShipCapacity()>c2.getCargoShipCapacity()){
            System.out.println(c1.getCargoShipName()+"capacity is more than "+c2.getCargoShipName()+"'s capacity");
        }
        else if (c1.getCargoShipCapacity()<c2.getCargoShipCapacity()) {
            System.out.println(c1.getCargoShipName()+"capacity is less than "+c2.getCargoShipName()+"'s capacity");
        }
        else{
            System.out.println("both capacities are equal");
        }
    }

    //read objects from cargoShipList
    public void displayRequiredCargoShipDetails() {
        System.out.println("enter the name of teh cargo ship to display the details");
        String name = sc.next();

        for (CargoShip c : cargoShipList) {
            try {
                if (c.getCargoShipName().equals(name)) {
                    System.out.println("ship found");
                    return;
                }
                else if(c.equals(cargoShipList.get(cargoShipList.size()-1))){
                        throw  new CargoShipNotFoundException("ship not found with the :"+ name);
                    }

            }
            catch(RuntimeException | CargoShipNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    }


}
