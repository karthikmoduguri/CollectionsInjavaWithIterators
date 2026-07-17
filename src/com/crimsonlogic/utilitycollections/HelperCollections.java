package com.crimsonlogic.utilitycollections;

import com.crimsonlogic.listexamples.ArrayListExamples;
import com.crimsonlogic.listexamples.userdefinedobjectscolections.CargoShipOperations;
import com.crimsonlogic.listexamples.userdefinedobjectscolections.CargoShipArrayOperations;
import com.crimsonlogic.setexamples.HashSetExample;
import com.crimsonlogic.setexamples.userdefinedobjectsforset.ProductSetOperations;

import java.util.Scanner;

public class HelperCollections {
    ArrayListExamples ae=new ArrayListExamples();

    public  void collectionsHelper(){
      //  ae.addElementsInArrayList();
        //CargoShipOperations cso= new CargoShipOperations();
//        cso.addCargoShip();
//        cso.cargoShipCapacityComparison();
//        cso.displayRequiredCargoShipDetails();
//        CargoShipArrayOperations csao=new CargoShipArrayOperations();
//        csao.addCargoArrayOperation();

//        HashSetExample hse=new HashSetExample();
//        hse.addElementsToDepartment();
//        //hse.traverseAndRemoveDetails();
//        hse.searchDepWithExceptionWhenDepNotFound();

        Scanner sc=new Scanner(System.in);
        ProductSetOperations pso=new ProductSetOperations();
        int choiceOfProductOperation=0;
        while(true){
            System.out.println("enter choices 1 for add product, 2 for display, 3:search ,4:filter , 5:exit");
            choiceOfProductOperation=sc.nextInt();
            switch (choiceOfProductOperation){
                case 1:
                    pso.addProduct();
                    break;
                case 2:
                    pso.displaySetProductsUsingIterator();
                    break;
                case 3:
                    pso.searchSetProductsUsingIterator();
                    break;
                case 4:
                    pso.filterProductsStartWithR();
                    break;
                case 5:
                    System.out.println("exiting loop");
                    System.exit(0);
                default:
                    System.out.println("enter the correct choice ");
            }
        }
    }

}
