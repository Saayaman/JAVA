

public class CheckingAccount extends Account {


    private int MINIMUM_BALANCE;
    private int OVERDRAFT_FEE;


    public void CheckingAccount(int MINIMUM_BALANCE){

        this.MINIMUM_BALANCE = MINIMUM_BALANCE;
        this.OVERDRAFT_FEE = overDraftFee();

}


    public void setMINIMUM_BALANCE(int i){
        MINIMUM_BALANCE = i;
    }

    public int overDraftFee() {


        if(balance < (double)MINIMUM_BALANCE){

            OVERDRAFT_FEE = (int) ((MINIMUM_BALANCE - balance) * 0.05);
        }else {
            OVERDRAFT_FEE = 0;
        }

        return OVERDRAFT_FEE;
    }


    public void withdraw2(int inputs){
        super.withdraw((double)inputs);
    }



    public String toString() {
        return "CheckingAcount: " + "\n" + super.toString() +
                "\nMINIMUM_BAALANCE= $" + MINIMUM_BALANCE +
                "\nOVERDRAFT_FEE(3%)= $" + OVERDRAFT_FEE;
    }
}
