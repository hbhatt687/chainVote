import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class chainCode {
	static JFrame frame;
	public static void main(String[] args) {
		System.out.println("Key, Value");
		//UI for Setting up Box
				frame = new JFrame("Not a tutorial");
				System.out.println("Lets see if this does not work");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				frame.setPreferredSize(new Dimension(1000, 500));

				frame.pack();
				frame.setVisible(true);
				frame.setLayout(null);
				frame.setLayout(new FlowLayout());
				frame.getContentPane().setBackground(Color.BLACK);
				//----End of JFrame
	}

}
