/**
 * Created by ayako_sayama on 2016/11/15.
 */
public class PROJECT7 {
    public static void main(String[] args) {


        boolean b1 = true;
        boolean b2 = false;

        System.out.println("The value of bl is: " + b1);
        System.out.println("The value of b2 is: " + b2);

        //negation
        boolean b3 = !b1;
        System.out.println("The value of b3 is: " + b3);

        int i1 = 0;
        boolean b4 = (i1 != 0);
        System.out.println("The value of b4 is: " + b4);

        String sBoolean = "true";
        boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("Parsed: " + parsed);

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';
        System.out.println("Char 1: " + c1);
        System.out.println("Char 2: " + c2);
        System.out.println("Char 3: " + c3);

        char dollarSign = '\u0024';
        System.out.println("Currency is: " + dollarSign);

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';
        // print = does not indent the line
        System.out.print(Character.toUpperCase(a1));
        System.out.println(Character.toUpperCase(a2));
        System.out.print(Character.toUpperCase(a3));

        int x = 6, y = 2, z = 9;
        boolean isAvailable = false;
        if (isAvailable) {

            System.out.println("Available");
            System.out.println("condition passed");


            String name = new String("Aike");
            String name2 = new String("Mike");

            System.out.println(name.compareTo(name2) > 0);
        }


    }
}