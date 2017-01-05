import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        String names[] = new String[5];
        int age = 0;
        int id = 0;


        Student one = new Student(names[0], age,id);
        Student two = new Student(names[1],age,id);
        Student three = new Student(names[2],age,id);
        Student four = new Student(names[3],age,id);
        Student five = new Student(names[4],age,id);

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        for (int s=0; s <  5; s++){

           System.out.println("Info of Student " + s);

            //enter name
            System.out.println("Enter name: ");
            names[s] = scan.nextLine();
            System.out.println("\n");

            //enter age
            System.out.println("Enter age: ");
            age = scan2.nextInt();
            System.out.println("\n");

            //enter ID
            System.out.println("Enter id: ");
            id = scan2.nextInt();
            System.out.println("\n");

            switch (s){
                case 0:
                    one = new Student(names[0], age, id);
                    break;
                case 1:
                    two = new Student(names[1], age, id);
                    break;
                case 2:

                    three = new Student(names[2], age, id);
                    break;
                case 3:
                    four = new Student(names[3], age, id);
                    break;
                case 4:
                    five = new Student(names[4], age, id);
                    break;
                default:
                    break;
            }

        }
        System.out.println( "Name      ||" + "    Age      ||" + "    Id     ||" + '\n' +
                "============================================" + '\n' );
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);

    }

}