import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCustomPanel extends JPanel{

    static int counter = 0;
    private JButton buttonCounter, sqrt;
    private JLabel label;
    private MyListener listener;
    private JTextField textField;


    public MyCustomPanel()
    {
        buttonCounter = new JButton("Push me");
        sqrt = new JButton("Sqrt");
        label = new JLabel("Pushes: "+ (counter));
        textField = new JTextField("0",20);
        listener = new MyListener();
        add(buttonCounter);
        add(sqrt);
        add(label);
        add(textField);
        setBackground(Color.GRAY);
        setPreferredSize(new Dimension(400,100));

        buttonCounter.addActionListener(listener);
        sqrt.addActionListener(listener);
    }
    private class MyListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == buttonCounter)
            {
                System.out.println("Button Counter!");
                label.setText("Pushes: "+((counter++)));
            }
            else if(e.getSource() == sqrt)
            {

                label.setText("Pushes: "+((counter++)));

                System.out.println(Math.sqrt(Double.parseDouble(textField.getText())));


            } textField.setText("This is the counter:" + counter);
        }
    }

}
