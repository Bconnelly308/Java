import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

	private JTextArea textArea2;
	
	public TextPanel() {
		textArea2 = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(textArea2), BorderLayout.CENTER);
		
	}
	
	public void appendText(String text) {
		textArea2.append(text);
	}

}
