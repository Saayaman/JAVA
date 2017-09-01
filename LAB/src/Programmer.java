public class Programmer {

    private static boolean isGood;
    private int experienceYears;



    public static void execute(){

        // StaticなメソッドからはStatic変数をアクセスできる
        isGood = true;

        //Staticなメソッドからnon-Static変数はアクセスできない。参照を使わないとだめ
        Programmer person1 = new Programmer();
        person1.experienceYears = 10;
    }

    // non-staticなメソッドからstatic変数はアクセスできる
    public void setExperienceYears(int years){
        this.experienceYears = experienceYears;
    }

    // non-staticなメソッドからnon-static変数はアクセスできる
    public void setIsGood(Boolean isGood){
        isGood = isGood;
    }
}
