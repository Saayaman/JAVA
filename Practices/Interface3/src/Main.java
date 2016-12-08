/**
 * Created by ayako_sayama on 2016/12/07.
 */
public class Main {
    public static void main(String[] args){



        View view = new View();

        Animal[] animals = new Animal[]

                {
                        new Dog("husky", "Max", 2, true),
                        new Cat("mike", "Tama", 4, true),
                };

        System.out.println(animals[0]);

//        for (int i = 0; i < animals.length; i++) {
//            animals.addRow(
//                    new Object[]{
//                            animals[i].getName(),
//                            animals[i].getAge(),
//                            animals[i].getSound(),
//                            animals[i].getYear()
//                    }
//            );
        }

    }


