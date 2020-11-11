import javax.swing.JFrame;
import javax.swing.JLabel;

public class udemypractice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame(); // creating a JFrame
		window.setTitle("my window"); // seting the title to my window
		window.setSize(800, 600);// setting the size of the window
		window.setVisible(true); // making the frame visible
		
		JLabel label = new JLabel(); // creating a new label
		label.setText("my label"); // adding the label to the JFreame
		
		window.add(label);
		
		String s = "hi";
	

}
}