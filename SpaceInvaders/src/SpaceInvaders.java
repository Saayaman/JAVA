
import javax.swing.*;
import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class SpaceInvaders extends JFrame implements Commons {

    public SpaceInvaders() {

        initUI();
    }

    private void initUI() {

        add(new Board());
        setTitle("Space Invaders");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);


    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SpaceInvaders ex = new SpaceInvaders();
            ex.setVisible(true);
        });
    }

}
