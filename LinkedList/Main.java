package LinkedList;

import java.util.ArrayList;

public class Main{

  

    public static void main(String[] args){

        Customer customer = new Customer("Harshit", 100);
        Customer anotheCustomer;
        anotheCustomer = customer;
        anotheCustomer.setBalance(50);
        System.out.println("Balance for Customer "+customer.getName()+" is "+anotheCustomer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(10);
        intList.add(20);
        intList.add(30);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i+ ": " +intList.get(i));
        }

        intList.add(2,50);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i+ ": " +intList.get(i));
        }
    }
}