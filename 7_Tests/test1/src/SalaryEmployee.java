/**
 * Created by ayako_sayama on 2017/01/06.
 */
public class SalaryEmployee extends Employee{

    private double monthlySalary;

    public SalaryEmployee(String fName, String lName, double numMonthlySalary){

        super(fName, lName); //あとで確認
        monthlySalary = numMonthlySalary;
    }


    public void setMonthlySalary(double numMonthlySalary){
        monthlySalary = numMonthlySalary;
    }

    public double getMonthlySalary(){
        return monthlySalary;

    }

    @Override
    public double pay() {
        double salary;
        salary = monthlySalary;
        paidThisMonth = true;
        return salary;
    }

    @Override
    public String toString() {
        return
                 super.toString()+ "Salary           |   "+
                 + monthlySalary +
                "\n";
    }
}
