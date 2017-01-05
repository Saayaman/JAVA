import javax.swing.*;

    public class JFrameIntro
    {
        static int count = 0;
        public static void main(String[] args)
        {
            //Create frame, panel, button, label
            JFrame frame = new JFrame("Push Counter");
            MyCustomPanel panel = new MyCustomPanel();
            //Finalize the frame
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);
        }


    }

