import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by ayako_sayama on 2017-05-31.
 */
public class CharacterController extends JPanel implements Common{

//    private ArrayList<ImageIcon> images;
    private ArrayList<Enemy> enemies;
    private Player player;
    private Enemy e;
    private ArrayList<PlayerAttack> playerAttacks;
    private int killNum = 0;




    private KeyAdapter mykeyAdapter;


    public CharacterController() throws IOException {

        System.out.println("Character Controller is initialized");

        mykeyAdapter = new MyKeyAdapter();
//        e = new Enemy(100, 100);


        enemies = new ArrayList<>();
        int enemyCount = 0;
        for (int row=0;row<5;row++) {
            for (int column=0;column<12;column++) {

                Enemy enemy = new Enemy(ENEMY_INIT_X + 50 * column, ENEMY_INIT_Y + 35 * row);
                enemies.add(enemy);
//                images.add(enemy.getEnemyImg());
                enemyCount++;
            }
        }

        player = new Player(PLAYER_INIT_X, Common.PLAYER_INIT_Y);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(e.getEnemyImage(), 100, 100, 100, 100, this);
    }


    @Override
    protected void paintComponent(Graphics g) {
        System.out.println("PaintComponent is executed");

        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        g.setColor(Color.green);

//        if (runningGame) {

            g.drawLine(0, 560, FRAME_WIDTH, 560);
            g.drawImage(e.getEnemyImage(), 100, 100, 100, 100, this);
//        drawCharacters(g);
//            drawAliens(g);
//            drawPlayer(g);
//            drawShot(g);
//            drawBombing(g);
////        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    private void drawCharacters(Graphics g) {

        Iterator it = enemies.iterator();

        for (Enemy enemy: enemies) {

            if (!enemy.isDead()) {

                g.drawImage(enemy.enemyImage, enemy.getX(), enemy.getY(), this);
            }

        }



    }

//    @Override
//    public void paint() {
//        for (ImageIcon image: images){
//            g.drawImage(image,0,0,null);
//        }
//    }

//    public ArrayList<ImageIcon> paintImage(){
//
//        for (ImageIcon icon: images){
//            icon = createImage("src/ship.gif");
//        }
//        return images;
//    }



    //this is already looping
    public void loop(){


        if (killNum == ENEMY_NUM) {

            //GameWon!
//            runningGame = false;
//            message = "Game won!";
        }

        // keep moving the player to x position
        player.playerMove();

        // move aliens
        int moveInt = 4;
        for (Enemy enemy: enemies) {

            if (!enemy.isDead){

                int enemyX = enemy.getX();
                int enemyY = enemy.getY();
                enemy.enemyMove(moveInt);

                //for each enemy that is alive, check if it hits the borders.
                if (enemyX >= FRAME_WIDTH - 2 * ENEMY_WIDTH){
                    moveInt = -moveInt;
                    enemy.setY(enemyY + 10);
                }

                //if enemy hits the character, gameOVer

                //if enemy hits the bottom, gameover

                //shoot randomly

                //if player's attack hits the enemy, kill them
                //count the killnum
            }
        }


        //keep the shoot moving when shot
        for(PlayerAttack attack: playerAttacks){


        if (attack.getVisible() == true) {

            attack.move();
            int playerATKy = attack.getY();

            //if attack hits the ceiling, make it invisible

            //if attack hits the enemy kill enemy
            //count enemykill
        }


        }

//            //for each enemy
//            for (Enemy alien: enemies) {
//
//                int alienX = alien.getX();
//                int alienY = alien.getY();
//
//                //if alien is still alive, keep on showing them on the canvas
//                if (alien.isVisible() && shot.isVisible()) {
//                    if (shotX >= (alienX)
//                            && shotX <= (alienX + ALIEN_WIDTH)
//                            && shotY >= (alienY)
//                            && shotY <= (alienY + ALIEN_HEIGHT)) {
//                        ImageIcon ii
//                                = new ImageIcon(explImg);
//                        alien.setImage(ii.getImage());
//                        alien.setDying(true);
//                        deaths++;
//                        shot.die();
//                    }
//                }
//            }
//
//
//            if (y < 0) {
//                shot.die();
//            } else {
//                shot.setY(y);
//            }
//



        Iterator it = enemies.iterator();
        while (it.hasNext()) {
        }

        // bombs
//        Random generator = new Random();
//
//        for (Alien alien: aliens) {
//
//            int shot = generator.nextInt(15);
//            Alien.Bomb b = alien.getBomb();
//
//            if (shot == CHANCE && alien.isVisible() && b.isDestroyed()) {
//
//                b.setDestroyed(false);
//                b.setX(alien.getX());
//                b.setY(alien.getY());
//            }
//
//            int bombX = b.getX();
//            int bombY = b.getY();
//            int playerX = player.getX();
//            int playerY = player.getY();
//
//            if (player.isVisible() && !b.isDestroyed()) {
//
//                if (bombX >= (playerX)
//                        && bombX <= (playerX + PLAYER_WIDTH)
//                        && bombY >= (playerY)
//                        && bombY <= (playerY + PLAYER_HEIGHT)) {
//                    ImageIcon ii
//                            = new ImageIcon(explImg);
//                    player.setImage(ii.getImage());
//                    player.setDying(true);
//                    b.setDestroyed(true);
//                }
//            }
//
//            if (!b.isDestroyed()) {
//
//                b.setY(b.getY() + 1);
//
//                if (b.getY() >= GROUND - BOMB_HEIGHT) {
//                    b.setDestroyed(true);
//                }
//            }
//        }

    }

    public void clear(){

    }

    public KeyAdapter getMykeyAdapter() {
        return mykeyAdapter;
    }


    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            super.keyTyped(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);

            int x = player.getX();
            int y = player.getY();

            int key = e.getKeyCode();

            if (key == KeyEvent.VK_SPACE) {

                PlayerAttack playerAttack = new PlayerAttack(x, y);
                playerAttacks.add(playerAttack);

            }

            if (key == KeyEvent.VK_LEFT){
                player.setMovePlayer(-2);
//                player.playerMove();
            }

            if (key == KeyEvent.VK_RIGHT){

                player.setMovePlayer(2);
//                player.playerMove();
            }

        }

        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT){
                player.setMovePlayer(0);
//                player.playerMove();
            }


        }
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                JFrame container = new JFrame("Space Invaders");
//                container.setResizable(false);
//
//                JPanel panel = (JPanel) container.getContentPane();
//                panel.setPreferredSize(new Dimension(FRAME_HEIGHT,FRAME_WIDTH));
//
//
//                panel.setFocusable(true);
//                panel.setBackground(Color.black);
//            }
//        });
//    }

}
