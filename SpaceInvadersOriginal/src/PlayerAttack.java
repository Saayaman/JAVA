import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * Created by ayako_sayama on 2017-05-31.
 */
public class PlayerAttack implements Common{
    private ImageIcon myBullet;
    private Boolean isVisible = true;
    private int x;
    private int y;


    public PlayerAttack(int playerX, int playerY){
        this.x = playerX + BulletWidth/2;
        this.y = playerY + BulletHeight/2;
        myBullet = new ImageIcon("src/Image/shot.gif");
    }

    public void move(){
        y = y+4;
    }

    public Boolean getVisible() {
        return isVisible;
    }

    public void setVisible(Boolean visible) {
        isVisible = visible;
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
