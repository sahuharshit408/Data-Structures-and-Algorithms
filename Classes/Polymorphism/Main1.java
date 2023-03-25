package Classes.Polymorphism;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders,String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }

    public String startEngine(){
        return "Car-> StartEngine()";
    }

    public String accelerate(){
        return "Car-> accelerate()";
    }

    public String brake(){
        return "Car-> brake()";
    }
}

class Mitsubushi extends Car{

    public Mitsubushi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return "Mitsubushi-> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Mitsubushi-> accelerate()";
    }

    @Override
    public String brake(){
        return "Mitsubushi-> brake()";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine(){
        return getClass().getSimpleName()+" -> startEngine()";
    }

    @Override
    public String accelerate(){
        return "Ford-> accelerate()";
    }

    @Override
    public String brake(){
        return "Ford-> brake()";
    }
}

public class Main1 {

    public static void main(String[] args){

        Car car = new Car(8, "Sedan");
        System.out.println(car.startEngine());  
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubushi mistubushi = new Mitsubushi(6, "XUV");
        System.out.println(mistubushi.startEngine());
        System.out.println(mistubushi.accelerate());
        System.out.println(mistubushi.brake());

        Ford ford = new Ford(4, "Hatchback");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());  
        System.out.println(ford.brake());
    }
    
}
