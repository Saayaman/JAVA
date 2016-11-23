/**
 * Created by ayako_sayama on 2016/11/22.
 */
public class MAIN {

    public static void main(String[] args){

        HUMAN ayako = new HUMAN("ayako", "sayama", 29);
        SUPERHUMAN wolverine = new SUPERHUMAN("James", "Howlett", 30, "clawNails");

        // HUMAN ayako = new HUMAN("ayako", "sayama", 29);
        // is the same as
        // HUMAN ayako = new HUMAN();
        // ayako.setfirstName("ayako");
        // ayako.setlastName("sayama");
        // ayako.setage(29);

        ayako.printAllInfo();
        wolverine.printAllInfo();
    }

}
