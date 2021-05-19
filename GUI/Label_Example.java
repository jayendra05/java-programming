import javax.swing.*;     


class Label_Example {
    
    public static void main(String[] args) {
        JFrame f=new JFrame("GUI");
        JLabel l1=new JLabel("first label");
        l1.setBounds(20,50,100,30);
        JLabel l2=new JLabel("second label");
        f.add(l1);
        f.add(l2);
        l2.setBounds(20,100,100,30);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
