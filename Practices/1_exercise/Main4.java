
/**
 * Created by ayako_sayama on 2016/11/10.
 */

public class Main4 {
    public static void main(String[] args){

        // Practicing with if else statement
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        if(str1 == str2){
            System.out.println("They Match!");
        } else {
            System.out.println("They Don't Match");
        }

        if (str1 == str3){
            System.out.println("They Match!");
        } else {
            System.out.println("They Don't Match!");
        }

        //be careful to add space!
        String part1 = "Hello";
        String part2 = " WORLD";
        String str4 = part1 + part2;

        //Ignoring Upper and lower cases
        String str5 = "Hello World";
        if (str4.equalsIgnoreCase(str5)){
            System.out.println("They Match!");
        } else{
            System.out.println("They Don't Match!");
        }


        //This is a practice of calculating substring!
        String s1 = "Welcome to California!";
        System.out.println("Length of substring: " + s1.length());

        //position is WHERE the value is counting from the beginning!
        int position = s1.indexOf("California");
        System.out.println("Position of substring: " + position);

        //substring takes out the nth number of charater
        String sub = s1.substring(12);
        System.out.println(sub);

        //trim(); takes out the white spaces!
        String s2 = "Welcome!       ";
        int len1 = s2.length();
        System.out.println(len1);
        //trim() trims the spaces
        String s3 = s2.trim();
        System.out.println(s3.length());
    }
}
