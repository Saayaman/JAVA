/**
 * Created by ayako_sayama on 2017/01/05.
 */
public class Dictionary extends Book {

    private int definitions;

    public Dictionary(int numPages, int numDefinitions){
        super(numPages);
        definitions = numDefinitions;
    }

    public double computeRatio(){
        return definitions/pages;
    }

    public void setDefinitions(int numDefinitions){
        definitions = numDefinitions;
    }

    public int getDefinitions(){
        return definitions;
    }

}
