package com.crimsonlogic.utilitycollections;

import com.crimsonlogic.listexamples.ArrayListExamples;
import com.crimsonlogic.listexamples.userdefinedobjectscolections.CargoShipOperations;
import com.crimsonlogic.listexamples.userdefinedobjectscolections.CargoShipArrayOperations;
import com.crimsonlogic.mapexamples.HashMapExample;
import com.crimsonlogic.mapexamples.librarymanagement.BookClass;
import com.crimsonlogic.mapexamples.librarymanagement.LibraryService;
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

//
//        HashMapExample hme=new HashMapExample();
//        hme.insertValuesIntoHashMap();
//        hme.displayOrdersInHashMap();
        LibraryService ls=new LibraryService();
        ls.addBook();
    }

}
