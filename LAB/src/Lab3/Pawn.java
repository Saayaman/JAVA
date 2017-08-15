package Lab3;

public class Pawn extends ChessPiece{

    protected boolean hasBeenPromoted;
    protected ChessPiece newPiece;

    public static final int RANK = 1;

    public Pawn() {
        super(RANK);
    }

    @Override
    public void move() {
        System.out.println("forward 1");
    }

    @Override
    public String toString() {
        return "Pawn: rank is " + RANK;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void promote(ChessPiece newChessPiece){
        newPiece = newChessPiece;
    }
}
