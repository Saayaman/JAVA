/**
 * Created by ayako_sayama on 2016/12/05.
 */
public class SavingsAcount extends Account {


    private double interestRate;

    public void SavingsAcount(double interestRate){


        this.interestRate = interestRate;

    }

    public void withdraw(){

    }

    public void recalculateBalance(){

    }




    @Override
    public String toString() {
        return "SavingsAcount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
