package Classes.OOPS;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 60 , "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato",10);
        hamburger.addHamburgerAddition2("Lettuce", 20);
        hamburger.addHamburgerAddition3("Cheese", 30);
        System.out.println("Total Hamburger Price is "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 100);
        healthyBurger.addHamburgerAddition1("Egg", 30);
        healthyBurger.addHealthAddition1("Lentils", 30);
        System.out.println("Total Healthy Burger Price is "+healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
        
    }
    
}
