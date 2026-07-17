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

}
