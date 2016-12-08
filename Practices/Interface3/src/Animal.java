/**
 * Created by ayako_sayama on 2016/12/07.
 */
public abstract class Animal {

    private String type;
    private String name;
    private int age;
    protected boolean sound;

    public Animal(String type, String name, int age, boolean sound) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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



}
