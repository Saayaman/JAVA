/**
 * Created by ayako_sayama on 2016/11/18.
 */
public class CodeBat3 {

    public static void main (String[] args){

        String text = "I am a super hero";
        String[] saaya =  text.split("");
        String[] saaya2 =  text.split(" ");

        //array の数は length()ではなく！length;でとれる！
        int i = saaya.length;
        int i2 = saaya2.length;
        System.out.println(i);
        System.out.println(i2);

        //arrayの中の[何番め]をとってくる！
        System.out.println(saaya[0]); //一文字を持ってくる
        System.out.println(saaya2[3]); // 文字を持ってくる


        String values = "0|0|0|1|||0|1|0|||";
        // 縦棒を抜きたい場合
        String[] array = values.split("\\|");
        int arrayL = array.length;
        int count = 0;
        for (count = 0; count < arrayL; count++){
            System.out.print(array[count]);
        }
    }
}
