import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by ayako_sayama on 2016/12/05.
 */
public abstract class Account {

    protected int accountNumber;
    protected double balance;
//    public double inputs;
    DecimalFormat df = new DecimalFormat("#.##");


    public Account(double deposit){
        deposit(deposit);
        accountNumber();

    }

    public void withdraw(double inputs){

        balance -= inputs;
    }


    public void deposit(double deposit){

        balance = balance + deposit;
    }

    public void accountNumber(){
        accountNumber = (int) Math.floor(Math.random()*90000)+10000;
    }


    public String toString() {

        return "accountNumber= " + accountNumber + "\nbalance= $" + df.format(balance);
    }


}