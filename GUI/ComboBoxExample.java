import javax.swing.*;
import java.awt.event.*;  
public class ComboBoxExample {
    ComboBoxExample(){
        JFrame f=new JFrame();
        String name[]={"jayendra","yatindra","atul","vikash"};
        JComboBox cb=new JComboBox(name);
        cb.setBounds(100,100,100,40);
        final JLabel l1=new JLabel();
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setSize(400,100); 
        JButton b=new JButton("Show");  
        b.setBounds(200,100,75,20);

        f.add(cb);
        f.add(l1);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data="the name of the student is : "
                + cb.getItemAt(cb.getSelectedIndex());
                l1.setText(data);
            }
            
        });
    }

    
    public static void main(String[] args) {
        new ComboBoxExample();
    }
}
