import java.util.Scanner;

/**
 * Created by ayako_sayama on 2017/01/06.
 */
public class ReverseOrder {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("The size of the array: " + numbers.length);

        for (int index = 0; index < numbers.length; index++){
            System.out.println("Enter number " + (index+1) + ": ");
            numbers[index] = scan.nextDouble();
        }

        System.out.println("The numbers in reverse order");

        for (int index = numbers.length-1; index >= 0; index--){
            System.out.print(numbers[index]+" ");
        }
    }
}
