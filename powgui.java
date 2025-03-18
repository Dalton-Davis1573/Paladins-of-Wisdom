import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class powgui {
	
	public static void main(String[] args) {
		
		// JFrame = a gui window to add components to
		
		
		JLabel label = new JLabel();
		label.setText("Paladins of Wisdom "
				+ "Word Games "
				+ "Create Account  Log In  Play");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(0x000000));
		label.setFont(new Font("Sans serif",Font.BOLD,20));
		
		JFrame frame = new JFrame(); //creates frame
		frame.setTitle("Paladins of Wisdom Word Games");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(800,500);
		frame.setVisible(true);
		frame.setBackground(Color.white);
		frame.add(label);
		
		ImageIcon image1 = new ImageIcon("logo.png");
		frame.setIconImage(image1.getImage());
		
		
		
	}
}