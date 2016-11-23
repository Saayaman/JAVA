import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by asayama on 2016-11-22.
 */

public class MYCLASS {


    private String name;
    private String address;
    private String major;
    private double gpa;


    public MYCLASS(String name, String address, String major) {
        this.name = name;
        this.address = address;
        this.major = major;
        this.gpa = getGPA();
    }

    public MYCLASS(String name, String address) {
        this(name, address, "undeclared");
//        this.name = name;
//        this.address = address;
//        this.gpa = getGPA();
//        this.major = "undeclared";
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return address;
    }


    public double getGPA() {

        double gpa = (Math.random()*3.5)+0.5;
        return gpa;
    }

    public void printAllInfo() {
        NumberFormat gpaScore = new DecimalFormat("#0.00");
        System.out.println(name);
        System.out.println(address);
        System.out.println(major);
        System.out.println(gpaScore.format(gpa));

    }


}
