
public class Driver {
    public static void main(String[] args) {
        Dog dog = new Dog(true,"Lucky");
        Cat cat = new Cat(false, "Meany");

        dog.makeSound();
        cat.makeSound();
        System.out.println(dog.isAlive());
    }
}
