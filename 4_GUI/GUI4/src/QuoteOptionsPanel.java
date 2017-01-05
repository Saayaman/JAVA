

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class QuoteOptionsPanel extends JPanel {

    private JLabel quote;
    private JRadioButton comedy, philosophy, carpentry;
    private JCheckBox bold, italic;
    private String comedyQuote, philosophyQuote, carpentryQuote;
    //quotelistener is only used in  QuoteOptions Panel, so it does not have to initialize private

    public QuoteOptionsPanel(){

        comedyQuote = "Take my wife, please: ";
        philosophyQuote = "I think, therefore I am. ";
        carpentryQuote = "Measure twice. Cut Once";

        quote = new JLabel(comedyQuote);
        quote.setFont(new Font("Helvetica", Font.PLAIN, 24));

        comedy = new JRadioButton("Comedy", true);
        comedy.setBackground(Color.black);

        philosophy = new JRadioButton("Philosophy");
        philosophy.setBackground(Color.green);

        carpentry = new JRadioButton("Carpentry");
        carpentry.setBackground(Color.green);

        bold = new JCheckBox("bold");
        italic = new JCheckBox("italic");


        ButtonGroup group = new ButtonGroup();
        group.add(comedy);
        group.add(philosophy);
        group.add(carpentry);



        QuoteListener quoteListen = new QuoteListener();
        comedy.addActionListener(quoteListen);
        philosophy.addActionListener(quoteListen);
        carpentry.addActionListener(quoteListen);

        StyleListener styleListen = new StyleListener();
        bold.addItemListener (styleListen);
        italic.addItemListener (styleListen);


        add(quote);
        add(comedy);
        add(philosophy);
        add(carpentry);

        add(bold);
        add(italic);

//        setBackground(Color.green);
        setPreferredSize(new Dimension(300, 100));

    }

    private class QuoteListener implements ActionListener{
        public void  actionPerformed(ActionEvent event){
            Object source = event.getSource();

            if(source == comedy)
                quote.setText(comedyQuote);
            else if (source == philosophy)
                quote.setText(philosophyQuote);
            else
                quote.setText(carpentryQuote);

        }
    }

    private class StyleListener implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {

            int style = Font.PLAIN;

            if (bold.isSelected()) {
                style |= Font.BOLD;
            }

            if (italic.isSelected()) {
                style |= Font.ITALIC;
                // or programming
            }

            quote.setFont(new Font("Helvetica", style, 24));
        }
    }


}
