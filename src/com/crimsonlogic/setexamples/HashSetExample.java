package com.crimsonlogic.setexamples;

import com.crimsonlogic.setexamples.exception.ElementNotFoundException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetExample {
    HashSet<String>departmentDetails=new HashSet<>();
    Scanner sc =new Scanner(System.in);

    public void addElementsToDepartment(){
        System.out.println("enter the no of departments");
        int noOfDepartments=sc.nextInt();
        System.out.println("now enter the details");
        for(int i=0;i<noOfDepartments;i++){
            departmentDetails.add(sc.next());
        }
        System.out.println("the departments are: "+departmentDetails);
    }

    public void displayDepDetailsUsingIterator(){
        //interator is used to traverse elements
        //for ecah loop not used bcs it will not guaramte order
        //departmentdetails is shashset object contains dep names
        //departmentdrtailsiteartor is iterator object which is used to traverse elements
        //iterator is an interface in hashset class internally
        //iterator() method is used to get the iterator object from hashset
        Iterator<String>displayDepIterator=departmentDetails.iterator();
        while(displayDepIterator.hasNext()){
            System.out.println("the departments are "+displayDepIterator.next());
        }
    }

    public void traverseAndRemoveDetails(){

        Iterator<String> displayAndRemoveIterator = departmentDetails.iterator();

        System.out.println("Departments:");

        while(displayAndRemoveIterator.hasNext()){
            System.out.println(displayAndRemoveIterator.next());
        }

        System.out.println("Enter department to remove:");
        String depName = sc.next();
        displayAndRemoveIterator = departmentDetails.iterator();

        while(displayAndRemoveIterator.hasNext()){

            String dep = displayAndRemoveIterator.next();

            if(dep.equals(depName)){
                displayAndRemoveIterator.remove();
                break;
            }
        }

        System.out.println("After removing:"+departmentDetails);
    }

    public  void searchDepWithExceptionWhenDepNotFound(){
        Iterator<String>searchDepName=departmentDetails.iterator();
        System.out.println("enter the departmentName: ");
        String searchName=sc.next();
        boolean flag =false;
        try{
            while(searchDepName.hasNext()){
                    if(searchName.equalsIgnoreCase(searchDepName.next())){
//                        System.out.println("department "+searchName+" is found");
                        flag=true;
                        break;
                    }
            }
            if(flag){
                System.out.println("department "+searchName+" is found");
            }else{
                throw new ElementNotFoundException("department is not found");
            }
        }
        catch(ElementNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
