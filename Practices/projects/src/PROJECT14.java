/**
 * Created by ayako_sayama on 2016/11/21.
 */
public class PROJECT14 {

    public  static void main(String[] args){
//        HUMAN saaya = new HUMAN();
//        HUMAN honda = new HUMAN();
//
//        //まだ
//        System.out.println(saaya.getFirstName());
//
//
//        saaya.setFirstName("saaya");
//        System.out.println(saaya.getFirstName());
//
//
//        System.out.println(honda.getFirstName());
//        honda.printAllinfo();


        // tatoeba
        String saayaFirstName = "ayako";
        String saayaLastName = "sayama";
        String hondaFirstName = "hiroki";
        String hondaLastName = "honda";

        System.out.println(saayaFirstName);
        System.out.println(saayaLastName);
        System.out.println(hondaFirstName);
        System.out.println(hondaLastName);

        // matomeru 1
        HUMAN saaya = new HUMAN("ayako", "sayama");
        HUMAN honda = new HUMAN("hiroki", "honda");
//        HUMAN saaya = new HUMAN();
//        saaya.setFirstName("ayako");
//        saaya.setLastName("sayama");
//        HUMAN honda = new HUMAN();
//        honda.setFirstName("hiroki");
//        honda.setLastName("honda");

        saaya.printAllinfo();
        honda.printAllinfo();

//        SUPERHUMAN superHuman = new SUPERHUMAN();
//        superHuman.setFirstName("super");
//        superHuman.setLastName("man");

        SUPERHUMAN superHuman = new SUPERHUMAN("ayako", "sayama", "supersaaya");
        superHuman.printAllinfo();
    }





}
