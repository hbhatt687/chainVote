import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class JFramo {
	
	static JFrame frame;
	static JButton button1;
	static JPanel panel;
	
	public static void main(String[]args) {
		//UI for Setting up Box
		frame = new JFrame("Not a tutorial");
		System.out.println("When in doubt the answer is no.");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setPreferredSize(new Dimension(1000, 500));

		frame.pack();
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLayout(new FlowLayout());
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		//----End of JFrame
		
		//adding panel and button for Frame
		button1 = new JButton("Click me because I'm not a tutorial");
		panel = new JPanel();
		frame.add(panel);
		panel.setPreferredSize(new Dimension(900,435));
		panel.add(button1);
		panel.setBackground(Color.black);

		
		//UI for Menu
		JMenuBar menubar;
		JMenu menu, submenu;
		JMenuItem menuitem;
		JRadioButtonMenuItem rbMenuItem;
		JCheckBoxMenuItem cbMenuItem;
		
		//Creating the menu bar
		menubar = new JMenuBar();
		
		//Build the first menu
		menu = new JMenu("Blockchain that is not a tutorial");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that is not a tutorial");
		menubar.add(menu);
		
		//Group of Items in the menu
		menuitem = new JMenuItem("A text-only menu item that is not a tutorial", KeyEvent.VK_T);
		menuitem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuitem.getAccessibleContext().setAccessibleDescription("This doesn't really do anything that is not a tutorial");
		
		menuitem = new JMenuItem("Both text and icon that is not a tutorial");
	
	}
}
