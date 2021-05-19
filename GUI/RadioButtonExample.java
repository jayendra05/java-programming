import javax.swing.*;    
import java.awt.event.*;   

public class RadioButtonExample extends JFrame implements ActionListener{
    JRadioButton r1,r2;
    JButton b;
    RadioButtonExample(){
    JFrame f=new JFrame();
    r1=new JRadioButton("male");
    r1.setBounds(100,50,100,30);
    r2=new JRadioButton("Female");
    r2.setBounds(100,100,100,30);
    b=new JButton("click");
    b.setBounds(100,150,80,30);    
    b.addActionListener(this);
    ButtonGroup bg=new ButtonGroup();
    bg.add(r1);
    bg.add(r2);    
    f.add(r1);
    f.add(r2);
    f.add(b);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){ 
        if(r1.isSelected()){
            JOptionPane.showMessageDialog(this,"you are male");
        }
        if(r2.isSelected()){
            JOptionPane.showMessageDialog(this, "you are female");
        }

    }

    public static void main(String[] args) {
        new RadioButtonExample();
    }
}
