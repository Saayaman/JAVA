/**
 * Created by ayako_sayama on 2017/01/04.
 */
public class Volunteer extends StaffMember{

    public Volunteer(String eName, String eAddress, String ePhone){
        super(eName, eAddress, ePhone);
    }

    //you MUST use pay() method because you used a abstractin the Staffmember class
    public double pay(){
        return 0.0;
    }
}
