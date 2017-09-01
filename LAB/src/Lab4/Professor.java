package Lab4;

import java.util.Objects;

public class Professor extends Employee implements Comparable<Professor> {

    private  String teachingMajor;

    private final DressCode DRESS_CODE = DressCode.FANCY;
    private final double OVERTIME_PAY = 2.0;

    public Professor(String name, String teachingMajor) {
        super(name);
        this.teachingMajor = teachingMajor;
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
        return true;
    }

    @Override
    public String getWorkVerb() {
        return "teach";
    }


    @Override
    public int compareTo(Professor o) {
     return this.teachingMajor.length() - o.teachingMajor.length();
//        return this.teachingMajor.compar
// eTo(o.teachingMajor);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null){
            return false;
        }

        if (this == obj){
            return true;
        }

        if (!(obj instanceof Professor)){
            return false;
        }

        Professor professor = (Professor) obj;
        if (this.teachingMajor == professor.teachingMajor){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(teachingMajor);
    }

}
