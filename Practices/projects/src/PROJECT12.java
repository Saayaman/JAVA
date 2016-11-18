import java.util.Random;
import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/17.
 */
public class PROJECT12 {
    public static void main(String[] args){
        System.out.print("Enter a 4 digit pin number to encrypt: ");
        Scanner scan = new Scanner(System.in);
        int pin = scan.nextInt();

        String encryptmiddle =  Integer.toHexString(pin);
        System.out.println(encryptmiddle);


        Random rand = new Random();
        int randomNum1 = rand.nextInt((9999 - 1000) + 1) + 1000;
        int randomNum2 = rand.nextInt((9999 - 1000) + 1) + 1000;

        String encryptleft = Integer.toHexString(randomNum1);
        String encryptright = Integer.toHexString(randomNum2);

        //For testing
      //  System.out.println("Random number1 is: " + randomNum1);
      //  System.out.println("Random number2 is: " + randomNum2);


        System.out.println("The encrypted number is: "+ encryptleft+encryptmiddle+encryptright);



        //int random1 = (int) Math.floor(Math.random() * die2);
    }
}
