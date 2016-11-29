import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/16.
 */
public class PROJECT9 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("How many sides does die 1 have?: ");
        int die1 = scan.nextInt();
        System.out.print("How many sides does die 2 have?: ");
        int die2 = scan.nextInt();

        int  roll1Die1 = (int) Math.floor(Math.random() * die1);
        System.out.println("Die1 First Roll: " + roll1Die1);

        int roll1Die2 = (int) Math.floor(Math.random() * die2);
        System.out.println("Die2 First Roll:" + roll1Die2);

        int roll2Die1 = (int) Math.floor(Math.random() * die1);
        System.out.println("Die1 Second Roll:" + roll2Die1);

        int roll2Die2 = (int) Math.floor(Math.random() * die2);
        System.out.println("Die2 Second Roll:" + roll2Die2);

        int roll3Die1 = (int) Math.floor(Math.random() * die1);
        System.out.println("Die1 Third Roll:" + roll3Die1);

        int roll3Die2 = (int) Math.floor(Math.random() * die2);
        System.out.println("Die2 Third Roll:" + roll3Die2);

        int sumDie1 = roll1Die1 + roll2Die1 + roll3Die1;
        int sumDie2 = roll1Die2 + roll2Die2 + roll3Die2;

        float averageDie1 = (float)sumDie1 / 3;
        float averageDie2 = (float)sumDie2 / 3;
        DecimalFormat dices = new DecimalFormat("#.###");

        System.out.println("Die1 rolled a total of " + sumDie1 + " and rolled " + dices.format(averageDie1) + " on average.");
        System.out.println("Die2 rolled a total of " + sumDie2 + " and rolled " + dices.format(averageDie2) + " on average.");

    }

}