public class Cat extends Animal {

    private OnCreatureBirth onCreatureBirth;

    public Cat(String name, boolean cute) {
        super.name = name;
        super.cute = cute;
    }

    public void setOnCreatureBirthListener(OnCreatureBirth onCreatureBirth)
    {
        this.onCreatureBirth = onCreatureBirth;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.name + '\'' +
                ", cute=" + super.cute +
                '}';
    }
    @Override
    public void onBirth() {
        onCreatureBirth.onBirth();
    }

    @Override
    public boolean isCute() {
        return cute = onCreatureBirth.isCute();
    }
}
