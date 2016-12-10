/**
 * Created by ayako_sayama on 2016/12/07.
 */
public abstract class Animal {

    private String type;
    private String name;
    private int age;
    private boolean sound;

    protected Animal(String type, String name, int age, boolean sound) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.sound = sound;
    }


    public String getType() {
        return type;
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
