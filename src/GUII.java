
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class GUII implements ActionListener{
	
	
	int count = 0;
	JLabel label;
	JFrame frame;
	JPanel panel;
	
	public GUII() {
		
		
		frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		label = new JLabel("Number of Clicks: 0");
		
		
		panel = new JPanel();
		

		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new GUII();
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		count++;
		label.setText("Number of Clicks: " + count);
		
		
	}

}
