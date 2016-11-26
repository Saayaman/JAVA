import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/24.
 */
public class PROJECT14 {
    public static void main (String[] args){


        float[] prices = new float[100];
        //there are 100 floats in the prices array
        System.out.println(prices[0]);


        //print out arrays!
        int[] scores = {1, 4, 5 ,7 ,8};
        for(int score: scores)
            System.out.println(score);



         //setting array values by input!
        System.out.println("Please add amount of array: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int[] nums= new int[input];


        System.out.println("Address nums for the array: " + nums + "times");
        for (int i = 0; i< nums.length; i++){
            nums[i] = scan.nextInt();
        }

        //Solution 1. how to print out all the arrays
        System.out.print("The array nums inputted are: ");
        for (int num : nums)
        System.out.print("\"" + num + "\", ");
        System.out.print("\n");

        //Solution 2. How to print out arrays
        for (int i = 0; i< nums.length; i++){
            System.out.println("\"" + nums[i]+ "\"");
        }


    }
}
