package overriding;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class drawing extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new drawing();

	}
public drawing() {
	setSize(500,500);
	setVisible(true);
}
@Override
public void paint(Graphics arg0) {
	// TODO Auto-generated method stub
	//super.paint(arg0);
	arg0.drawRect(50, 50, 100, 25);
	
	arg0.setColor(new Color(0,0,255));
	arg0.drawOval(200, 50, 50, 50);
	arg0.setColor(Color.green);
	arg0.fillRect(50, 200, 100, 25);
	arg0.setColor(Color.black);
	arg0.drawString("my string", 200, 200);
}
}
