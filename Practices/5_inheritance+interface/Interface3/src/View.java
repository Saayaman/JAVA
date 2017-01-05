import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.Marshaller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import static java.awt.BorderLayout.*;

/**
 * Created by ayako_sayama on 2016/12/07.
 */
public class View{

    private JButton addPet;
    private DefaultTableModel pets;
    private Object source;
//    private ActionListener petListener;

    private JComboBox inputType;
    private JTextField inputName;
    private JTextField inputAge;
    private JRadioButton soundYes;
    private JRadioButton soundNo;

    public static int animalNumber = 0;
    public static Animal[] animals = new Animal[100];

    public View() {
        view();
    }


   private void view(){

       JFrame frame = new JFrame("Pets Database");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.setResizable(false);

       JPanel panel = new JPanel(new BorderLayout());
       panel.setPreferredSize(new Dimension(500,500));


       //adding panels
       JPanel tablePanel = new JPanel(new BorderLayout());
       JPanel addPetPanel = new JPanel(new BorderLayout());
       JPanel inputPanel = new JPanel(new GridLayout(2,2));
       JPanel buttonPanel = new JPanel(new BorderLayout());

       panel.add(tablePanel, BorderLayout.CENTER);
       panel.add(addPetPanel, BorderLayout.SOUTH);
       addPetPanel.add(buttonPanel, BorderLayout.SOUTH);
       addPetPanel.add(inputPanel, BorderLayout.NORTH);
       //2パネルと上と下に配置 / ボタンパネルを inputPanel の下に配置


       Object[] petColumns = {"Type", "Name", "Age", "Sound"};

       JTable table = new JTable(new DefaultTableModel(petColumns,0));
       //DefaultTableModel(列、行)

       pets = (DefaultTableModel)table.getModel();
       JScrollPane scrollPane = new JScrollPane(table);
       scrollPane.setPreferredSize(new Dimension(480,480));

       addPet = new JButton("Add to List");

       //スライドで選択
       String[] animalType = {"Cat", "Dog" };
       inputType = new JComboBox(animalType);
       inputName = new JTextField("Name");
       inputAge = new JTextField("Age");
       JLabel inputSound = new JLabel("Makes Sound?:");

       soundYes = new JRadioButton("Yes");
       soundNo = new JRadioButton("No");

       ButtonGroup bg1 = new ButtonGroup( ); //can only select one from buttongroup
       bg1.add(soundYes);
       bg1.add(soundNo);

       tablePanel.add(scrollPane);
       inputPanel.add(inputType);
       inputPanel.add(inputName);
       inputPanel.add(inputAge);
       inputPanel.add(inputSound);
       inputPanel.add(soundYes);
       inputPanel.add(soundNo);
       buttonPanel.add(addPet);

        addPet.addActionListener(addPetListener);

       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);

   }


    public void addRow(Object[] animalRow) {
       pets.addRow(animalRow);
   }

    private ActionListener addPetListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {

            source = event.getSource();

            String animalType = (String) inputType.getSelectedItem();
            String animalName = inputName.getText();
            int animalAge = Integer.parseInt(inputAge.getText());
            boolean noise = soundYes.isSelected();

            System.out.println(animalType);

            if (animalType.equalsIgnoreCase("cat")) {

                animals[animalNumber] = new Cat(animalType, animalName, animalAge, noise);

            } else {
                animals[animalNumber] = new Dog(animalType, animalName, animalAge, noise);
            }

                System.out.println(Arrays.toString(animals));

                     addRow(new Object[]{

                                animals[View.animalNumber].getType(),
                                animals[View.animalNumber].getName(),
                                animals[View.animalNumber].getAge(),
                                animals[View.animalNumber].getSound(),

                     });

            animalNumber++;

        }

    };
}

