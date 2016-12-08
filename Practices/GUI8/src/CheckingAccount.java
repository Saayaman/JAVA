public class CheckingAccount extends Account {


    private int MINIMUM_BALANCE;
    private int OVERDRAFT_FEE;


    public CheckingAccount(int MINIMUM_BALANCE, double balance){

        super(balance);
        this.MINIMUM_BALANCE = MINIMUM_BALANCE;
        this.OVERDRAFT_FEE = overDraftFee();
}


//    public void setMINIMUM_BALANCE(int i){
//        MINIMUM_BALANCE = i;
//    }

    private int overDraftFee() {

        if(balance < (double)MINIMUM_BALANCE){
            OVERDRAFT_FEE = (int) ((MINIMUM_BALANCE - balance) * 0.03);
        }else {
            OVERDRAFT_FEE = 0;
        }

        return OVERDRAFT_FEE;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        overDraftFee();
    }

    @Override
    public void withdraw(double inputs) {
        balance -= inputs;
        overDraftFee();
    }

    @Override
    public String toString() {
        return "CheckingAcount: " + "\n" + super.toString() +
                "\nMINIMUM_BAALANCE= $" + MINIMUM_BALANCE +
                "\nOVERDRAFT_FEE(3%)= $" + OVERDRAFT_FEE;
    }
}
