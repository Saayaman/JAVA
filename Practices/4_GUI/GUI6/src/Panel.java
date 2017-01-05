import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Panel extends JPanel {

    //static int counter = 0;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDot, button0, buttonEqual;
    private JButton plus, minus, divide, multiply, buttonClear;
    private JLabel labelArea1;
    private JLabel labelOperation;
    private JLabel labelArea2;
    private JLabel labelEquals;
    private JLabel labelAnswer;
    private Listener listener;

    private JPanel center = new JPanel(new BorderLayout());
    private JPanel centerCenter = new JPanel(new GridLayout(4,4));
    private JPanel east = new JPanel(new GridLayout(5,1));
    private JPanel centerNorth = new JPanel(new GridLayout(1,1));

    private Object source;
    private Double num1;
    private Double num2;
    private Double answer;

    private String getLabel1;
    private String getOperation;
    private String getLabel2;
    private String getAnswer;

    private boolean flagEqual;


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
        buttonClear = new JButton("C");

        //buttonClear.setHorizontalAlignment(JLabel.RIGHT);


        plus = new JButton("+");
        minus = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("x");


        labelArea1 = new JLabel("   ");
        labelOperation = new JLabel("?");
        labelArea2 = new JLabel("   ");
        labelEquals = new JLabel("=");
        labelAnswer = new JLabel("??");

        //labelArea1.setSize(100, 100);
        //labelArea1.setBorder();
        //labelArea1.setForeground(new java.awt.Color(255, 255,255));


        setLayout(new BorderLayout());


        //centerNorth.setLayout(new FlowLayout(FlowLayout.CENTER));

        centerNorth.add(labelArea1);
        centerNorth.add(labelOperation);
        centerNorth.add(labelArea2);
        centerNorth.add(labelEquals);
        centerNorth.add(labelAnswer);


        centerCenter.add(button1);
        centerCenter.add(button2);
        centerCenter.add(button3);
        centerCenter.add(button4);
        centerCenter.add(button5);
        centerCenter.add(button6);
        centerCenter.add(button7);
        centerCenter.add(button8);
        centerCenter.add(button9);
        centerCenter.add(buttonDot);
        centerCenter.add(button0);
        centerCenter.add(buttonEqual);

        east.add(buttonClear);
        east.add(plus);
        east.add(minus);
        east.add(divide);
        east.add(multiply);


        add(east, BorderLayout.EAST);
        add(center, BorderLayout.CENTER);
        center.add(centerCenter, BorderLayout.CENTER);
        add(centerNorth, BorderLayout.NORTH);

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
        buttonClear.addActionListener(listener);

    }


    private  class Listener implements ActionListener{
        public void actionPerformed(ActionEvent event){

            source = event.getSource();
            getLabel1 = labelArea1.getText();
            getLabel2 = labelArea2.getText();
            getOperation = labelOperation.getText();
            getAnswer = labelAnswer.getText();


            if (answer != null){

                System.out.println(answer);
                //if there is an answer
                num1 = answer;
                num2 = null;
                labelArea1.setText(String.valueOf(answer));
                labelArea2.setText(String.valueOf(""));
                labelAnswer.setText("");
                answer = null;





                if (source == plus || source == minus || source == multiply || source == divide) {

                    //first set num
                    System.out.println("operation2");
                    setOperation1();
                }

                else if(source == buttonEqual) {

                    setEquals();

                } else if (source == buttonClear){

                    setClear();

                } else {

                    //buttons from 0~9
                    buttonAction2(event);
                }


            } else { //flag == false
                System.out.println(flagEqual);

                if (getOperation.equals("?")){
                    //if the operation is not filled, do this

                    if (source == plus || source == minus || source == multiply || source == divide) {

                        //first set num
                        setOperation1();
                    }

                    else if(source == buttonEqual) {

                        setEquals();

                    } else if (source == buttonClear){

                        setClear();

                    } else {

                        //buttons from 0~9
                        buttonAction(event);

                    }

                } else {

                    if (source == plus || source == minus || source == multiply || source == divide) {

                        //first set num
                        setOperation1();
                    }

                    else if(source == buttonEqual) {

                        setEquals();

                    } else if (source == buttonClear){

                        setClear();

                    } else {

                        //buttons from 0~9
                        buttonAction2(event);
                    }
                }


            }

            if (source == buttonEqual){flagEqual = true;}
            else { flagEqual = false; }


        }

    }

    public void buttonAction(ActionEvent event){
        source = event.getSource();

        num1 = 0.0;

        if(source == button1)
        {
            labelArea1.setText(getLabel1+"1");
        }
        else if(source == button2)
        {
            labelArea1.setText(getLabel1+"2");
        }
        else if(source == button3)
        {
            labelArea1.setText(getLabel1+"3");
        }
        else if(source == button4)
        {
            labelArea1.setText(getLabel1+"4");
        }
        else if(source == button5)
        {
            labelArea1.setText(getLabel1+"5");
        }
        else if(source == button6)
        {
            labelArea1.setText(getLabel1+"6");
        }
        else if(source == button7)
        {
            labelArea1.setText(getLabel1+"7");
        }
        else if(source == button8)
        {
            labelArea1.setText(getLabel1+"8");
        }
        else if(source == button9)
        {
            labelArea1.setText(getLabel1+"9");
        }
        else if(source == button0)
        {
            labelArea1.setText(getLabel1+"0");
        }
        else //buttondote
        {
            labelArea1.setText(getLabel1+".");
        }

        num1 = Double.parseDouble(labelArea1.getText());
        System.out.println(num1);
    }//button action


    public void buttonAction2(ActionEvent event){
        source = event.getSource();

        num2 = 0.0;

        if(source == button1)
        {
            labelArea2.setText(getLabel2+"1");
        }
        else if(source == button2)
        {
            labelArea2.setText(getLabel2+"2");
        }
        else if(source == button3)
        {
            labelArea2.setText(getLabel2+"3");
        }
        else if(source == button4)
        {
            labelArea2.setText(getLabel2+"4");
        }
        else if(source == button5)
        {
            labelArea2.setText(getLabel2+"5");
        }
        else if(source == button6)
        {
            labelArea2.setText(getLabel2+"6");
        }
        else if(source == button7)
        {
            labelArea2.setText(getLabel2+"7");
        }
        else if(source == button8)
        {
            labelArea2.setText(getLabel2+"8");
        }
        else if(source == button9)
        {
            labelArea2.setText(getLabel2+"9");
        }
        else if(source == button0)
        {
            labelArea2.setText(getLabel2+"0");
        }
        else //buttondote
        {
            labelArea2.setText(getLabel2+".");
        }


        num2 = Double.parseDouble(labelArea2.getText());
        System.out.println(num2);

    }//button action



    private void setOperation1() {

        if(source == plus) {

            labelOperation.setText("+");
        }
        else if(minus == source) {

            labelOperation.setText("-");

        }
        else if (source == multiply){

            labelOperation.setText("*");

        }
        else if(source == divide) {

            labelOperation.setText("/");
        }
        else {
            System.out.println("Sthing is wrong");
        }




    }


    private void setEquals(){

        //after pressing equal
        if (num1 == null && num2 == null){
            num1 = 0.0;
            labelArea1.setText(String.valueOf(0));
            num2 = 0.0;
            labelArea2.setText(String.valueOf(0));
            answer = 0.0;
            labelAnswer.setText(String.valueOf(0));

            labelOperation.setText("+");
        }
        else if (num2 == null){
            num2 = 0.0;
            labelArea2.setText(String.valueOf(0));
            answer = num1+num2;
            labelAnswer.setText(String.valueOf(answer));
            if (getOperation.equals("?")){
                labelOperation.setText("+");
            }

        } else {

            switch (getOperation){
                case "+": answer = num1+num2;
                    break;
                case "-": answer = num1-num2;
                    break;
                case "*": answer = num1*num2;
                    break;
                case "/": answer = num1/num2;
                    break;
            }
            labelAnswer.setText(String.valueOf(answer));
        }

    }

    private void setClear(){

        System.out.println("Clear!");

        num1 = null;
        num2 = null;
        answer = null;

        labelArea1.setText("");
        labelArea2.setText("");
        labelAnswer.setText("??");
        labelOperation.setText("?");

    }


}
