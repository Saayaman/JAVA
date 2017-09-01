package Lab4;

public abstract class Employee implements Employable {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract public double getOverTimePayRate();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
