import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class Panel2 extends JPanel {

//        static int counter = 0;
        private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, button0, buttonEqual;
        private JButton plus, minus, divide, multiply;
        private JTextField calculation;
        private Listener listener;

        private JPanel top = new JPanel();
        private JPanel left = new JPanel();
        private JPanel right = new JPanel();
        Double num = 0.0;
        private String source2;
        private Object source;
        private String operation;


    public Panel2(){

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


            //double calculate;


            //Double input = Double.parseDouble(calculation.getText());


            //buttonAction(event);


            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))
                {

                    calculation.setText("");
//                    System.out.println("if");
//
//                    switch (source2){
//                        case "+": operation = "+";
//                            break;
//                        case "-": operation = "-";
//                            break;
//                        case "*": operation = "*";
//                            break;
//                        case "/": operation = "/";
//                            break;
//                    }

                     buttonAction(event);

                }
            else
            {
                buttonAction(event);
                System.out.println("else!");
            }

        }

    }

    private void buttonAction(ActionEvent e){
        source = e.getSource();

        if(source == button1)
        {
//            setOperation();
            calculation.setText(source2+"1");
//            num = Integer.valueOf(source2);
        }
        else if(source == button2)
        {
            calculation.setText(source2+"2");
//            num = Integer.valueOf(source2);
        }
        else if(source == button3)
        {
            calculation.setText(source2+"3");
//            num = Integer.valueOf(source2);
        }
        else if(source == button4)
        {
            calculation.setText(source2+"4");
//            num = Integer.valueOf(source2);
        }
        else if(source == button5)
        {
            calculation.setText(source2+"5");
//            num = Integer.valueOf(source2);
        }
        else if(source == button6)
        {
            calculation.setText(source2+"6");
//            num = Integer.valueOf(source2);
        }
        else if(source == button7)
        {
            calculation.setText(source2+"7");
//            num = Integer.valueOf(source2);
        }
        else if(source == button8)
        {
            calculation.setText(source2+"8");
//            num = Integer.valueOf(source2);
        }
        else if(source == button9)
        {
            calculation.setText(source2+"9");
//            num = Integer.valueOf(source2);
        }
        else if(source == button0)
        {
            calculation.setText(source2+"0");
//            num = Integer.valueOf(source2);
        }
        else if(source == buttonDot)
        {
            calculation.setText(source2+".");
//            num = Integer.valueOf(source2);
        }
        else if(source == plus)
        {
            operation = "+";
            System.out.println(num);
            num = num + Double.parseDouble(source2);
            System.out.println(num);
            calculation.setText("+");

        }
        else if(source == minus)
        {
            operation = "-";
            System.out.println(num);
            if (source2 == null){
                num = Double.parseDouble(source2);
            } else {
            num = num - Double.parseDouble(source2);
            System.out.println(num);
            }
            calculation.setText("-");

        }
        else if (source == multiply)
        {
            operation = "*";
            System.out.println(num);
            num = num * Double.parseDouble(source2);
            System.out.println(num);
            calculation.setText("*");
        }
        else if(source == divide)
        {
            operation = "/";
            System.out.println(num);
            num = num / Double.parseDouble(source2);
            System.out.println(num);
            //calculation.setText("/");
        } else //whey you press equal
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
            }


        }

    }//button action

//    public void setOperation(){
//        if (source2.equals("+") || source2.equals("-") || source2.equals("*") || source2.equals("/"))
//        {
//
//            switch (source2){
//                case "+": operation = "+";
//                    break;
//                case "-": operation = "-";
//                    break;
//                case "*": operation = "*";
//                    break;
//                case "/": operation = "/";
//                    break;
//            }
//
//            calculation.setText("hi!");
//            System.out.print("this is a function");
//
//        }
//    }


}
