/**
 * Created by ayako_sayama on 2017/01/04.
 */
public abstract class StaffMember {

    protected String name, address, phone;


    //Constructor: Sets up this staff member using the specified information
    public StaffMember(String eName, String eAddress, String ePhone){
        name = eName;
        address = eAddress;
        phone = ePhone;
    }

    //Returns a string including the basic employee information
    public String toString(){
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;

        return result;

    }

    //Derived classes must define the pay method for each type of employee
    public abstract double pay();

}
