package Lab4;

import java.util.Objects;

public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {

    private int numberOfGoals;

    private final DressCode DRESS_CODE = DressCode.JERSEY;
    private final double OVERTIME_PAY = 0.0;

    public HockeyPlayer(String name, int numberOfGoals) {
        super(name);
        this.numberOfGoals = numberOfGoals;
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
        return true;
    }

    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    @Override
    public String getWorkVerb() {
        return "play";
    }

    @Override
    public int compareTo(HockeyPlayer o) {
        return Integer.compare(this.numberOfGoals, o.numberOfGoals);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null){
            return false;
        }

        if (this == obj){
            return true;
        }

        if (!(obj instanceof HockeyPlayer)){
            return false;
        }

        HockeyPlayer hockeyPlayer  = (HockeyPlayer)obj;
        if (this.numberOfGoals == hockeyPlayer.numberOfGoals){
            return true;
        }


        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfGoals);
    }
}
