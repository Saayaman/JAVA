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


}
