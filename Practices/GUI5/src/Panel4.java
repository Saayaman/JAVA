import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel4 extends JPanel {

//        static int counter = 0;
        private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, button0, buttonEqual;
        private JButton plus, minus, divide, multiply;
        private JTextField calculation;
        private Listener listener;

        private JPanel top = new JPanel();
        private JPanel left = new JPanel();
        private JPanel right = new JPanel();
        Double num = 0.0;
        Double numScan = 0.0;
        private String source2;
        private Object source;
        private String operation;


    public Panel4(){

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


        calculation = new JTextField(null, 20);


        setLayout(new BorderLayout());
        add(top, BorderLayout.NORTH);
        add(left, BorderLayout.CENTER);
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

        listener = new Listener();
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
        button5.addActionListener(listener);
        button6.addActionListener(listener);
        button7.addActionListener(listener);
        button8.addActionListener(listener);
        button9.addActionListener(listener);
        button0.addActionListener(listener);
        buttonDot.addActionListener(listener);
        buttonEqual.addActionListener(listener);
        plus.addActionListener(listener);
        minus.addActionListener(listener);
        multiply.addActionListener(listener);
        divide.addActionListener(listener);



    }


    private  class Listener implements ActionListener{
        public void actionPerformed(ActionEvent event){

            source = event.getSource();
            source2 = calculation.getText();
            operation = "";



            if (source2.equals("+") || source2.equals("-") || source2.equals("*") || source2.equals("/")) {

                System.out.println("if");
                //setOperation2();
                calculation.setText("");
                buttonAction(event);

            }

            else
            {
                buttonAction(event);
                System.out.println("else!");
            }

        }

    }

    public void buttonAction(ActionEvent event){
        source = event.getSource();

        if(source == button1)
        {
            calculation.setText(source2+"1");
        }
        else if(source == button2)
        {
            calculation.setText(source2+"2");
        }
        else if(source == button3)
        {
            calculation.setText(source2+"3");
        }
        else if(source == button4)
        {
            calculation.setText(source2+"4");
        }
        else if(source == button5)
        {
            calculation.setText(source2+"5");
    }
        else if(source == button6)
        {
            calculation.setText(source2+"6");
        }
        else if(source == button7)
        {
            calculation.setText(source2+"7");
        }
        else if(source == button8)
        {
            calculation.setText(source2+"8");
        }
        else if(source == button9)
        {
            calculation.setText(source2+"9");
        }
        else if(source == button0)
        {
            calculation.setText(source2+"0");
        }
        else if(source == buttonDot)
        {
            calculation.setText(source2+".");
        }
        else if (source == buttonEqual)//whey you press equal
        {
            calculation.setText(String.valueOf(num));
            switch (operation){
                case "+":
                    num = num + Double.parseDouble(source2);
                    System.out.println("You pressed Equal!");
                    break;
                case "-":
                    num = num - Double.parseDouble(source2);
                    System.out.println("You pressed Equal!");
                    break;
                case "*":
                    num = num * Double.parseDouble(source2);
                    System.out.println("You pressed Equal!");
                    break;
                case "/":
                    num = num / Double.parseDouble(source2);
                    System.out.println("You pressed Equal!");
                    break;
                default:
                    break;
            }


        } else {

            setOperation2();
            System.out.println(num);


        }

    }//button action

//    private void setOperation1() {
//
//        num = Double.parseDouble(source2);
//
//        if(source == plus)
//        {
//            operation = "+";
//            System.out.println(num);
//            calculation.setText("+");
//
//        }
//        else if(source == minus)
//        {
//            operation = "-";
//            System.out.println(num);
//            calculation.setText("-");
//
//        }
//        else if (source == multiply)
//        {
//            operation = "*";
//            System.out.println(num);
//            calculation.setText("*");
//        }
//        else if(source == divide)
//        {
//            operation = "/";
//            System.out.println(num);
//            calculation.setText("/");
//        }
//
//        else {
//            System.out.println("again??");
//        }
//
//        System.out.println("This is the current operation!:" + operation);
//        //buttonAction(event);
//    }


    private void setOperation2() {


        String input;


        if (source2 != null){

            int substringLength = source2.length();
           input = source2.substring(1,substringLength);

        } else {
            input = source2;

        }
        numScan = Double.parseDouble(input);

            if(source == plus) {
                operation = "+";
                num =  num + numScan;
                calculation.setText("+");
            }
            else if(minus == source) {
                operation = "-";
                num -= numScan;
                calculation.setText("-");
            }
            else if (source == multiply){

                operation = "*";

                num = num * (numScan);
                System.out.println(num);
                calculation.setText("*");
            }
            else if(source == divide) {
                operation = "/";
                System.out.println(input);
                num = num / (numScan);
                System.out.println(num);
                calculation.setText("/");
            }
            else {
                System.out.println("Sthing is wrong");
            }


        //buttonAction(event);

    }



}
