/**
 * Created by ayako_sayama on 2017/01/05.
 */
public class FoodAnalyzer {

    public static void main(String[] args){
        Pizza special = new Pizza(227);
        System.out.println("Calories per serving= " + special.caloriesPerServing());
    }
}
