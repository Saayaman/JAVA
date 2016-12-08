import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by ayako_sayama on 2016/12/07.
 */
public class Main {


    //public static DefaultTableModel pets;


    DefaultTableModel pets;

    public static void main(String[] args) {


        View view = new View();
        view.view();

        Animal[] animals = new Animal[]

                {
                        new Dog("husky", "Max", 2, true),
                        new Cat("mike", "Tama", 4, true),
                };

        System.out.println(animals[0]);


        for (int i = 0; i < animals.length; i++) {
            view.pets.addRow(
                    new Object[]{
                            animals[i].getName(),
                            animals[i].getAge(),
                            animals[i].getSound(),
                            animals[i].getType()
                    });

        }




    }
}