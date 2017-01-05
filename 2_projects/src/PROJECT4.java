import java.io.Console;
import java.util.Objects;
import java.util.Scanner;
import java.text.NumberFormat;


public class PROJECT4 {
    public static void main (String[] args)
    {
        double currentSalary;
        double raise;
        double newSalary;
        String rating;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the curernt salary:");
        currentSalary = scan.nextDouble();
        System.out.print("Enter the performance rating(Excellent, Good, or Poor): ");
        rating = scan.next();


        if (rating.equals("Excellent")){

            raise = currentSalary * 6 / 100;
        }
        else if (rating.equals("Good")){
            raise = currentSalary * 3 / 100;
        } else {
            raise = currentSalary * 1.5 / 100;
        }

        newSalary = currentSalary + raise;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of your Raise: " + money.format(raise));
        System.out.println("Your New Salary: " + money.format(newSalary));
        System.out.println();

    }
}
