
/**
 * Write a description of class Car here.
 *
 * @author Kameko Yamanaka
 * @version 2.1.18
 */
public class Car extends Vehicle implements BasicCar //always extend THEN implement
{
    // things a car HAS
    int wheels;
    int cylinders;
    boolean engineOn;
    int doors;

    public Car(int seats, double speed, String name, int wheels, int cylinders, int doors){ // constructor
        super(seats, speed, name); // gives elements from Vehicle to Car
        engineOn = false;
        this.wheels = wheels;
        this.cylinders = cylinders;
        this.doors = doors;
    }

    public void turnOn(){
        if (engineOn){
            System.out.println("The engine is already on.");
        } else{
            System.out.println("You turn the engine on. VROOM VROOM!");
            engineOn = true;
        }
    }

    public void turnOff(){
        if (engineOn){
            System.out.println("You turn the engine off. No more VROOM...");
            engineOn = false;
        } else{
            System.out.println("The engine is already off.");
        }
    }
    
    public void honk(){
        System.out.println("Quack!");
    }
}
