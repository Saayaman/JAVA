/**
 * Created by ayako_sayama on 2017/01/05.
 */
public class SecretTest {

    public static void main(String[ ]args){

        String text = "I love you.";

        Secret hush = new Secret(text);
        System.out.println(text.length());
        System.out.println(hush);

        hush.encrypt();
        System.out.println(hush);

        hush.decrypt();
        System.out.println(hush);

    }
}
