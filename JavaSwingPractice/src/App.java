//this project uses JSwing for button clicks, scroll bars, customer components, toolbars, communication

import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class App {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {			
			public void run() {
				new MainFrame();

			}
		});
	}
}
