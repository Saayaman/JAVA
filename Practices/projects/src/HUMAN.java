/**
 * Created by ayako_sayama on 2016/11/21.
 */
public class HUMAN {

    private String firstName = "supersaaya";
    //public(protect) is the default
    //同じフォルダ(src)の中だったらどこからでも参照OK

    private String lastName;
    public String test;


    public HUMAN() {

    }

    public HUMAN(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    //戻り値いらないからvoid

    public String getFirstName(){
    //method で必要な要素は最低限 3つ
        // 1. public or private or protected 2.return or not? (void == does not return)

        return firstName;
    }


    public void setFirstName(String args){
        firstName = args;
        //これはfirstnameに何かを入れたいときにこー書く
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void printAllinfo()
    {
        System.out.println(firstName);
        System.out.println(lastName);
        return;
    }
}
