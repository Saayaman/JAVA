/**
 * Created by ayako_sayama on 2017/01/05.
 */
public class FoodItem {

    final private int CALORIES_PER_GRA  = 9;
    private int fatGrams;
    protected int servings;

    public FoodItem(int numFatGrams, int numServings){
        fatGrams = numFatGrams;
        servings = numServings;
    }

    private int calories(){
        return fatGrams*CALORIES_PER_GRA;
    }

    public int caloriesPerServing(){
        return (calories()/servings);
    }


}
