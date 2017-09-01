package Lab4;

import java.util.Objects;

public class GasStation extends Employee implements Comparable<GasStation>{

    private double numberOfDollarsStolenPerDay;

    private final DressCode DRESS_CODE = DressCode.UNIFORM;
    private final double OVERTIME_PAY = 1.5;

    public GasStation(String name, double stolenDollar) {
        super(name);
        this.numberOfDollarsStolenPerDay = stolenDollar;
    }

    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY;
    }

    @Override
    public DressCode getDressCode() {
        return DRESS_CODE;
    }

    @Override
    public boolean isPaidSalary() {
        return false;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "pump";
    }

    @Override
    public int compareTo(GasStation o) {
        return Double.compare(this.numberOfDollarsStolenPerDay, o.numberOfDollarsStolenPerDay);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null){
            return false;
        }

        if (this == obj){
            return true;
        }

        if (!(obj instanceof GasStation)){
            return false;
        }

        GasStation gasStation = (GasStation) obj;
        if (this.numberOfDollarsStolenPerDay == gasStation.numberOfDollarsStolenPerDay){
            return true;
        }


        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfDollarsStolenPerDay);
    }
}
