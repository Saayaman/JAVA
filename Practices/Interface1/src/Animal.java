/**
 * Created by ayako_sayama on 2016/12/06.
 */
public abstract class Animal implements onCreatureBirth {
    protected String name  ="";
    protected boolean cute;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", cute=" + cute +
                '}';
    }
}
