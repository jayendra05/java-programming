import javax.swing.*;     
public class Image_Button {
    Image_Button(){
        JFrame f=new JFrame("GUI");
        JButton b=new JButton(new ImageIcon("F:\\Jayendra\\Java\\GUI\\button.png"));
        b.setBounds(200,200,200,200);
        f.add(b);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Image_Button();
    }
}
