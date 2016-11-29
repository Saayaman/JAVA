import java.util.Scanner;

public class PROJECT13 {
    public static int counter = 0;
    public static void main(String[] args){

        System.out.println("Enter Three Numbers: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        counter++;
        int input2 = scan.nextInt();
        counter++;
        int input3 = scan.nextInt();
        counter++;

        System.out.println("Welcome, please choose from the following");
        System.out.println("          1. Print the average of the 3 numbers above.");
        System.out.println("          2. Print out stars using while loop");
        System.out.println("          3. Print out stars from high to low using for");
        System.out.println("          4. Print out a counter of many times user used the program");
        System.out.println("          5. Change Numbers.");
        System.out.println("          6. Exit");


        int path = scan.nextInt();

        while (path != 6){

        switch (path){
            case 1:
                System.out.println("The average of the 3 numbers is:" + (input + input2 + input3) / 3);
                System.out.println("Done!");
                break;
            case 2:
                String x = "**********";
                int count = 10;
                while (count > 0){
                    count--;
                    System.out.println(x.substring(0,count));
                }
                System.out.println("Done!");
                break;
            case 3:
                x = "**********";
                count = 10;
                for(count = 10; count > 0; count-- ){
                    System.out.println(x.substring(0,count));
                }
                System.out.println("Done!");
                break;
            case 4:
                counter++;
                System.out.println("This is the number of times you have used this program:" + counter);
                System.out.println("Done!");
                break;
            case 5:
                System.out.println("Enter Three Numbers Again: ");
                input = scan.nextInt();
                counter++;
                input2 = scan.nextInt();
                counter++;
                input3 = scan.nextInt();
                counter++;
                System.out.println("Done!");
                break;

             default:
                 System.out.println("Dude, you punched the wrong number.");
                 break;

        }
            System.out.println("Now type in again from 1-6:");
            path = scan.nextInt();
        //System.out.println("Try in another number:");


        } System.out.println("You have exited!");

    }
}
