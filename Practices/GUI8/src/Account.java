/**
 * Created by ayako_sayama on 2016/12/05.
 */
public abstract class Account {

    protected int accountNumber;
    protected double balance;

    public void Account(int deposit){
        

    }

    protected abstract void withdraw();

    protected void deposit(){

    }

    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

}
