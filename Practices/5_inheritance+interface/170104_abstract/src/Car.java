/**
 * Created by ayako_sayama on 2017/01/04.
 */
public class Car extends Vehicle implements Drive {

    private int doors;

    public Car(String model, String make, int year, String color, String engine, int vin, int doors){
        super(model, make, year, color, engine, vin);
        this.doors = doors;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getDoors(){
        return doors;
    }


    public void turnIgnitionOn(){
        System.out.println("This is the TurnIgnitionOn for the Car class");
    }

    public void steer(){
        System.out.println("This is the steer for the Car class");
    }


    @Override

    public String toString() {
        return "Vehicle{"
                + super.toString()
                + "doors='" + doors + '\''
                + '}';
    }

}
