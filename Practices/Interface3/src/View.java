import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * Created by ayako_sayama on 2016/12/07.
 */
public class  View {

   public static void view(){


       JFrame frame = new JFrame("Pets Database");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setResizable(false);

       JPanel panel = new JPanel();
       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);


       Object[] petColumns = {"Type", "Name", "Age", "Sound"};
       JTable table = new JTable(new DefaultTableModel(petColumns,0));

       JScrollPane scrollPane = new JScrollPane(table);
        //scrollable panel



   }



}
