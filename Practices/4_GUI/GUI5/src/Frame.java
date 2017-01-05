/**
 * Created by ayako_sayama on 2016/11/30.
 */
import javax.swing.*;

/**
 * Created by ayako_sayama on 2016/11/28.
 */
public class Frame {

    //10 buttons
    static int count = 0;
    public static void main(String[] args){

        JFrame frame = new JFrame("Calculator");
        Panel panel = new Panel();
//        Dimension d = new Dimension(100,40);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);


    }

}
