package com.crimsonlogic.mapexamples.librarymanagement;

import com.crimsonlogic.mapexamples.librarymanagement.libraryexception.LibraryException;
import com.crimsonlogic.setexamples.userdefinedobjectsforset.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryService {
    Scanner sc= new Scanner(System.in);

    HashMap<Integer,BookClass> libraryMap=new HashMap<>();

    public  void addBook(){
        System.out.println("enter the no of books to add: ");
        BookClass bc=null;

        int noOfBooks=sc.nextInt();
        for(int i=0;i<noOfBooks;i++){
            bc=new BookClass();
            System.out.println("enter the book id to add: ");
            bc.setBookId(sc.nextInt());
            System.out.println("enter the book name: ");
            bc.setTitle(sc.next());
            System.out.println("enter the book price: ");
            bc.setBookPrice(sc.nextDouble());
            System.out.println("enter the category of book: ");
            bc.setCategory(sc.next());
            System.out.println("enter the author of book: ");
            bc.setAuthor(sc.next());
            System.out.println("enter the book issued or not :");
            bc.setIssued(sc.nextBoolean());
            try{
                if(libraryMap.containsKey(bc.getBookId())){
                        throw new LibraryException("book with thad id already exists");
                }
            }
            catch(LibraryException e){
                System.out.println(e.getMessage());
            }
            libraryMap.put(bc.getBookId(),bc);


        }
        System.out.println("the book map in library is: ");
        for (Map.Entry<Integer,BookClass>entry:libraryMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }


    public void searchBook(){

        if(libraryMap.isEmpty()){
            System.out.println("No Books Available");
            return;
        }

        System.out.println("Enter Book ID");
        int id=sc.nextInt();

        try{

            if(!libraryMap.containsKey(id)){
                throw new LibraryException("Book Not Found");
            }

            System.out.println(libraryMap.get(id));

        }
        catch(LibraryException e){
            System.out.println(e.getMessage());
        }

    }

    public void updatePrice(){

        if(libraryMap.isEmpty()){
            System.out.println("No Books Available");
            return;
        }

        System.out.println("Enter Book ID");
        int id=sc.nextInt();
        try{
            if(!libraryMap.containsKey(id)){
                throw new LibraryException("Book Not Found");
            }

            BookClass bc=libraryMap.get(id);

            System.out.println("Enter New Price");
            bc.setBookPrice(sc.nextDouble());

            System.out.println("Price Updated Successfully");
        }
        catch(LibraryException e){
            System.out.println(e.getMessage());
        }

    }

    public void issueBook(){

        if(libraryMap.isEmpty()){
            System.out.println("No Books Available");
            return;
        }

        System.out.println("Enter Book ID");
        int id=sc.nextInt();

        try{

            if(!libraryMap.containsKey(id)){
                throw new LibraryException("Book Not Found");
            }

            BookClass bc=libraryMap.get(id);

            if(bc.isIssued()){
                throw new LibraryException("Book Already Issued");
            }

            bc.setIssued(true);

            System.out.println("Book Issued Successfully");

        }
        catch(LibraryException e){
            System.out.println(e.getMessage());
        }

    }

    public void returnBook(){
        if(libraryMap.isEmpty()){
            System.out.println("No Books Available");
            return;
        }
        System.out.println("Enter Book ID");
        int id=sc.nextInt();
        try{
            if(!libraryMap.containsKey(id)){
                throw new LibraryException("Book Not Found");
            }
            BookClass bc=libraryMap.get(id);
            if(!bc.isIssued()){
                throw new LibraryException("Book is Already Available");
            }
            bc.setIssued(false);
            System.out.println("Book Returned Successfully");
        }
        catch(LibraryException e){
            System.out.println(e.getMessage());
        }

    }

    public void displayBooks(){
        try{
            if(libraryMap.isEmpty()){
                throw new LibraryException("No Books Available");
            }
            for(Map.Entry<Integer,BookClass> entry : libraryMap.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
        catch(LibraryException e){
            System.out.println(e.getMessage());
        }
    }

    public void countBooks(){

        try{

            if(libraryMap.isEmpty()){

                throw new LibraryException("No Books Available");

            }

            System.out.println("Total Books : "+libraryMap.size());

        }
        catch(LibraryException e){

            System.out.println(e.getMessage());

        }

    }

    public void clearLibrary(){

        try{

            if(libraryMap.isEmpty()){

                throw new LibraryException("Library Already Empty");

            }

            libraryMap.clear();

            System.out.println("Library Cleared Successfully");

        }
        catch(LibraryException e){

            System.out.println(e.getMessage());

        }

    }

    public void countCategoryWise(){

        try{

            if(libraryMap.isEmpty()){

                throw new LibraryException("No Books Available");

            }

            HashMap<String,Integer> categoryMap = new HashMap<String,Integer>();

            for(Map.Entry<Integer,BookClass> entry : libraryMap.entrySet()){

                String category = entry.getValue().getCategory();

                if(categoryMap.containsKey(category)){

                    categoryMap.put(category,categoryMap.get(category)+1);

                }
                else{

                    categoryMap.put(category,1);

                }

            }

            System.out.println("Category Wise Book Count");

            for(Map.Entry<String,Integer> entry : categoryMap.entrySet()){

                System.out.println(entry.getKey()+" : "+entry.getValue());

            }

        }
        catch(LibraryException e){

            System.out.println(e.getMessage());

        }

    }

    public void costliestBook(){

        try{

            if(libraryMap.isEmpty()){

                throw new LibraryException("No Books Available");

            }

            BookClass costliest = null;

            for(Map.Entry<Integer,BookClass> entry : libraryMap.entrySet()){

                if(costliest==null || entry.getValue().getBookPrice()>costliest.getBookPrice()){

                    costliest=entry.getValue();

                }

            }

            System.out.println("Costliest Book");

            System.out.println(costliest);

        }
        catch(LibraryException e){

            System.out.println(e.getMessage());

        }

    }

    public void removeBook(){

        if(libraryMap.isEmpty()){
            System.out.println("No Books Available");
            return;
        }

        System.out.println("Enter Book ID to Remove");
        int id = sc.nextInt();

        try{

            if(!libraryMap.containsKey(id)){

                throw new LibraryException("Book Not Found");

            }

            libraryMap.remove(id);

            System.out.println("Book Removed Successfully");

        }
        catch(LibraryException e){

            System.out.println(e.getMessage());

        }

    }



}
