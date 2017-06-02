import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("Space Invaders");
        GameController controller = new GameController(frame);

        frame.getContentPane().add(controller);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);


        //if you close window, game will end!
        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //Repaint everything inside GameController while game is running!
//        while (controller.gameRunning) {
//            controller.repaint();
//            Thread.sleep(10);
//        }
    }
}
