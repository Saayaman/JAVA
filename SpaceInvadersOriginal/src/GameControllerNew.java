import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class GameControllerNew extends Component implements Common {

    private static JPanel panel;
    Image image = null;

    CharacterController charController;


    public GameControllerNew() {
        try {
//            charController.paintImage();
            image = ImageIO.read(new File("src/shot.gif"));
        } catch (IOException e) {
        }

        System.out.println("Game Controller is initialized");
//        CharacterController charController = new CharacterController();
//        panel.add(charController);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(FRAME_WIDTH,FRAME_HEIGHT);
    }


    public static void main(String[] args) throws IOException {

        JFrame f = new JFrame("Space Invaders");

        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        f.add(new GameControllerNew());
        f.pack();
        f.setVisible(true);

        panel = (JPanel) f.getContentPane();
        panel.setPreferredSize(new Dimension(FRAME_HEIGHT,FRAME_WIDTH));
        panel.setLayout(null);

        panel.setFocusable(true);
        panel.setBackground(Color.black);

        CharacterController charController = new CharacterController();
        panel.add(charController);


    }

}

