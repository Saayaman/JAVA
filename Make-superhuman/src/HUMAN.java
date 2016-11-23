/**
 * Created by ayako_sayama on 2016/11/22.
 */
public class HUMAN {

    //theres only 3 scopes! 1.public 2.private 3.protected.

    private String firstName;
    private String lastName;
    private int age;

    public HUMAN(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    //public(protect) is the default
    //they can be read inside the same class. but nowhere else



    public void setFirstName(String firstname){
        firstName = firstname;
    }
    //

    public String getFirstName(){
        return firstName;
    }

    //the variable set here is only temporary! It can be anything.
    public void setLastName(String lastname){
       lastName = lastname;
    }

    public  String getLastName(){
        return lastName;
    }

    public void setAge(int age){
       age = age;
    }

    public int getAge(){
        return age;
    }

    public void printAllInfo(){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
        return;
    }
}