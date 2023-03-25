package Classes.Encapsulation;

public class Main {

    public static void main(String[] args){

        // Player player = new Player();
        // player.name = "Harshit";
        // player.health = 100;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining Health = " +player.healthRemaining());

        // damage = 11;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " +player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Harshit", 250, "Sword");
        System.out.println("Initial health is "+player.getHealth());

    }
    
}
