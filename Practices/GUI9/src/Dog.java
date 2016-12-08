public class Dog extends Animal{

    public Dog(String name, boolean cute) {
        super.name = name;
        super.cute = cute;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.name + '\'' +
                ", cute=" + super.cute +
                '}';
    }

    @Override
    public void onBirth() {

    }

    @Override
    public boolean isCute() {
        return this.cute;
    }

}
