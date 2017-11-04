import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JFramo extends KeyAdapter{
	
	static JFrame frame;
	static JButton button1;
	static JPanel panel;
	static boolean i=false;
	
	
	//If space is pressed then i=true and go into if statement to execute the next JFrame in main
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
               i=true;
         }
	}
	
	public static void main(String[]args) {
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
		
		//adding panel and button for Frame
		panel = new JPanel();
	//	button1 = new JButton("Click me because I'm not a tutorial");
		panel.setLayout(null);
		
		//First Label
		JLabel label = new JLabel("Logged In");
		panel.add(label);
		label.setBounds(430, 20, 900, 900);
		label.setFont(new Font("Serif", Font.BOLD, 80));
		label.setForeground(Color.cyan);

		//2nd Label 
		JLabel label2 = new JLabel("Press SPACE key to continue");
		panel.add(label2);
		label2.setBounds(430, 90, 900, 900);
		label2.setFont(new Font("Serif", Font.BOLD, 20));
		label2.setForeground(Color.cyan);
		
		frame.add(panel);
		panel.setPreferredSize(new Dimension(1200,980));
		panel.setBorder(BorderFactory.createLineBorder(Color.CYAN));
	//	button1.setBounds(250,400,120,120);
	//	panel.add(button1);
		panel.setBackground(Color.DARK_GRAY);
		
		
		//Trying to close this JFrame and run other class (chainCode)
		if (i==true) {
			 SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	frame.setVisible(false);
		                new chainCode();
		            }
		        });
		}
		
	}

	
}
