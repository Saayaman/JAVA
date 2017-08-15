package Lab3;

import java.util.Objects;

public class King extends ChessPiece {

    // you MUST use static to use as constant. Because if not, you have to initialize King object to use it.
    public static final int RANK = 1000;

    public King() {
        super(RANK);
    }

    @Override
    public void move() {
        System.out.println("one square");
    }

    @Override
    public String toString() {
        return "King: rank is " + RANK;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) return true;
        if (!(obj instanceof Pawn)){
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
}
