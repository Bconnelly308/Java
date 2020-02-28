import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

//	private JTextArea textArea;
	private JButton beginbtn;

	
	public MainFrame() {
		super("Start Order");
		
		setLayout(new BorderLayout());
		
		beginbtn = new JButton("Begin Order");
		
		beginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				//need to create method named createFrame()
				//call createFrame()
				
			}
//				
		});
		
		add(beginbtn, BorderLayout.SOUTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
