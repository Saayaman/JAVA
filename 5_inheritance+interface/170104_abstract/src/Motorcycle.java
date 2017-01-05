/**
 * Created by ayako_sayama on 2017/01/04.
 */
public class Motorcycle extends Vehicle implements Drive {

    public Motorcycle(String model, String make, int year, String color, String engine, int vin){
        super(model, make, year, color, engine, vin);
    }


    @Override

    public String toString() {
        return "Vehicle{"
                + super.toString()
                + '}';
    }

    public void turnIgnitionOn(){
        System.out.println("This is the TurnIgnitionOn for the Motorcycle class");
    }

    public void steer(){
        System.out.println("This is the steer for the Motorcycle class");
    }


}
