
//RETURN hug for ALL cases

import java.util.Scanner;

public class HUG
{
    public static void main(String[] x)
    {
        Scanner feelings = new Scanner(System.in);

        System.out.println("I am feeling...");
        String saaya = feelings.nextLine();

        String bigHug = "Ahh don't worry! You are loved! BIG HUGS!!";
        String hug = "Everybody needs a hug, HUGS!!";

        if (saaya.equalsIgnoreCase("sad")) {

            System.out.println(bigHug);
        }

        else {
            System.out.println(hug);
        }

    }

}
