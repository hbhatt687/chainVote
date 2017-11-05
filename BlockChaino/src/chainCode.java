import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class chainCode{
	static JFrame frame1;
	static JPanel panel1 = new JPanel();
	static JPanel panel2 = new JPanel();
	static JPanel panel3 = new JPanel();
	static JButton button1, button2;
	static JLabel lb, lb1, lb2, lb3;
	
	public chainCode(JFrame frame){
		this.frame1 = frame;
		//UI for Setting up Box
		frame1 = new JFrame("ChainVoting");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setPreferredSize(new Dimension(1000, 500));
		frame1.pack();
		frame1.setVisible(true);
		frame1.setLayout(null);
		frame1.setLayout(new FlowLayout());
		frame1.getContentPane().setBackground(Color.BLACK);
		//----End of JFrame
		frame1.pack();
		frame1.setLocationRelativeTo(null);
		frame1.setExtendedState(JFrame.MAXIMIZED_BOTH); 
				
		frame1.add(panel1);		
		frame1.add(panel2);
		frame1.add(panel3);
		
		lb = new JLabel("Select Preferred Bill");
		lb.setFont(new Font("Serif", Font.BOLD, 80));
		lb.setForeground(Color.cyan);
		
		lb1 = new JLabel("Description of Bill A");
		lb1.setFont(new Font("Serif", Font.BOLD, 35));
		lb1.setForeground(Color.white);
		
		lb2 = new JLabel("Description of Bill B");
		lb2.setFont(new Font("Serif", Font.BOLD, 35));
		lb2.setForeground(Color.white);
		
		panel3.setPreferredSize(new Dimension(1200,220));
		panel3.setBorder(BorderFactory.createLineBorder(Color.white));
		panel3.setBackground(Color.CYAN);
		panel3.setLayout(new BorderLayout());
		
		panel2.setPreferredSize(new Dimension(1200,220));
		panel2.setBorder(BorderFactory.createLineBorder(Color.white));
		panel2.setBackground(Color.CYAN);
		panel2.setLayout(new BorderLayout());
		
		panel1.setPreferredSize(new Dimension(1000,280));
		panel1.setBorder(BorderFactory.createLineBorder(Color.CYAN));
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(new GridBagLayout());
		panel1.add(lb);
		
		button1 = new JButton("Bill A");
		button1.setBounds(250,300,300,90);
		button1.setFont(new Font("Serif", Font.BOLD, 35));
		panel2.add(button1, BorderLayout.LINE_START);
		panel2.add(lb1);
		
		
		button2 = new JButton("Bill B");
		button2.setBounds(10,500,200,90);
		button2.setFont(new Font("Serif", Font.BOLD, 35));
		panel3.add(button2, BorderLayout.LINE_START);
		panel3.add(lb2);
	
	}
	
	public static void pickA() {
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					System.out.println("Voter has chosen Bill A");
			}
		});
		
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					System.out.println("Voter has chosen Bill B");
			}
		});
	}
	public static void main(String[]args) {
		new chainCode(frame1);
		pickA();
	}

}
