/**
 * Created by ayako_sayama on 2017/01/04.
 */
public class Car extends Vehicle {

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

    @Override

    public String toString() {
        super.toString();
        return java.lang.String.valueOf(doors);
    }

}
