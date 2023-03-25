package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        LinkedList<String> placesToVisit = new LinkedList<String>();
       addInOrder(placesToVisit,"Mumbai");
       addInOrder(placesToVisit,"Delhi");
       addInOrder(placesToVisit,"Chennai");
       addInOrder(placesToVisit,"Kolkata");
       addInOrder(placesToVisit,"Ahemdabad");
       addInOrder(placesToVisit,"Lucknow");
       addInOrder(placesToVisit,"Bhopal");
        
       printList(placesToVisit);

       visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " +i.next());
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList , String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if(comparison == 0){
                System.out.println(newCity+ " is already included in the List");
                return false;
            }else if(comparison > 0){
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //normally add new city
            }
        }

        stringListIterator.add(newCity);
        return true;

    }

    private static void visit(LinkedList cities){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No Cities in the itenerary");
        }else{
            System.out.println("Now Visiting "+listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();
            switch(action){
                case 0 :
                System.out.println("Vacation Over");
                quit = true;
                break;

                case 1:
                if(!goingForward){
                    if(listIterator.hasNext()){
                        listIterator.next();
                    }
                    goingForward = true;
                }
                if(listIterator.hasNext()){
                    System.out.println("Now Visiting "+listIterator.next());
                }else{
                    System.out.println("Reachede the end of the List");
                    goingForward = false;
                }
                break;

                case 2:
                if(goingForward){
                    if(listIterator.hasPrevious()){
                        listIterator.previous();
                    }
                    goingForward = false;
                }
                if(listIterator.hasPrevious()){
                    System.out.println("Now Visiting "+listIterator.previous());
                }else{
                    System.out.println("We are at the Start of the List");
                    goingForward = true;
                }
                break;

                case 3:
                printMenu();
                break;

            }
        }

    }

    private static void printMenu(){
        System.out.println("Available Options: \nPress ");
        System.out.println("0 - To Quit\n"+
                           "1 - To Go to next City\n"+
                           "2 - To Go to previous City"+
                           "3 - To Print Menu Options");
    }
    
}
