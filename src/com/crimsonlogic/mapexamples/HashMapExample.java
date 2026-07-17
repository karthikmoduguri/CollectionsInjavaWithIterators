package com.crimsonlogic.mapexamples;

import java.awt.desktop.AboutHandler;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
    HashMap<Integer,Float>orderDetails=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    public void insertValuesIntoHashMap(){
        System.out.println("enter the no of orders to insert");
        int noOfOrders=sc.nextInt();
        for (int i=0;i<noOfOrders;i++){
            System.out.println("enter the orderID: ");
            int orderId=sc.nextInt();
            System.out.println("enter th order amount");
            float orderAmount=sc.nextFloat();
            orderDetails.put(orderId,orderAmount);
        }

    }
    public  void displayOrdersInHashMap(){
        System.out.println("the orders are");
        for (Map.Entry<Integer, Float> entry:orderDetails.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
