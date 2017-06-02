import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;


public class GameController extends JPanel implements Common {

    JLabel jLabel;

    private ArrayList<Alien> aliens;
    Player player;
    Bullet bullet;

    ArrayList<Bullet> bullets;
    int deaths = 0;

    Boolean gameRunning;
    Timer t;

    public GameController(JFrame frame){

        initCharacters();

        addKeyListener(listenKeys());

        gameRunning = true;
        frame.getContentPane();
        setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        setBackground(Color.black);

        jLabel = new JLabel("Click Anything to Start Game", JLabel.CENTER);
        jLabel.setForeground(Color.white);
        jLabel.setFont(new Font("Verdana",1,20));
        jLabel.setBorder(BorderFactory.createLineBorder(Color.white));
        jLabel.setVisible(false);

        setLayout(new GridBagLayout());
        add(jLabel);

        //MUST setFocusable
        setFocusable(true);

        gameStart();
    }

    private void gameStart() {
        if (gameRunning){
            ActionListener s = new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    moveAliens();
                    moveBullets();
                    repaint();
                }
            };

            t=new Timer(10, s);
            t.start();
        }
    }

    private void initCharacters() {

        aliens = new ArrayList<>();

        for (int row=0;row<8;row++) {
            for (int column=0;column<14;column++) {
                Alien enemy = new Alien(ENEMY_initX + 50 * column, ENEMY_initY + 35 * row);
                aliens.add(enemy);
            }
        }

        player = new Player();
        bullets = new ArrayList<>();
        bullet = new Bullet();
    }

    //Paint is automatically called in JPanel, when IOException readfile() is called!
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, getWidth(), getHeight());

        for (Alien alien : aliens) {
            if (alien.getVisible()) {
                g.drawImage(alien.enemyImage, alien.getAlienX(), alien.getAlienY(), this);
            }
        }

        if (bullet.isVisible()) {
            g.drawImage(bullet.getBulletImage(), bullet.getBulletX(), bullet.getBulletY(), this);
        }
        g.drawImage(player.getPlayerImage(), player.getPlayerX(), player.getPlayerY(), this);
    }

//    @Override
//    public void paint(Graphics g)
//    {
//        g.setColor(Color.black);
//        g.fillRect(0,0, getWidth(), getHeight());
//
//
//        for (Alien alien:aliens){
//
//            if (alien.getVisible()){
//                g.drawImage(alien.enemyImage, alien.getAlienX(), alien.getAlienY(), this);
//            }
//        }
//
//        if (bullet.isVisible()){
//            g.drawImage(bullet.getBulletImage(), bullet.getBulletX(), bullet.getBulletY(), this);
//        }
//
//            g.drawImage(player.getPlayerImage(), player.getPlayerX(),player.getPlayerY(), this);
//
//
//    }


    private void moveAliens() {

        int moveInt = 1;

        for (Alien alien : aliens) {

            if (alien.getVisible()){
                alien.moveAlien(moveInt);

                int enemyX = alien.getAlienX();
                if (enemyX >= FRAME_WIDTH - 40 || enemyX <= 10) {

                    moveInt = -moveInt;
                    Iterator i1 = aliens.iterator();

                    while (i1.hasNext()) {
                        Alien a2 = (Alien) i1.next();
                        a2.setAlienY(a2.getAlienY() + 10);
                    }
                }

                if (alien.getAlienY() == player.getPlayerY()){
                    gameOver();
                }

                if (alien.getAlienY() == FRAME_HEIGHT){
                    gameOver();
                }
            }

        }
    }

    private void gameOver() {
        gameRunning = false;
        gameStart();
        jLabel.setVisible(true);
        jLabel.setText("Game Over!");
    }


    private void moveBullets(){

        if (bullet.isVisible()){
            bullet.moveBullet();

            for (Alien alien : aliens) {

                if (alien.getVisible()){

                    int alienX = alien.getAlienX();
                    int alienY = alien.getAlienY();
                    int bulletX = bullet.getBulletX();
                    int bulletY = bullet.getBulletY();

                    if (bulletX >= (alienX)
                            && bulletX <= (alienX + ENEMY_WIDTH)
                            && bulletY >= (alienY)
                            && bulletY <= (alienY + ENEMY_HEIGHT))
                    {
                        bullet.setVisible(false);
                        alien.setVisible(false);
                        deaths++;
                    }
                }
            }

            if (deaths == aliens.size()){
                gameWon();
            }
        }
    }

    private void gameWon() {
        gameRunning = false;
        gameStart();
        jLabel.setVisible(true);
        jLabel.setText("Game Won!");
    }


    private KeyListener listenKeys() {

        KeyListener listener = new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                int x = player.getPlayerX();
                int y = player.getPlayerY();

                int key = e.getKeyCode();

                if (key == KeyEvent.VK_LEFT){
                    player.playerMove(-6);
                }

                if (key == KeyEvent.VK_RIGHT){
                    player.playerMove(6);
                }

                if (key == KeyEvent.VK_SPACE) {

                    bullet = new Bullet(x,y);
                    bullets.add(bullet);
                    bullet.moveBullet();
                }

            }


           @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();

                if (key == KeyEvent.VK_LEFT) {
                    player.playerMove(0);
                }

                if (key == KeyEvent.VK_RIGHT) {
                    player.playerMove(0);
                }
            }
        };

        return listener;
    }

}
