/**
 * Created by ayako_sayama on 2016/12/05.
 */
public abstract class Account {

    protected int accountNumber;
    protected double balance;
    public double inputs;


    public void Account(double deposit){
        deposit(deposit);
        accountNumber();

    }

    public void withdraw(double inputs){
        balance -= this.inputs;
    }


    public void deposit(double deposit){

        balance = balance + deposit;
    }

    public void accountNumber(){
        accountNumber = (int) Math.floor(Math.random()*90000)+10000;
    }


    public String toString() {
        return "accountNumber= " + accountNumber + "\nbalance= $" + balance;
    }


}