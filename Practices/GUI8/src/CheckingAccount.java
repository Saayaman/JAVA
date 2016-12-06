/**
 * Created by ayako_sayama on 2016/12/05.
 */
public class CheckingAcount extends Account {


    private int MINIMUM_BAALANCE;
    private int OVERDRAFT_FEE;


    public void CheckingAcount(int accountNumber, int MINIMUM_BAALANCE, int OVERDRAFT_FEE){


        this.MINIMUM_BAALANCE = MINIMUM_BAALANCE;
        this.OVERDRAFT_FEE = OVERDRAFT_FEE;

    }

    public void withdraw(){


    }



}
