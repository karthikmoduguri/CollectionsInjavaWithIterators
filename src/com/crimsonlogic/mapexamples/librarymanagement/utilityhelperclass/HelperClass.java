package com.crimsonlogic.mapexamples.librarymanagement.utilityhelperclass;

import com.crimsonlogic.mapexamples.librarymanagement.LibraryService;

import java.util.Scanner;

public class HelperClass {

    public void librayHelper(){

        LibraryService ls = new LibraryService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("enter choices");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Update Book Price");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Display Books");
            System.out.println("8. Check Duplicate Book ID");
            System.out.println("9. Count Books");
            System.out.println("10. Clear Library");
            System.out.println("11. Count Books Category Wise");
            System.out.println("12. Costliest Book");
            System.out.println("13. Exit");

            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice){

                case 1:
                    ls.addBook();
                    break;

                case 2:
                    ls.searchBook();
                    break;

                case 3:
                    ls.updatePrice();
                    break;

                case 4:
                    ls.issueBook();
                    break;

                case 5:
                    ls.returnBook();
                    break;

                case 6:
                    ls.removeBook();
                    break;

                case 7:
                    ls.displayBooks();
                    break;

                case 9:
                    ls.countBooks();
                    break;

                case 10:
                    ls.clearLibrary();
                    break;

                case 11:
                    ls.countCategoryWise();
                    break;

                case 12:
                    ls.costliestBook();
                    break;
                case 13:
                    System.out.println("Thank You...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}