import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by ayako_sayama on 2017-06-01.
 */
public class Board extends JPanel {

    //This is a test!

//    private Enemy enemy = new Enemy(100, 100);
    private Image img;
    private Image img2;
    public Board(){

        //ImageIO.read() and paintComponent is a set! You have to use them both to show them.
        try{ img = ImageIO.read(new File("src/Image/shot.gif"));}
        catch (IOException e){ e.printStackTrace(); }
    }

    @Override

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img, 100, 100, this);
    }

    public static void main(String[] args) throws IOException {

        Board board = new Board();
        JFrame frame = new JFrame("Practice");
        frame.getContentPane().add(board);
        frame.pack();
        frame.setVisible(true);
    }
}
