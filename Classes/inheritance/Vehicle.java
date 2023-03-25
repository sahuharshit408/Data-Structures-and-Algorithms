package Classes.inheritance;

public class Vehicle {
    private String name;
    private String size;


    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0; 

    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move() Moving at " + currentVelocity + " in direction " + currentDirection + " degrees");
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSize(String size) {
        this.size = size;
    }

    public void stop(){
        this.currentVelocity  = 0;
    }
    
}
