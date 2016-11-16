import com.sun.tools.corba.se.idl.IncludeGen;

/**
 * Created by ayako_sayama on 2016/11/15.
 */
public class PROJECT5 {

    public static void main (String[] args){

        String college = new String("PoDunk Collge");
        String town = "Anytime, USA";

        int stringLength;
        String change1, change2, change3;

        //using length
        stringLength = college.length();
        System.out.println(college + " contains " + stringLength + " characters.");

        //using to uppercase
        change1 = college.toUpperCase();
        System.out.println(change1);

        //replacing letters
        change2 = change1.replace("O","*");
        System.out.println(change2);

        //concatinating scrings
        change3 = college.concat(" " + town);
        System.out.println(change3);
    }
}
