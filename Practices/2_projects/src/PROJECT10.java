import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/16.
 */
public class PROJECT10 {
    public static void main (String[] args){

        final double OUNCES_PER_POUND = 16.0;

        double pricePerPound;
        double weightOunces;
        double weight;
        double totalPrice;

        Scanner scan = new Scanner(System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        DecimalFormat fmt = new DecimalFormat("#.##");


        System.out.println("Welcome to the CS Deli!!\n");
        System.out.print("Enter the price per pound of your items: ");
        pricePerPound = scan.nextDouble();

        System.out.print("Enter the weight(ounces): ");
        weightOunces = scan.nextDouble();

        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;

        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound.");
        System.out.println("Weight: " + weight + " pounds.\n");
        System.out.println("TOTAL: " + money.format(Double.parseDouble(fmt.format(totalPrice))));
    }
}
