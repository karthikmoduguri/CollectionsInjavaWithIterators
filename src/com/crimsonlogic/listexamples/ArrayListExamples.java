package com.crimsonlogic.listexamples;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListExamples {

    //ArrayListExamples
    List<Integer>numberList =new ArrayList<>();
    Scanner sc =new Scanner(System.in);
    public  void addElementsInArrayList(){
        System.out.println("Enter the  number of elements you want add to list");
        int sizeOfList=sc.nextInt();
        System.out.println("list size is : "+sizeOfList);
        System.out.println("add elements for the array");
        for (int i=0;i< sizeOfList;i++){
            int element=sc.nextInt();
            numberList.add(element);
        }
        System.out.println("elements stored in arraylist are: "+ numberList);
    }

    public void removeElementsByIterator(){
        Iterator<Integer>iter=numberList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
            if (iter.next().equals(2)){
                System.out.println("removed the element"+iter.next());
                iter.remove();
            }
        }
    }

    public void displayByIterator(){
        Iterator<Integer>iter=numberList.iterator();
        while (iter.hasNext()){
            System.out.println("elements are"+iter.next());
        }
    }
}
