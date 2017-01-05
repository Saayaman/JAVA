

public class SavingsAccount extends Account {


    private double interestRate;
    int i;

    public SavingsAccount(double interestRate, double balance){

        super(balance);
        this.interestRate = interestRate;

    }

    public void withdraw(double inputs){
        balance -= inputs;
    }


    public void recalculateBalance(){
        System.out.println("\nAnnual Savings Account Balance");
        for (i = 1; i < 13; i++){
            balance += (balance * (interestRate / 12 / 100));
            System.out.println("Month"+ i+": $"+ df.format(balance));
        }
    }

    @Override
    public String toString() {
        return  "SavingsAcount: " +  "\n" +super.toString() +
                "\ninterestRate= " + interestRate + "%";
    }


}
