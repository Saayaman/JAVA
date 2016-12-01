import javax.swing.*;
import javax.swing.text.html.ObjectView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Panel extends JPanel {

//        static int counter = 0;
        private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, button0, buttonEqual;
        private JButton plus, minus, divide, multiply;
        private JTextField calculation;
        private Listener listener;

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


           Object source = event.getSource();

            String source2 = calculation.getText();
            int num;

            //Double input = Double.parseDouble(calculation.getText());

//            switch (source){
//                case "1":  calculation.setText("1");
//                    break;
//               default: calculation.setText("1");
//                   break;
//            }


            if(source == button1)
                { calculation.setText(source2+"1");

                }
            else if(source == button2)
                { calculation.setText(source2+"2"); }
            else if(source == button3)
                { calculation.setText(source2+"3"); }
            else if(source == button4)
                { calculation.setText(source2+"4"); }
            else if(source == button5)
                { calculation.setText(source2+"5"); }
            else if(source == button6)
                { calculation.setText(source2+"6"); }
            else if(source == button7)
                { calculation.setText(source2+"7"); }
            else if(source == button8)
                { calculation.setText(source2+"8"); }
            else if(source == button9)
                { calculation.setText(source2+"9"); }
            else if(source == button0)
                { calculation.setText(source2+"0"); }
            else if(source == buttonDot)
                 { calculation.setText(source2+"."); }


            else if(source == plus)
            { calculation.setText(source2+" + "); }
            else if(source == minus)
            { calculation.setText(source2+" - "); }
            else if (source == multiply)
            { calculation.setText(source2+" * ");}
            else if(source == divide)
            { calculation.setText(source2+" / "); }
            else {
                calculation.setText(String.valueOf(source2));
                System.out.println(source2);

                //!!!画面に乗っているものを全部書き出したい！
            }
        }

    }


}
