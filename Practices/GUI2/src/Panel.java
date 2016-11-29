import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by ayako_sayama on 2016/11/28.
 */
public class Panel extends JPanel{

    static int counter = 8;
    private JButton button1, button2, button3, button4;
    private JLabel label1, label2;
    private JTextField textField1, textField2;
    private Listener listener;

    public Panel(){

        //WHEN YOU WANT TO USE ARRAY
        //ArrayList<Component> components = new ArrayList<>();

        button1 = new JButton("Add");
        // さきについか
        button1.addActionListener(null);

        //WHEN YOU WANT TO USE ARRAY
        //components.add(button1);
        button2 = new JButton("Substract");
        button3 = new JButton("Multiply");
        button4 = new JButton("Divide");


        label1 = new JLabel(" ? ");
        label2 = new JLabel("The Result " + counter);


        textField1 = new JTextField("Enter Number", 10);

        textField2 = new JTextField("Enter Number", 10);


        add(textField1);
        add(label1);
        add(textField2);

        add(button1);
        add(button2);
        add(button3);
        add(button4);


        add(label2);

        listener = new Listener();
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);


        setBackground(Color.orange);
        setPreferredSize(new Dimension(360,200));

    }


    public class Listener implements ActionListener{

        //you need to override when useing eventlistener
        @Override
        public void actionPerformed(ActionEvent e) {


            Double input1 = Double.parseDouble(textField1.getText());
            Double input2 = Double.parseDouble(textField2.getText());

            if (e.getSource() == button1){

                label1.setText(" + ");
                label2.setText("Result: " + (input1 + input2));

            } else if (e.getSource() == button2){

                label1.setText(" - ");
                label2.setText("Result: " + (input1 - input2));

            } else if (e.getSource() == button3){

                label1.setText(" * ");
                label2.setText("Result: " + (input1 * input2));

            } else {

                label1.setText(" / ");
                label2.setText("Result: " + (input1 / input2));

            }

        }
    }

}
