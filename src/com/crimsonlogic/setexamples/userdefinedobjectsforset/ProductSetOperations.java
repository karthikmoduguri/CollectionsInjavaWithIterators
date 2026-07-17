package com.crimsonlogic.setexamples.userdefinedobjectsforset;

import com.crimsonlogic.setexamples.exceptionhandling.ElementNotFoundException;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ProductSetOperations {
    HashSet<Product> productSet=new HashSet<Product>();
    Scanner sc= new Scanner(System.in);

    public void addProduct(){
        System.out.println("enter the product to add: ");
        Product pc=null;

        int noOfProducts=sc.nextInt();
        for(int i=0;i<noOfProducts;i++){
            pc=new Product();
            System.out.println("enter the product id to add: ");
            pc.setProductID(sc.nextInt());
            System.out.println("enter the product name: ");
            pc.setProductName(sc.next());
            System.out.println("enter the product price: ");
            pc.setProductPrice(sc.nextDouble());
            productSet.add(pc);


        }
        System.out.println("the products are: "+productSet);
    }

    public void displaySetProductsUsingIterator(){
        Iterator<Product>iterOfProducts= productSet.iterator();
        try{
            boolean flag=false;
            while(iterOfProducts.hasNext()){
                flag=true;
                System.out.println(iterOfProducts.next());
            }
            if(!flag){
                throw new ElementNotFoundException("no products to display boss!!!");
            }
        }
        catch (ElementNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void searchSetProductsUsingIterator(){
        Iterator<Product>iterOfProducts= productSet.iterator();
        try{
            boolean flag=false;
            System.out.println("enter the product name to search");
            String productName=sc.next();
            while(iterOfProducts.hasNext()){
                if(iterOfProducts.next().getProductName().equalsIgnoreCase(productName)){
                    flag=true;
                    System.out.println("product found");
                    break;
                }
            }
            if(!flag){
                throw new ElementNotFoundException("that product is not there in set !!!");
            }

        }
        catch (ElementNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public void filterProductsStartWithR(){
        Iterator<Product>iterOfProducts= productSet.iterator();
        try{
            boolean flag=false;
            System.out.println("enter the product name to search");
            while(iterOfProducts.hasNext()){
                Product po=iterOfProducts.next();
                if(po.getProductName().toLowerCase().startsWith("r")){
                    flag=true;
                    System.out.println(po.getProductName()+" "+po.getProductID()+" "+po.getProductPrice());
                }
            }
            if(!flag){
                throw new ElementNotFoundException("no product  with =R there in set !!!");
            }

        }
        catch (ElementNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
