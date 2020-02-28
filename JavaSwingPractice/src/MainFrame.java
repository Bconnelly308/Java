import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
// control/shift/o to auto add import when typing code

import org.omg.CORBA.PRIVATE_MEMBER;

public class MainFrame extends JFrame {

//	private JTextArea textArea;
	private TextPanel textPanel;
	private JButton btn;
	private Toolbar toolbar;
	
	public MainFrame() {
		super("Hello World");
		
		setLayout(new BorderLayout());
		
//		textArea = new JTextArea();
		textPanel = new TextPanel();
		btn = new JButton("Click Me");
		toolbar = new Toolbar();
		
		toolbar.setTextPanel(textPanel);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
//				textArea.append("Hello\n");
				textPanel.appendText("Please Type Here\n");
			}
		});
		
//		add(textArea, BorderLayout.CENTER);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		add(toolbar,BorderLayout.NORTH);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
