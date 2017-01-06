
public class Words {

    public static void main(String[] args){
        Dictionary penguin = new Dictionary();

        System.out.println("Num of Pages: " + penguin.getPages());
        System.out.println("Num of Definitions: " + penguin.getDefinitions());

        System.out.println("Definitions per page: " + penguin.computeRatio());
    }
}
