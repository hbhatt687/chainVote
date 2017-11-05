import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFramo extends KeyAdapter{

	static JFrame frame;
	static JButton b1;
	static JPanel panel;
	JFrame window=chainCode.frame1;
	
	//If space is pressed then close this JFRAME to execute the next JFrame in main
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_SPACE) {
			new chainCode(frame);
			frame.setVisible(false);
			window.setVisible(true);
			frame.dispose();
			
		}
	}
	public JFramo() {
		//UI for Setting up Box
		frame = new JFrame("ChainVotes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setPreferredSize(new Dimension(1000, 500));
		frame.getContentPane().add(new StyleOptionsPanel());

		frame.pack();
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLayout(new FlowLayout());
		frame.getContentPane().setBackground(Color.BLACK);
		//----End of JFrame
		
	
	}
	
	public static void main(String[]args) {
		new JFramo();
	}
	
	//Trying to close this JFrame and run other class (chainCode)
	/*if (i==true) {
		 SwingUtilities.invokeLater(new Runnable() {
			 @Override
	            public void run() {
	            	//frame.setVisible(false);
	                chainCode please = new chainCode();
	                please.newScreen();
	            }
	        });
	}
	*/
}

class StyleOptionsPanel extends JPanel{
	JFramo framo;
	static JButton b1;
	static JPanel panel;
	JFrame window=chainCode.frame1;

public StyleOptionsPanel(){
	b1 = new JButton("CONTINUE");
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==b1){
				new chainCode(framo.frame);
				framo.frame.setVisible(false);
			}
		}
	});
		

			
			//adding panel and button for Frame
			
			setLayout(null);
			
			//First Label
			JLabel label = new JLabel("Logged In");
			add(label);
			label.setBounds(430, 20, 900, 900);
			label.setFont(new Font("Serif", Font.BOLD, 80));
			label.setForeground(Color.cyan);

			//2nd Label 
			/*JLabel label2 = new JLabel("Press SPACE key to continue");
			add(label2);
			label2.setBounds(430, 90, 900, 900);
			label2.setFont(new Font("Serif", Font.BOLD, 20));
			label2.setForeground(Color.cyan);*/
			
			//panel customization
			setPreferredSize(new Dimension(1200,980));
			setBorder(BorderFactory.createLineBorder(Color.CYAN));
			setBackground(Color.DARK_GRAY);
			
			add(b1);
			b1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
			b1.setForeground(Color.cyan);
			b1.setBounds(515,550,150,50);
			b1.setBackground(Color.BLACK);
			b1.setFont(new Font("Serif", Font.BOLD, 25));
}
}

