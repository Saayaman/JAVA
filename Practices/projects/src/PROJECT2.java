import java.util.Scanner;

/**
 * Created by ayako_sayama on 2016/11/14.
 */
public class PROJECT2 {

    public static void main(String args[]){


            //splits the letters
            String str[] = "He is the one".split(" ");
            String finalStr="";

//
//            //splits the characters
//
//            for(int i = str.length-1; i>= 0 ;i--){
//                finalStr += str[i]+" ";
//            }
//
//            System.out.println(finalStr);




//          //approach 1
//                Scanner scan = new Scanner(System.in);
//                StringBuilder buildS = new StringBuilder(scan.nextLine());
//                System.out.println("REVERSE WORD: " + buildS.reverse().toString());

        //approch 2 : but this will already reverse the one reversed before
//            Scanner scan = new Scanner(System.in);
//
//            //stringbuilderクラス とは？ 文字列の結合・挿入・部分配置・部分削除・検索・取り出しができる。
//            StringBuilder buildS = new StringBuilder(scan.nextLine());
//            String result= "";
//            for(int i = buildS.length(); i>0; i--) {
//                result+= buildS.charAt(i-1);
//            }
//            System.out.println("REVERSE WORD: " + result);


        //approach 3: using while loop

        //Why do we have to add a string here?
        String sentence;
        String word;
        String tempWord="";

        System.out.println("Type in any sentence:");
        Scanner scan = new Scanner(System.in);
        Scanner scanLine = new Scanner(scan.nextLine());

        while (scanLine.hasNextLine())
        {
            word = scanLine.nextLine();
            for (int i = word.length()-1; i >= 0; i--) {
                tempWord+=word.charAt(i);
            }
            word =tempWord;
            tempWord ="";
            System.out.print(word+ " ");
        }

    }
}
