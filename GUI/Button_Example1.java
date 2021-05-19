import javax.swing.*;
import java.awt.event.*;

public class Button_Example1 {
    
    public static void main(String[] args) {
        JFrame f=new JFrame("Button example");
        final JTextField tf=new JTextField();
        tf.setBounds(50,50, 150,20);
        JButton b=new JButton("Click");

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                tf.setText("welcome!!!!");
            }
        });

        b.setBounds(50,75,100,30);
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
