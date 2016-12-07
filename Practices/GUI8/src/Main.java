import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/12/05.
 */
public class Main {


    private static CheckingAccount cheqAccount;
    private static SavingsAccount savAccount;


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Would you like to make a new account?: Yes/No");
        String input1 = scan.nextLine();

        if (input1.equalsIgnoreCase("Yes")) {
            makeAccount();
        } else {
            System.out.println("You have failed!");
        }

        System.out.println("How much deposit to cheqing account? ");
        Double input2 = scan.nextDouble();
        cheqAccount.deposit(input2);

        System.out.println("How much deposit to savings account");
        Double input3 = scan.nextDouble();
        savAccount.deposit(input3);

        System.out.println("Your account info right now:");
        printResult();

        savAccount.recalculateBalance();
        //this includes printing out as well


        System.out.println("How much do you want to withdraw from cheqing? ");
        Double input4 = scan.nextDouble();
        cheqAccount.withdraw2(input4);

        System.out.println("How much do you want to withdraw from savings? ");
        Double input5 = scan.nextDouble();
        savAccount.withdraw3(input5);


        System.out.println("Your account info right now:");
        printResult();

    }


    public static void makeAccount(){


        cheqAccount = new CheckingAccount();
        savAccount = new SavingsAccount();

        cheqAccount.accountNumber();
        cheqAccount.setMINIMUM_BALANCE(100);
        cheqAccount.overDraftFee();


        savAccount.accountNumber();
        savAccount.setInterestRate((double) 5);

    }

    private static void printResult() {

        System.out.println("\n" +cheqAccount);
        System.out.println("\n" +savAccount);

//        System.out.println("Cheqing Balance is: $"+cheqAccount.balance);
//        System.out.println("Cheqing Account No. is: "+cheqAccount.accountNumber);
//        System.out.println("Savings Balance is: $"+savAccount.balance);
//        System.out.println("Savings Account No. is: "+savAccount.accountNumber);

    }



}
