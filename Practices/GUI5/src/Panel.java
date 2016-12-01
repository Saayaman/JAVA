import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {

        static int counter = 0;
        private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, button0, buttonEqual;
        private JButton plus, minus, divide, multiply;
        private JTextField calculation;
        //private Listener listener;
        private JPanel top = new JPanel();
        private JPanel left = new JPanel();
        private JPanel right = new JPanel();


    public Panel(){

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonDot = new JButton(".");
        button0 = new JButton("0");
        buttonEqual = new JButton("=");


        plus = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("x");


        calculation = new JTextField("0", 20);


        setLayout(new BorderLayout());
        add(top, BorderLayout.NORTH);
        add(left, BorderLayout.WEST);
        add(right, BorderLayout.EAST);


        //top.setLayout(new FlowLayout(FlowLayout.CENTER));
        left.setLayout(new GridLayout(4,4));
        right.setLayout(new GridLayout(4,1));

        top.add(calculation);

        left.add(button1);
        left.add(button2);
        left.add(button3);
        left.add(button4);
        left.add(button5);
        left.add(button6);
        left.add(button7);
        left.add(button8);
        left.add(button9);
        left.add(buttonDot);
        left.add(button0);
        left.add(buttonEqual);

        right.add(plus);
        right.add(minus);
        right.add(divide);
        right.add(multiply);

    }


}
