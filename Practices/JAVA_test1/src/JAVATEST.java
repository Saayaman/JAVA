import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/10.
 */
public class JAVATEST {
    public static void main (String[] args) {


        //This compares ways to define string! s1 s2 is the same!
        String s1 = "This is a string!";
        System.out.println(s1);
        String s2 = new String("This is also a string");
        System.out.println(s2);

        // an integer turns into a string when added to a string!
        String s3 = "Shirt Size";
        String s4 = "M";
        String s5 = s3 + ":" + s4 + " Qty: " + 4;
        System.out.println(s5);

        //the [] brackets tell you that this is an array
        //this turns a character array to a string!
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String s6 = new String(chars);
        System.out.println(s6);

        //this returns the array of characters!
        char[] chars2 = s6.toCharArray();
        for (char c : chars2){
            System.out.print(c);
            System.out.println(c);
        }

        //this changes an integer to a string!
        int intValue = 42;
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        //this changes the boolean to a string!
        boolean boolValue = true;
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        //this turns(formats) number into a number in your local!
        // the underscore is a JAVA 7 way of separating long numbers!
        long longValue = 10_000_000;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);



    }
}

