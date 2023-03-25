package Classes.OOPS;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe","Sausage and Bacon",140,"White");
        super.addHamburgerAddition1("Chips", 35);
        super.addHamburgerAddition2("Drink", 50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot add additional items to an Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
        System.out.println("Cannot add additional items to an Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price){
        System.out.println("Cannot add additional items to an Deluxe Burger");
    }
    
    @Override
    public void addHamburgerAddition4(String name, double price){
        System.out.println("Cannot add additional items to an Deluxe Burger");
    }
    
    
}
