import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.io.IOException;


public class GameController extends Canvas implements Runnable,Common {

    private static CharacterController charController;

    private Thread gameThread;
    private boolean runningGame = true;

    public boolean isRunningGame() {
        return runningGame;
    }



    public static void main(String argv[]) throws IOException {
        GameController gamecontroller = new GameController();
//        charController = new CharacterController();

    }

    public GameController(){

        System.out.println("Game Controller is initialized");
        //Create a frame & panel
        JFrame container = new JFrame("Space Invaders");
        container.setResizable(false);

        JPanel panel = (JPanel) container.getContentPane();
        panel.setPreferredSize(new Dimension(FRAME_HEIGHT,FRAME_WIDTH));
        panel.setLayout(null);

        setBounds(0,0,FRAME_HEIGHT,FRAME_WIDTH);
        panel.add(this);
        panel.setFocusable(true);
        panel.setBackground(Color.black);

        //double buffering is drawing graphics that shows no (or less) stutter, tearing, and other artifacts.
        panel.setDoubleBuffered(true);
        panel.setFocusable(true);

        setIgnoreRepaint(true);
        requestFocus();


//        createBufferStrategy(2);
//        BufferStrategy strategy = getBufferStrategy();

        System.out.println("Panel is suppposed to be made?");

        //Starting a game Thread!
        if (gameThread == null || !runningGame) {

            gameThread = new Thread(this);
            gameThread.start();
            //after .start(), run() is autimatically executed
        }

        addKeyListener(charController.getMykeyAdapter());

    }

    private void gameOver() {
    }

    @Override
    public void run() {

        long beforeTime, timeDiff, sleep;
        beforeTime = System.currentTimeMillis();


        while(runningGame){

            charController.repaint();
            repaint();
            charController.loop();

            //assuming this means, for XXX secs, the canvas is updated.
            timeDiff = System.currentTimeMillis() - beforeTime;
            sleep = DELAY - timeDiff;

            if (sleep < 0) {
                sleep = 2;
            }

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }

            beforeTime = System.currentTimeMillis();
        }
    }
}
