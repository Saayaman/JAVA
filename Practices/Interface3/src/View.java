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


   public void view(){

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
       //JPanel buttonPanel = new JPanel(new BorderLayout());

       panel.add(tablePanel, BorderLayout.NORTH);
       panel.add(inputPanel, BorderLayout.SOUTH);
       //inputPanel.add(buttonPanel, BorderLayout.SOUTH);
       //2パネルと上と下に配置 / ボタンパネルを inputPanel の下に配置


       Object[] petColumns = {"Type", "Name", "Age", "Sound"};
       JTable table = new JTable(new DefaultTableModel(petColumns,0));
       JScrollPane scrollPane = new JScrollPane(table);
       scrollPane.setPreferredSize(new Dimension(480,480));
       DefaultTableModel pets = (DefaultTableModel)table.getModel();
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


   private class Listener implements ActionListener{



       public void actionPerformed(ActionEvent event){

           source = event.getSource();

       }

   }


}
