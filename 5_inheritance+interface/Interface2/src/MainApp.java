import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.ObjectView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MainApp
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Car Database");
        JPanel panel = new JPanel();
        Object [] carsColumns = {"Make","Model","Type","Year"};
        JTable table = new JTable(new DefaultTableModel(carsColumns,0));
        JScrollPane scrollPane = new JScrollPane(table);
        //Make a reference to current table model
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Vehicle[] vehicles = new Vehicle[]
                {
                        new Car("Ford","F150",2006),
                        new Motorcycle("Honda","RR600",2012),
                        new Car("BMW","428",2007),
                        new Car("Ford","Edge",2016),
                };
        for (int i = 0; i < vehicles.length; i++) {
            model.addRow(
                    new Object[]{
                            vehicles[i].getMake(),
                            vehicles[i].getModel(),
                            vehicles[i].getType(),
                            vehicles[i].getYear()
                    }
            );
        }

        panel.add(scrollPane);
        panel.setPreferredSize(new Dimension(500,500));
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


