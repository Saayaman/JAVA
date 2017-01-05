/**
 * Created by ayako_sayama on 2017/01/04.
 */
public class Staff {

    private StaffMember[] stafflist;

    public Staff(){
        stafflist = new StaffMember[6];

        stafflist[0] = new Executive("Tony", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        stafflist[1] = new Employee("Paulie", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        stafflist[2] = new Employee("Vito", "789 Off Rocker", "656-0201", "123-45-6754", 1169.23);
        stafflist[3] = new Hourly("Michael", "678 Fifth Ave", "456-1335", "234-56-4245", 10.55);
        stafflist[4] = new Volunteer("Adrianna", "345 Babe Blvd", "234-4556");
        stafflist[5] = new Volunteer("Benny", "335 Babe Blvd", "234-4556");

        ((Executive)stafflist[0]).awardBonus(500.00);
        ((Hourly)stafflist[3]).addHours(40);

    }


    public void payday(){

        double amount;

        //pay for each staff member via array
        for(int count = 0; count < stafflist.length; count++){
            System.out.println(stafflist[count]);
            amount = stafflist[count].pay();

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("---------------------------------------------");
        }
    }

}
