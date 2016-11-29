import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/17.
 */
public class PROJECT11 {


    public enum Season{
        SPRING, SUMMER, WINTER, FALL, AUTUMN
    }



    public static void main(String[] args){

        Scanner yourSeason = new Scanner(System.in);
        System.out.println("What is your favorite season?:");
        String answer = yourSeason.nextLine();


        if (answer.equalsIgnoreCase(Season.SPRING.toString())){
            System.out.println("You printed a season! Spring!");
        } else if (answer.equalsIgnoreCase(Season.SUMMER.toString())){
            System.out.println("You printed a season! Summer!");
        } else if (answer.equalsIgnoreCase(Season.WINTER.toString())){
            System.out.println("You printed a season! Winter!");
        } else if (answer.equalsIgnoreCase(Season.FALL.toString()) || answer.equalsIgnoreCase(Season.AUTUMN.toString())){
            System.out.println("You printed a season! FALL");
        }  else {
            System.out.println("I'm sorry. This is not a Season");
        }

    }


//    public void  IsSeason(){
//
//        switch (sName){
//            case SPRING:
//                System.out.println("You printed a season! Spring!");
//                break;
//            case SUMMER:
//                System.out.println("You printed a season! Summer!");
//                break;
//            case WINTER:
//                System.out.println("You printed a season! Winter!");
//                break;
//            case FALL:
//                System.out.println("You printed a season! Fall!");
//                break;
//            default:
//                System.out.println("I'm sorry. This is not a Season");
//                break;
//        }


}
