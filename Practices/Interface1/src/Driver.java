/**
 * Created by ayako_sayama on 2016/12/06.
 */
public class Driver {

    public static void main(String[] args) {


        //polymorihimgs
        Cat cat = new Cat("Meny", true);
        Dog dog = new Dog("Lucky", false);


        onCreatureBirth[] creatureBirths = new Animal[]{cat, dog};

        System.out.println(cat);
        System.out.println(dog);


        System.out.println(creatureBirths[0]);


    }

}