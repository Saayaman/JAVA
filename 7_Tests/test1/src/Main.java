import java.util.Scanner;

/**
 * Created by ayako_sayama on 2017/01/06.
 */
public class Main {

    public static void main(String[] args){

        int numEmployee = 0;
        String typeEmployee;
        Employee [ ]employees = new Employee[10];
        Scanner scan = new Scanner(System.in);


        while (numEmployee < 10){

        System.out.print("Welcome to Employee Salary System, please choose from the following:\n" +
                "1. Create an employee.\n" + "2. Print all employees (names and salaries).\n" +
                "3. Pay all employees for the month and print amount.\n" + "4. Exit\n\n" +
                "Enter here: "

        );


        int numAction = scan.nextInt();

        if (numAction == 1){



            System.out.println("Enter first name: ");
           String fName = scan.next();
//            employees[numEmployee].setFirstName(scan.next());
//            String fName = employees[numEmployee].getFirstName();

            System.out.println("Enter last name: ");
            String lName = scan.next();
//            employees[numEmployee].setLastName(scan.next());
//            String lName = employees[numEmployee].getLastName();

            System.out.println("Salary employee(1) or Commission employee(2)?");
            int numType = scan.nextInt();
            switch(numType) {
                case 1:
                    System.out.println("Enter Monthly Salary: ");
                    double monthlySalary = scan.nextDouble();
                    System.out.println("Salary Employee Created: ");


                    employees[numEmployee] = new SalaryEmployee(fName, lName, monthlySalary);

                    break;

                case 2:
                    typeEmployee = "Commission employee";
                    System.out.println("Enter Gross Sales of this month:");
                    double grossSales = scan.nextDouble();
                    System.out.println("Commission Employee Created: ");

                    employees[numEmployee] = new ComissionEmployee(fName, lName, grossSales);

                    break;
                default:
                    System.out.println("Wrong Number. System Shut Down");
                    break;
            }

            numEmployee++;



        } else if (numAction == 2){

            for (int i = 0; i < numEmployee; i++) {
                System.out.println(employees[i].toString());
            }

        } else if (numAction == 3){

            for (int i = 0; i < numEmployee; i++) {

                if (employees[i].paidThisMonth == true){
                    System.out.println(employees[i].firstName +" "+ employees[i].lastName + " already got paid for this month\n");
                } else {
                    employees[i].pay();

                }
            }

        } else{
            break;
        }

        }
        //if 10 workers are created, finish
        System.out.println("Goodbye");

    }



}
