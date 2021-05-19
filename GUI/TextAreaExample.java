import javax.swing.*;
public class TextAreaExample {
    TextAreaExample()
    {
        JFrame f=new JFrame();
        JTextArea ta=new JTextArea("welcome to java t point");
        ta.setBounds(10,30, 200,200);  
        f.add(ta);  
        f.setSize(300,300);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
    
    
}
