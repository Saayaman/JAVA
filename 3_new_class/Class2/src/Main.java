import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/23.
 */
public class Main {

    public static void main(String[] args){


        CreditCard one = new CreditCard("AYAKO SAYAMA", 500);
        System.out.println(one);
//        CreditCard two = new CreditCard("MOHA ALAMRI", 600);
//        System.out.println(two);


        //1. pay each month. Do this for 6 months.
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i < 7; i++){
            System.out.println("\n" + "Month" + i + ": yes[1]/no[0] / Would you like to purchase something this month?:");
            int payMonth = scanner.nextInt();
            if (payMonth == 0){
                System.out.println("You haven't bought anything this month");
                //Printing out the balance now
                System.out.println("Your Balance now is $" + one.getBalance());
                //asking if you want too pay.

                System.out.println("yes[1]/no[0]: Do you want to make a payment for this month?");
                double yesPay = scanner.nextDouble();

                while (yesPay > 1){
                    System.out.println("Wrong Number: Press 1 or 0");
                    yesPay = scanner.nextDouble();
                }

                if (yesPay == 0){
                    double raiseRate = 2;
                    one.raiseRate(raiseRate);
                    System.out.println("You haven't payed for this month. " +
                            "Your account holder rate raised by 2%: ");
                    System.out.println(one);

                } else {
                    System.out.println("How much do you want to pay?");

                    double payAmount = scanner.nextDouble();
                    one.makePayment(payAmount);

                    System.out.println(one);
                }

            } else if (payMonth == 1){

                //Scanning the purchase amount
                System.out.println("Purchase Amount: ");
                double purchase = scanner.nextDouble();
                one.makePurchase(purchase);

                //Printing out the balance now
                System.out.println("Your Balance now is $" + one.getBalance());

                //asking if you want too pay.
                System.out.println("yes[1]/no[0]: Do you want to make a payment for this month?");
                double yesPay = scanner.nextDouble();

                while (yesPay > 1){
                    System.out.println("Wrong Number: Press 1 or 0");
                    yesPay = scanner.nextDouble();
                }

                if (yesPay == 0){
                    double raiseRate = 2;
                    one.raiseRate(raiseRate);
                    System.out.println("You haven't payed for this month. " +
                            "Your account holder rate raised by 2%: ");
                    System.out.println(one);

                } else {
                    System.out.println("How much do you want to pay?");

                    double payAmount = scanner.nextDouble();
                    one.makePayment(payAmount);

                    System.out.println(one);
                }

            } else {System.out.println("Wrong number: Start from beginning");
            break;}
        }

    }


}
