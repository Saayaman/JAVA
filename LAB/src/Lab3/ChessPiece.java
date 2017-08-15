package Lab3;

public abstract class ChessPiece {

    int rank;

    public ChessPiece(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public abstract void move();

}
