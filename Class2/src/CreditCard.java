import java.math.BigDecimal;

/**
 * Created by ayako_sayama on 2016/11/23.
 */
public class CreditCard {


    private static double baseRate =0.01;
    private static long lastAccountNumber = 0000001;


    //double if it has decimals
    //account number can be integer or long
    private String accountHolder;
    private long accountNumber;


    private double balance;
    private int creditScore;
    private double rate;
    private double creditLimit;


    public CreditCard(String accountHolder, int creditScore) {

        this.accountHolder = accountHolder;
        this.creditScore = creditScore;
        this.balance = 0;
        this.accountNumber = lastAccountNumber++;

//        this.creditScore = creditScore;
//        this.rate = rate;
//        this.creditLimit = creditLimit;

        if (creditScore >= 0 || creditScore < 300){
            this.rate = baseRate + ((baseRate*10)/100);
            this.creditLimit = 1000;
        } else if (creditScore >= 300 || creditScore < 500){
            this.rate = baseRate + ((baseRate*7)/100);
            this.creditLimit = 3000;
        } else if (creditScore >= 500 || creditScore < 700){
            this.rate = baseRate + ((baseRate*4)/100);
            this.creditLimit = 7000;
        } else {
            this.rate = baseRate + ((baseRate*1)/100);
            this.creditLimit = 15000;
        }
    }



    public void makePurchase(double purchaseAmount){

        if (purchaseAmount + balance > creditLimit){
            return;
        } else {
            balance = balance + purchaseAmount;
        }
    }

    public void makePayment(double payAmount){
        if (payAmount > balance){
            // over payment
            balance = 0;
            creditScore = creditScore+10;
            System.out.println("You have payed more than balance.");
        } else if (payAmount < (balance * 10/100)){
            // under 1/10
            balance = balance - payAmount;
            rate = rate + 0.1;
        } else if (payAmount == balance){
            balance = 0;
            creditScore = creditScore+10;
        } else {
            balance = balance - payAmount;
        }

    }

    public void raiseRate(double raiseRate){
        rate = rate + raiseRate;
    }

    public void raiseLimit(double raiseLimit){
        creditLimit = creditLimit + raiseLimit;
    }

    public void calculateBalance(){
        balance = balance + (balance * (rate/12));
    }


//    public String toString(){
//

//
//
//      String holderName = "Account Holder Name: " + accountHolder;
//        String secretAccount = "Account.number"+ decryptedAccount;
//      return holderName, secretAccount;
//}


    @Override
    public String toString() {
        String accountString = Integer.toString((int)accountNumber);
        String decrypted = accountString.substring(4,7);
        String decryptedAccount = "****" + decrypted;
        return "CreditCard{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + decryptedAccount +
                ", balance=" + balance +
                ", creditScore=" + creditScore +
                ", rate=" + rate +
                ", creditLimit=" + creditLimit +
                '}';

        //toString をプリントするときはこれをmain にいれるべし。
//        CreditCard c = new CreditCard("a", 2);
//        System.out.println(c.toString());

    }

    public void printall() {
        System.out.println("Account Holder Name: " + accountHolder);
        System.out.println("Credit Score: " + creditScore);
        System.out.println("My Balance: "+balance);
        System.out.println("Annual Interest Rate: " +rate);
        System.out.println("My Credit Card Limit: $"+ creditLimit);



    }
}
