public class Dog extends Animal {

    public Dog(boolean isFun,String name)
    {
        super(isFun,name);
    }
    @Override
    protected void makeSound() {
        System.out.println(
                "The "
                +name
                + " said ... Woof!");
    }
}
