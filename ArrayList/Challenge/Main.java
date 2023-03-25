package ArrayList.Challenge;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8299243214");

    public static void main(String[] args){

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){

            System.out.println("\nEnter Action: (6 To show Available Actions");
            int action = sc.nextInt();
            sc.nextLine();

            switch(action){
                case 0:
                System.out.println("\n Shutting Down...");
                quit = true;
                break;

                case 1:
                mobilePhone.printContacts();
                break;

                case 2:
                addNewContact();
                break;

                case 3:
                updateContact();
                break;

                case 4:
                removeContact();
                break;

                case 5:
                queryContact();
                break;

                case 6:
                printActions();
                break;
            }

        }
    }

    private static void addNewContact(){
        System.out.println("Enter New Contact Name:");
        String name = sc.nextLine();
        System.out.println("Enter Phone Number");
        String phone = sc.nextLine();
        Contact newContact = Contact.createContact(name, phone);

        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact Added : Name = " +name+ ", Phone = "+phone);
        }else{
            System.out.println(name+" Already Exists.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter Existing Contact Name: ");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found");
            return;
        }

        System.out.println("Enter New Contact Name: ");
        String newName = sc.nextLine();
        System.out.println("Enter New Contact Phone Number: ");
        String newNumber = sc.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Contact Successfully Updated");
        }else{
            System.out.println("Error Updating Contact.");
        }
    }

    private static void removeContact(){
        System.out.println("Enter Existing Contact Name: ");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Contact Successfully Deleted");
        }else{
            System.out.println("Error Deleting Contact");
        }

    }

    private static void queryContact(){
        System.out.println("Enter Existing Contact Name: ");
        String name = sc.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact Not Found");
            return;
        }

        System.out.println("Name: "+existingContactRecord.getName()+" Phone Number is "+existingContactRecord.getPhoneNumber());

    }

    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void printActions() {
        System.out.println("\n Available actions : \npress");
        System.out.println("0 - To Shutdown\n"+
                           "1 - To Print Contacts\n"+
                           "2 - To Add a new Contact\n"+
                           "3 - To Update an Existing Contact\n"+
                           "4 - To Remove an Existing Contact\n"+
                           "5 - Query if an Existing contact Exists\n"+
                           "6 - To Print a List of Available Actions.");

        System.out.println("Choose your Action : ");                   
    }

    
    
}
