public class Cat extends Animal{

    public Cat(boolean isFun, String name) {
        super(isFun,name);
    }

    @Override
    protected void makeSound() {
        System.out.println("The "+name+ " said ... Meoow!");
    }
}
