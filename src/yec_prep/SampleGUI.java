package yec_prep;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SampleGUI extends JFrame {

	public SampleGUI() {

		setTitle("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel mainPane = new JPanel();
		JButton button = new JButton("Test Button");
		setContentPane(mainPane);
		mainPane.add(button);
	}

	public static void main(String[] args) {
		SampleGUI ex = new SampleGUI();
		ex.setVisible(true);
	}
}