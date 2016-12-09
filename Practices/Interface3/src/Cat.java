/**
 * Created by ayako_sayama on 2016/12/07.
 */

public class Cat extends Animal {

    public Cat(String type, String name, int age, boolean sound) {
        super(type, name, age, sound);
    }

    public boolean sound(boolean sound){
        return true;
    }


    @Override
    public String toString() {
        return "Cat name:"+ super.name +

                ", type: '" + super.type + '\'' +
                ", age: '" + super.age + '\'' +
                ", sound:"  + super.sound +
                '}';
    }

}
