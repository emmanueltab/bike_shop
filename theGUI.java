import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class theGUI 
{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Emmanuel's Bike Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900, 720);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("bike_logo.jpg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    
}
