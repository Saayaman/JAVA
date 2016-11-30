import javax.swing.*;

/**
 * Created by asayama on 2016-11-29.
 */
public class SquareRoot {

    public static void main (String[] args){
        String numStr, result;
        int num, again;

        do {
            numStr = JOptionPane.showInputDialog("Enter an integer: ");
            num = Integer.parseInt(numStr);
            result = "That squareroot is " + (Math.sqrt(num));


            JOptionPane.showMessageDialog(null, result);

            again = JOptionPane.showConfirmDialog(null, "Do Another?");
//            System.out.printf("sqrt(%.3f) is %.3f%n", num, Math.sqrt(num));
        } while (again == JOptionPane.YES_OPTION);
    }
}
