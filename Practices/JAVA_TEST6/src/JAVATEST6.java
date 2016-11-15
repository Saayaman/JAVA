import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/14.
 */
public class JAVATEST6 {

    public static void main (String[] args) throws IOException {


        //scanning files and stuff

        Scanner scanFile = new Scanner(new File("name.txt"));
        Scanner scanString = new Scanner("Love is a game 10.");
        Scanner scanSystemIn = new Scanner(System.in);

        //"while" loop does the exact same in this case
        if(scanFile.hasNext()) {

            //nextLine()reads a whole line.
            System.out.println(scanFile.nextLine());

            // This time, reading the SECOND line
            System.out.println(scanFile.nextLine());

        }

        // Outside of the curly brackets it still scans the third line!
        System.out.println(scanFile.next());

        //nextInt() reads the next integer of sentence "Love is a game"
        System.out.println(scanString.next());


        //nextInt() reads/scans the next integer. But this will be an error because there is no integer the next line.
        int scanInt = scanFile.nextInt();
        System.out.println(scanInt);


        //chartAt gets the character of the variable
        String name = "Mike";
        System.out.println(name.charAt(2));


        //array
        String s = null;
        System.out.println(s);

        String welcome = "Welcome!"; //! is not a string. so if you include it without -1 , it will be null
        char[] chars = welcome.toCharArray();
        char lastChar = chars[chars.length -2];
        System.out.println(lastChar);

        for (int i = 0; i < chars.length; i++){
            System.out.println(chars[i]);
        }


    }

}
