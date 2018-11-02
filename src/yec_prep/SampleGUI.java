package yec_prep;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Idk what this line does but it gets rid of an error
@SuppressWarnings("serial")

public class SampleGUI extends JFrame {
	
	//Attributes
	JPanel mainPane = new JPanel();
	JButton button = new JButton("Test Button");
	JLabel label = new JLabel("Wow a label");

	public SampleGUI() {
		
		//Basic JFrame settings
		setTitle("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(mainPane);
		
		//Basic mainPane settings
		mainPane.setLayout(new FlowLayout());
		mainPane.add(button);
		mainPane.add(label);
	}

	public static void main(String[] args) {
		
		//Initializing the GUI at runtime
		SampleGUI ex = new SampleGUI();
		ex.setVisible(true);
	}
}