public abstract class Animal {
    protected boolean isFun=false;
    protected String name;

    public Animal(boolean isFun, String name)
    {
        this.isFun = isFun;
        this.name = name;
    }
    //forcing child class to implement this method
    // they can choose what they can do with it
    protected abstract void makeSound();
    protected boolean isAlive(){
        return true;
    }

}
