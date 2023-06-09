package ArrayList;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();
     
    public void addGroceryItem(String item){
        groceryList.add(item); //add() is a method in arrayList to add a element stored in item
                               //ArrayList automatically creates space for adding an item .. user is not needed to worry about it  
    }

    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) +". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem , String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryItem(position,newItem);
        }
    }

    private void modifyGroceryItem(int position , String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Item "+(position+1)+" has been modified.");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        //String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    //public String findItem(String searchItem){
       // boolean exists = groceryList.contains(searchItem);
    //    int position = groceryList.indexOf(searchItem);

    //    if(position>=0){
    //     return groceryList.get(position);
    //    }
    //    return null; 



   // }

   private int findItem(String searchItem){
    return groceryList.indexOf(searchItem);
   }

   public boolean onFile(String searchItem){
    int position = findItem(searchItem);
    if(position >= 0){
        return true;
    }
    return false;

   }
    
}
