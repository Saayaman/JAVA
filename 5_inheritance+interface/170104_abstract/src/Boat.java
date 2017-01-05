/**
 * Created by ayako_sayama on 2017/01/04.
 */
public class Boat extends Vehicle implements Drive {

    private String type;
    private int size;

    public Boat(String model, String make, int year, String color, String engine, int vin, String type, int size){
        super(model, make, year, color, engine, vin);
        this.type = type;
        this.size = size;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void  setSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public void turnIgnitionOn(){
        System.out.println("This is the TurnIgnitionOn for the Boat class");
    }

    public void steer(){
        System.out.println("This is the steer for the Boat class");
    }


    public String toString() {
        return "Vehicle{"
                + super.toString() + '\''
                + "type='" + type + '\''
                + "size='" + size + '\''
                + '}';
    }
}
