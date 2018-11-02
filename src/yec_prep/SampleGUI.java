package yec_prep;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//Idk what this line does but it gets rid of an error
@SuppressWarnings("serial")

public class SampleGUI extends JFrame {
	
	//Attributes
	JPanel mainPane = new JPanel();
	JButton button = new JButton("Test Button");
	JLabel label = new JLabel("Wow a label");
	JTextField tField = new JTextField("Example Text");
	JTextArea tArea = new JTextArea("Example \ntext");

	public SampleGUI() {
		
		//Basic JFrame settings
		setTitle("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(mainPane);
		
		//Basic mainPane settings
		mainPane.setLayout(new GridLayout(4,1));
		mainPane.add(button);
		mainPane.add(label);
		mainPane.add(tField);
		mainPane.add(tArea);
	}

	public static void main(String[] args) {
		
		//Initializing the GUI at runtime
		SampleGUI ex = new SampleGUI();
		ex.setVisible(true);
	}
}