package Classes.Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if( health >0 && health <=100){
        this.hitPoints = health;
        }
        // else if(health>100){
        //     System.out.println("Error");
        // }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints<=0){
            System.out.println("Player Knocked Out");
        }

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    

    
    
}
