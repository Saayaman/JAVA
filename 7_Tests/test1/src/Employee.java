/**
 * Created by ayako_sayama on 2017/01/06.
 */
public abstract class Employee {

    protected String firstName;
    protected String lastName;
    protected int id;
    protected boolean paidThisMonth;

    public Employee(String fName, String lName){

        firstName = fName;
        lastName = lName;
        id = 0;
        paidThisMonth = false;
    }

    public abstract double pay();

    public void setFirstName(String fName){
        firstName = fName;
    }

    public String getFirstName(){
        return firstName;
    }


    public void setLastName(String lName){
        lastName = lName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setId(int numId){
        id = numId;
    }

    public int getId(){
        return id;
    }


    @Override
    public String toString() {
        return "Name             |   Type            |   Paid for this \n"+
                "----------------------------------------------------------------"+
                firstName + " "+ lastName  +"    |   ";
    }
}
