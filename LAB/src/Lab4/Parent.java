package Lab4;

import java.util.Objects;

public class Parent extends Employee implements Comparable<Parent> {

    private int numberOfHoursSpentPerWeekWithKids;

    private final DressCode DRESS_CODE = DressCode.ANYTHING;
    private final double OVERTIME_PAY = -2.0;

    public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
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
        return "care";
    }

    @Override
    public int compareTo(Parent o) {
        return Integer.compare(this.numberOfHoursSpentPerWeekWithKids, o.numberOfHoursSpentPerWeekWithKids);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null){
            return false;
        }

        if (this == obj){
            return true;
        }

        if (!(obj instanceof Parent)){
            return false;
        }


        Parent parent = (Parent)obj;
        if (this.numberOfHoursSpentPerWeekWithKids == parent.numberOfHoursSpentPerWeekWithKids){
            return  true;
        }

        return false;
    }



    @Override
    public int hashCode() {
        return Objects.hash(numberOfHoursSpentPerWeekWithKids);
    }
}
