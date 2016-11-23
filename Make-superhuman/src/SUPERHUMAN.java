/**
 * Created by ayako_sayama on 2016/11/23.
 */
public class SUPERHUMAN extends HUMAN {

    private String SuperPowers;


    /**
     * super: inherits ths constructor that it calls（the method slash class）を呼ぶ
     * @param firstName
     * @param lastName
     * @param superpowers
     */




    public SUPERHUMAN(String firstName, String lastName, int age, String superpowers){

        super(firstName, lastName, age);
        //inherits the first and last name from HUMAN class
        this.SuperPowers = superpowers;
        //sets initial for superpowers

    }

    public void setSuperPowers(String superPowers){
        SuperPowers= superPowers;
    }

    public String getSuperPowers(){
       return SuperPowers;

    }

    public void printAllInfo(){

        super.printAllInfo();
        //inherits all printallinfo from HUMAN class
        System.out.println();
        return;
    }

}
