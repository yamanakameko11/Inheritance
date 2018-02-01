
/**
 * Write a description of class KeylessCar here.
 *
 * @author Kameko Yamanaka
 * @version 2.1.18
 */
public class KeylessCar extends Car
{
    public KeylessCar(int seats, double speed, String name, int wheels, int cylinders, int doors){
        super(seats, speed, name, wheels, cylinders, doors);
    }

    public void turnOn(){
        if(engineOn){
            System.out.println("It already on, ya dingus!!!");
        } else{
            System.out.println("You push the button and the car goes VRMMMMM!");
            engineOn = true;
        }
    }

    public void turnOff(){
        if(engineOn){
            System.out.println("You push the button and the car goes silent...");
            engineOn = false;
        } else{
            System.out.println("The car is already off, my guy!");
        }
    }
}
