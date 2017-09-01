package Lab3;

import java.util.Objects;

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

        if (obj == this) return true;
        if (!(obj instanceof Pawn)) {
            return false;
        }
        //this is safe to cast because the instance of is already checked!
        Pawn pawn = (Pawn) obj;
        return this.rank == pawn.rank;
    }

    //hashcode is like a unique object
    @Override
    public int hashCode() {
        return Objects.hash(rank);
    }

    public void promote(ChessPiece newChessPiece){
        newPiece = newChessPiece;
    }
}
