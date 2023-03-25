package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 0:
                printInstructions();
                break;
                
                case 1:
                groceryList.printGroceryList();
                break;
                
                case 2:
                addItem();
                break;

                case 3:
                modifyItem();
                break;

                case 4:
                removeItem();
                break;

                case 5:
                searchForItem();
                break;

                case 6:
                processArrayList();
                break;

                case 7:
                quit = true;
                break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print Choice Options.");
        System.out.println("\t 1 - To Print the List of Grocery Items");
        System.out.println("\t 2 - To Add an Item to the List");
        System.out.println("\t 3 - To modify an Item in the List");
        System.out.println("\t 4 - To Remove an Item from the List");
        System.out.println("\t 5 - To Search for an Item in the List");
        System.out.println("\t 6 - To Quit the Application."); 

    }

    public static void addItem(){
        System.out.println("Enter the Grocery Item");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Current Item Name");
       // int itemNo = sc.nextInt();
        String itemNo = sc.nextLine();
        System.out.println("Enter Replacement Item");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }
    
    public static void removeItem(){
        System.out.println("Enter Item Name");
        String itemNo = sc.nextLine();
        //sc.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Enter Item to be Searched for");
        String searchItem = sc.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println(searchItem+" Found");
        }else{
            System.out.println(searchItem+" Not Found");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();     
        newArray.addAll(groceryList.getGroceryList());               //copy the whole content of groceryList to the newly made ArrayList

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
