public class Driver
{
    public static void main(String[] args) {
        Animal cat = new Cat("Meny Cat",true);// polymorphism
        Animal cat2 = new Cat("Meny2 Cat",false);// polymorphism
        Animal cat3 = new Cat("Meny3 Cat",true);// polymorphism
        Dog dog = new Dog("Lucky Dog",false);
        Dog dog2 = new Dog("Lucky2 Dog",true);
        Dog dog3 = new Dog("Lucky3 Dog",false);
        OnCreatureBirth []creatureBirths = new Animal[]{dog,cat};
        Animal[] animals = new Animal[]{dog,cat,dog2,dog3,cat2,cat3};
        OnCreatureBirth xx = new OnCreatureBirth() {
            @Override
            public void onBirth() {
                System.out.println("bla bla bla");
            }

            @Override
            public boolean isCute() {
                return true;
            }
        };

        Cat cat1 = new Cat("Something",false);
        System.out.println(cat1.cute);
        cat1.setOnCreatureBirthListener(xx);
        System.out.println(cat1.isCute());


    }
}
