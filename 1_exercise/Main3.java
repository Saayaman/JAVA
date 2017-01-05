import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/10.
 */
 
public class JAVATEST {
    public static void main (String[] args) {

     
        StringBuilder sb = new StringBuilder("Goodbye");
     
        //with StringBuilder Class, you can use append!
        //there is a lot of types of append method for different data types.
        sb.append(", ");
        sb.append("World");
        sb.append("!");
        System.out.println(sb);

        //This version is the exact same as the one above!
        StringBuilder sb2 = new StringBuilder("Goodbye")
            .append(", ")
            .append("World Again")
            .append("!");
        System.out.println(sb);


        //scanner is a JAVA package! "system.in" line lets you get data from consol (or inputs from the value!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value: ");
        //scanner.nextLine lets you scan what is inputted in the next line!
        String input = scanner.nextLine();
        System.out.println(input);


        //.length calculates the num of chars in a string!
        sb.delete(0, sb.length());
        for (int i = 0; i < 3; i++){
            System.out.print("Enter value: ");
            input = scanner.nextLine();
            sb.append( "I am Java. I returned all 3 inputs for you: "+ input + "\n");
        }

        System.out.println(sb.toString());
        
            }
}

