import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Image;

/**
 * Created by ayako_sayama on 2017-05-31.
 */
public class Enemy implements Common {



    //private BufferedImage enemyImg;
    private ImageIcon enemyImg;
    public Image enemyImage;
    public Boolean isDead = false;
    private int x;
    private int y;

    private EnemyAttack enemyAttack;
//    private Explode explode;


    public Enemy(int x, int y) throws IOException {
        this.x = x;
        this.y = y;
        enemyAttack = new EnemyAttack(x,y);

        enemyImage = ImageIO.read(new File("src/image/enemy.gif"));
        enemyImg = new ImageIcon("src/images/alien.gif");
//        setImage(enemyImg.getImage());

        JLabel thumb = new JLabel();
        thumb.setIcon(enemyImg);
    }

    public void enemyMove(int moveInt){

        //move 4px each time enemyMove is read
        this.x += moveInt;
    }

    public ImageIcon getEnemyImg() {
        return enemyImg;
    }

    public void setImage(Image enemyImage) {

        this.enemyImage = enemyImage;
    }

    public boolean isDead() {
        return isDead;
    }


    private class EnemyAttack {

        private final ImageIcon enemyBullet;
        private boolean destroyed;
        private int atkX;
        private int atkY;

        public EnemyAttack(int x, int y) {

            setDestroyed(true);
            this.atkX = x;
            this.atkY = y;
            enemyBullet = new ImageIcon("src/images/attack.png");

        }

        public boolean isDestroyed() {
            return destroyed;
        }

        public void setDestroyed(boolean destroyed) {
            this.destroyed = destroyed;
        }
    }

    public Image getEnemyImage() {
        return enemyImage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
