import javax.swing.*;

/**
 * Created by asayama on 2016-11-29.
 */
public class Gui5 {

    public static void main (String[] args){


        //alt + enter key to import
        JFrame frame = new JFrame("Quote Options");
        QuoteOptionsPanel panel = new QuoteOptionsPanel();


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
