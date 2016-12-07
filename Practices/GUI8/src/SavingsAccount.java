

public class SavingsAccount extends Account {


    private double interestRate;
    int i;

    public void SavingsAccount(double interestRate){

        this.interestRate = interestRate;

    }

    public void withdraw3(double inputs){
       super.withdraw(inputs);
    }

    public void setInterestRate(Double interestRate){
        interestRate = interestRate;
    }

    public void recalculateBalance(){
        System.out.println("\nAnnual Savings Account Balance");
        for (i = 1; i < 13; i++){
            balance += (balance * (interestRate / 100));
            System.out.println( "\nMonth"+ i+": $"+ balance);
        }
    }


    @Override
    public String toString() {
        return  "SavingsAcount: " +  "\n" +super.toString() +
                "\ninterestRate= " + interestRate + "%";
    }


}
