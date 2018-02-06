
/**
 * A category. Not a thing, but rather the concept, or base that defines other things.
 *
 * @author Kameko Yamanaka
 * @version 2.1.17
 */
public abstract class Vehicle
{
    int seats;
    double speed;
    String name;
    
    public Vehicle(int seats, double speed, String name){
        this.seats = seats;
        this.speed = speed;
        this.name = name;
    }
    
    public void moveForward(){
        System.out.println("You move forward.");
    }
}
