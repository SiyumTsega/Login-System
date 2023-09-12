import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton ("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("UserID: ");
	JLabel userPasswordLabel = new JLabel("password: ");
	JLabel messageLabel = new JLabel();
	
	HashMap<String, String> logininfo = new HashMap<>();

	LoginPage(HashMap<String, String> loginInfoOriginal) {

		logininfo = loginInfoOriginal;
		
		userIDLabel.setBounds(50,105,75,15);
		userPasswordLabel.setBounds(50,155,75,15);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null, Font.ITALIC,25));
		
		userIDField.setBounds(125, 100, 200, 25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		frame.add(userIDLabel);
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.add(loginButton);
		frame.add(resetButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == resetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource() == loginButton) {
			String userId = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			
			if(logininfo.containsKey(userId)) {
				if(logininfo.get(userId).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login Successful");
					frame.dispose();
					WelcomePage welcomePage = new WelcomePage(userId);
				}
				else {
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wrong Password");
				}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username not found");
			}
		}
	}

}
