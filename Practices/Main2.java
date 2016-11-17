//importing classes for scanning
import java.util.Scanner;

public class Main2
{
    public static void main(String[] x)

    {
		//you must decalse scanner and new scanner when you want to read or scan things.
		//system.in means you are going to read what is inputted/
        Scanner scan = new Scanner(System.in);

        //you must declare "int" when the variable is a NUMBER, not a STRING
        int num1, num2, num3;
        System.out.println("The fisrt number is:");
        num1 = scan.nextInt();
        System.out.println("The second number is:");
        num2 = scan.nextInt();
        System.out.println("The third number is:");
        num3 = scan.nextInt();

        //this prints out the average of the 3 numbers punched in
        System.out.println("The average of the numbers are:");
        System.out.println((float)(num1+num2+num3)/3);
    }
}
