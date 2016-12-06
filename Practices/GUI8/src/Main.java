import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/12/05.
 */
public class Main {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String input1 = scan.nextLine();

        System.out.println("Would you like to make a new account?: Yes/No");

        if (input1.equalsIgnoreCase("Yes")) {
            makeAccount();
        } else {
            System.out.println("You have failed!");
        }


    }

    public static void makeAccount(){

        CheckingAcount cheqAccount = new CheckingAcount();
        SavingsAcount savAccount = new SavingsAcount();

    }


}
