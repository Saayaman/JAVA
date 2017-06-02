import javax.swing.*;

/**
 * Created by ayako_sayama on 2017-05-31.
 */
public class Player implements Common {

    private ImageIcon playerImg;
    private Boolean isDead = false;
    private int killNum;
    private int x;
    private int y;


    private int movePlayer = 0;

    private PlayerAttack myAttack;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
        playerImg = new ImageIcon("src/images/.gif");
    }


    public void playerMove() {

        x += movePlayer;

        //this is to make the player stay within border!
        if (x >= FRAME_WIDTH - 2 * PLAYER_WIDTH){
            x = FRAME_WIDTH - 2 * PLAYER_WIDTH;
        }
    }
4
    public void playerAttack(){
        myAttack = new PlayerAttack(this.x, this.y);
    }

    public Boolean getDead() {
        return isDead;
    }

    public void setDead(Boolean dead) {
        isDead = dead;
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

    public PlayerAttack getMyAttack() {
        return myAttack;
    }

    public void setMyAttack(PlayerAttack myAttack) {
        this.myAttack = myAttack;
    }

    public int getMovePlayer() {
        return movePlayer;
    }

    public void setMovePlayer(int movePlayer) {
        this.movePlayer = movePlayer;
    }

    public ImageIcon getPlayerImg() {
        return playerImg;
    }
}
