import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class main {

    public static void main(String[] args) {

        Border border = BorderFactory.createLineBorder(Color.red);

        ImageIcon image = new ImageIcon("s2.png");
        JLabel label = new JLabel();
        label.setText("Bro, FUCK THIS!!");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0xc61a09));
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(-20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);

    }

}