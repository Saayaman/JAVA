public abstract class Vehicle {
    private String type;
    private String make;
    private String model;
    private int year;

    public Vehicle(String type, String make, String model, int year) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public String getType()
    {
        return this.type;
    }

}
