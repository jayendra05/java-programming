import java.applet.*;
import java.awt.*;

public class First_Applet extends Applet {
	
	public void init() {
		
	}
	
	public void stop() {
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0,0,400,400);
		g.setColor(Color.GREEN);
		g.fillRect(20,20,30,50);
	}
	

}
