/**
 * Created by ayako_sayama on 2017/01/04.
 */
public abstract class Vehicle {
    private String model;
    private String make;
    private int year;
    private String color;
    private String engine;
    private int vin;

    public Vehicle(String model, String make, int year, String color, String engine, int vin){
        this.model = model;
        this.make = make;
        this.year = year;
        this.color = color;
        this.engine = engine;
        this.vin = vin;
    }


    public void setModel(String model){this.model = model;}
    public String getModel(){
        return model;
    }

    public void setMake(String make){this.make = make;}
    public String getMake(){return make;}

    public void setYear(int year){this.year = year;}
    public int getYear(){return year;}

    public void setColor(String color){this.color = color;}
    public String getColor(){return color;}

    public void setEngine(String engine){this.engine = engine;}
    public String getEngine(){return engine;}

    public void setVin(int vin){this.vin = vin;}
    public int getVin(){return vin;}


    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", vin='" + vin + '\''+", ";
    }
}
