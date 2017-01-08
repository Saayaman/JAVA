import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by ayako_sayama on 2017/01/06.
 */
public class ComissionEmployee extends Employee {

    private double grossSales;
    private double comissionRate = 0.15;
    double salary;

    DecimalFormat df = new DecimalFormat("#.##");


    public ComissionEmployee (String fName, String lName, double numGrossSales){
        super(fName, lName);
        grossSales = numGrossSales;
    }

    @Override
    public double pay() {

        setSalary();
        paidThisMonth = true;
        return salary;
    }

    private void setSalary() {
        salary = grossSales * 0.15;
    }


    public double getSalary(){
        return salary;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    @Override
    public String toString( ) {
        return
                super.toString()+ "Committion             |   " +

                grossSales +" * "+ comissionRate +" = $" + df.format(pay()) +
                "\n";
    }
}
