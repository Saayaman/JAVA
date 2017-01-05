import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ayako_sayama on 2016/11/28.
 */
public class Gui1 {


    static int count = 0;
    //count++ does not work if it is put inside main:

    public static void main(String[]args){


        //adds a new frame(window/page)
        JFrame frame = new JFrame("Push Counter");

        //add a Panel // boxes or sections ~ can be many more
        JPanel panel = new JPanel();

        //add a button
        JButton buttonCounter = new JButton("Push me");


        JLabel label = new JLabel("pushes: "+count);

        //Action listener going to call a function:
        //it listenes to any action

        buttonCounter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Click.." );
                label.setText("pushes: " +(count ++));
            }
        });


        //Adds buttons and colors to the panel
        panel.add(buttonCounter);
        panel.add(label);
        panel.setPreferredSize(new Dimension(400,100));
        panel.setBackground(Color.cyan);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //close on exit: don't run project after closure!

        frame.getContentPane().add(panel);
        //THe panel is inside the frame
        //this takes the panel and sticks it in a FRAME

        frame.pack();
        //resizes the correct size that is set
        frame.setVisible(true);
        //show it!!
    }
}
