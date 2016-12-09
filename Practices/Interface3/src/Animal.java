/**
 * Created by ayako_sayama on 2016/12/07.
 */
public abstract class Animal {

    protected String type;
    protected String name;
    protected int age;
    protected boolean sound;



    public Animal(String type, String name, int age, boolean sound) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.sound = sound;
    }



    public void setType(String t) {
        this.type = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract boolean sound(boolean sound);

    public void setSound(boolean sound){
        this.sound = sound;
    }

    public boolean getSound(){
        return sound;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sound=" + sound +
                '}';
    }
}
