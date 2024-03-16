import javax.swing.JFrame;
import javax.swing.JLabel;


public class main {

    public static void main(String[] args){
        JLabel label = new JLabel();
        label.setText("Hey, Tell us What you're looking for...");

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}