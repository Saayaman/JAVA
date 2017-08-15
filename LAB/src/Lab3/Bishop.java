package Lab3;

public class Bishop extends ChessPiece {

    public static final int RANK = 3;

    public Bishop() {
        super(RANK);
    }

    @Override
    public void move() {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Bishop: rank is " + RANK;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
