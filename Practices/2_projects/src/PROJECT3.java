import java.util.Random;
import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/10.
 */
public class PROJECT3 {
    public static void main(String[] args)
    {
        String personPlay;
        String computerPlay;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

//        do{
//            System.out.println("Type in 'Rock', 'Scissors' or 'Papers'!" );
//            personPlay = scan.next();
//            //System.out.println(personPlay);
//        } while(personPlay.equalsIgnoreCase("Rock") ||personPlay.equalsIgnoreCase("Scissors") || personPlay.equalsIgnoreCase("Papers"));
//
//        System.out.println("DoWhile Worked!");
//        System.out.println("This is where the computer random will be executed!");



        System.out.println("Type in 'Rock', 'Scissors' or 'Paper'!" );
        personPlay = scan.next();

        while (!
                (       personPlay.equalsIgnoreCase("rock")
                        ||
                        personPlay.equalsIgnoreCase("scissors")
                        ||
                        personPlay.equalsIgnoreCase("paper")
                )
                )
        {

            System.out.println("You typed it wrong you BAKA! Do it again");
            personPlay = scan.next();
        }


        //This is where the computer random will be executed!
        int computerInt = generator.nextInt(3);
        //　3 = [0,1,2] だよ！


        // 1. OPTION1/   using if else statement
        // Translating computer's random generate to string
//        if(computerInt == 0){
//            System.out.println("The Computer's Random Answer is: Rock!" );
//            computerPlay = new String("Rock");
//        } else if (computerInt == 1) {
//            System.out.println("The Computer's Random Answer is: Paper!" );
//            computerPlay = "Paper";
//        } else {
//            System.out.println("The Computer's Random Answer is: Scissors!" );
//            computerPlay = "Scissors";
//        }

        //2. Another way of writing: with switch statement

        switch (computerInt){
            case 0:
                computerPlay = "rock";
                System.out.println("The Computer's Random Answer is: Rock!" );
                break;
            case 1:
                computerPlay = "paper";
                System.out.println("The Computer's Random Answer is: Paper!" );
                break;
            case 2:
                computerPlay = "scissors";
                System.out.println("The Computer's Random Answer is: Scissors!" );
                break;
            default:
                System.out.println("Something Went Wrong!" );
                return;

        }

        //Who won??
        if (personPlay.equalsIgnoreCase(computerPlay)) {
            System.out.println("It's a tie!");
        }  else if (((personPlay.equalsIgnoreCase("rock") && computerPlay.equalsIgnoreCase("scissors"))) || ((personPlay.equalsIgnoreCase("paper") && computerPlay.equalsIgnoreCase("rock"))) ||  ((personPlay.equalsIgnoreCase("scissors") && computerPlay.equalsIgnoreCase("paper"))) ){

            System.out.println("You Won!");
        } else {
            System.out.println("You Lost!");
        }

    }
}