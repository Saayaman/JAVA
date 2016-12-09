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
public class View{

    private JButton addPet;
    private DefaultTableModel pets;
    private Object source;
    //private addPetListner;

    private JComboBox inputType;
    private JTextField inputName;
    private JTextField inputAge;
    private JRadioButton soundYes;
    private JRadioButton soundNo;

    public int animalNumber = 0;

    public View() {
        view();
    }

//    private void view2() {
//
//        String[] columnNames = {"Type", "Name", "Age", "Sound"};
//
//        JFrame petsFrame = new JFrame("Pets Database");
//        //petsFrame.setTitle("aaa"); >> you can set Title here, but also inside the JFrame('');
//
//        petsFrame.setBounds( 10, 10, 300, 200);
//        //setBounds(x.from mac screen, y.from mac screen, x.size, y.size)
//
//        DefaultTableModel tableModel
//                = new DefaultTableModel(columnNames,0);
//
//        JTable table = new JTable(tableModel);
//
//        JScrollPane sp = new JScrollPane(table);
//        sp.setPreferredSize(new Dimension(250, 70));
//
//        JPanel p = new JPanel();
//        p.add(sp);
//
//        petsFrame.getContentPane().add(p, BorderLayout.CENTER);
//
//        petsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        petsFrame.setVisible(true);
//    }


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

       //scrollPane.add(table);
       //scrollable panel


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

        addPet.addActionListener(addPetListner);

       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);

   }


    public void addRow(Object[] row) {
       pets.addRow(row);
   }

    private ActionListener addPetListner = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent event) {

            animalNumber++;

            source = event.getSource();
            Animal[] animals = new Animal[animalNumber];

            String animalType = (String) inputType.getSelectedItem();
            String animalName = inputName.getText();
            int animalAge = Integer.parseInt(inputAge.getText());
            boolean noiseTrue = Boolean.parseBoolean(soundYes.getText());
            boolean noiseFalse = Boolean.parseBoolean(soundNo.getText());

            if (inputType.equals("cat")) {
                animals[animalNumber] = new Cat(animalType, animalName, animalAge, true);

            } else {
                animals[animalNumber] = new Dog(animalType, animalName, animalAge, true);
            }


        }

    };
            //animalTyp

            //Animal animal = new Animal(animalType, animalName, animalAge, true);
//            animal.setType(animalType);
//            animal.setName(animalName);
//            animal.setAge(animalAge);
//            animal.setSound(true);

 }


//
//    public void AddPet(){
//
//        AddPet addPetListner = new AddPet();
//        addPet.addActionListener(addPetListner);
//
//    }


//    public class AddPet implements ActionListener {
//
//
//        private Object source;
//
//
//        public void actionPerformed(ActionEvent event){
//
//            source = event.getSource();
//            System.out.println(source);
//            String animalType = inputType.getText();
//
//        }
//
//    }






