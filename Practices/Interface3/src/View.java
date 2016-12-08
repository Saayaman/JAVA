import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.Marshaller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.BorderLayout.*;

/**
 * Created by ayako_sayama on 2016/12/07.
 */
public class View extends Main{

    private Listener listener;
    private Object source;

    private JButton addPet;
    private DefaultTableModel pets;

    public View() {
        view2();
    }

    private void view2() {

        String[][] tabledata = {
                {"日本", "3勝", "0敗", "1分"},
                {"クロアチア", "3勝", "1敗", "0分"},
                {"ブラジル", "1勝", "2敗", "1分"},
                {"オーストラリア", "2勝", "2敗", "0分"}};
        String[] columnNames = {"COUNTRY", "WIN", "LOST", "EVEN"};

        JFrame test = new JFrame("SwingTest");

        test.setTitle("aaa");
        test.setBounds( 10, 10, 300, 200);

        DefaultTableModel tableModel
                = new DefaultTableModel(tabledata, columnNames);

        JTable table = new JTable(tableModel);

        JScrollPane sp = new JScrollPane(table);
        sp.setPreferredSize(new Dimension(250, 70));

        JPanel p = new JPanel();
        p.add(sp);

        test.getContentPane().add(p, BorderLayout.CENTER);

        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

   private void view(){

       JFrame frame = new JFrame("Pets Database");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setResizable(false);

       JPanel panel = new JPanel(new BorderLayout());
       panel.setPreferredSize(new Dimension(500,500));

       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);


       //adding panels
       JPanel tablePanel = new JPanel(new BorderLayout());
       JPanel inputPanel = new JPanel(new CardLayout());
       JPanel buttonPanel = new JPanel(new BorderLayout());

       panel.add(tablePanel, BorderLayout.CENTER);
       panel.add(inputPanel, BorderLayout.SOUTH);
       //inputPanel.add(buttonPanel, BorderLayout.SOUTH);
       //2パネルと上と下に配置 / ボタンパネルを inputPanel の下に配置


       Object[] petColumns = {"Type", "Name", "Age", "Sound"};
       JTable table = new JTable(new DefaultTableModel(petColumns,0));
       JScrollPane scrollPane = new JScrollPane(table);
       scrollPane.setPreferredSize(new Dimension(480,480));
       pets = (DefaultTableModel)table.getModel();
       //scrollPane.add(table);
       //scrollable panel


       addPet = new JButton("Add to List");
       JToggleButton inputType = new JToggleButton("Choose Animalt Type");
       JTextField inputlName = new JTextField("Name");
       JTextField inputAge = new JTextField("Age");
       JRadioButton inputSound = new JRadioButton();

       tablePanel.add(scrollPane);
       inputPanel.add(addPet);
       inputPanel.add(inputType);
       inputPanel.add(inputlName);
       inputPanel.add(inputAge);
       inputPanel.add(inputSound);

       listener = new Listener();
       addPet.addActionListener(listener);


   }

   public void addRow(Object[] row) {
       pets.addRow(row);
   }


   private class Listener implements ActionListener{



       public void actionPerformed(ActionEvent event){

           source = event.getSource();

       }

   }


}
