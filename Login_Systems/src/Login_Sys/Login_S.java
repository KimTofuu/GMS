package Login_Sys;

import java.awt.EventQueue;

import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import mainPackage.Main;

import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login_S {

	private JFrame frame;
	private JTextField userInput;
	private JPasswordField passInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(450, 300, 1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Username = new JLabel("Username:");
		Username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Username.setBounds(168, 111, 90, 29);
		frame.getContentPane().add(Username);
		
		JLabel Password = new JLabel("Password:");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Password.setBounds(168, 174, 90, 29);
		frame.getContentPane().add(Password);
		
		userInput = new JTextField();
		userInput.setBounds(168, 138, 151, 20);
		frame.getContentPane().add(userInput);
		userInput.setColumns(10);
		
		passInput = new JPasswordField();
		passInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String password = passInput.getText();
					String username = userInput.getText();
					if(password.contains("admin12345") && username.contains("admin")) {
						passInput.setText(null);
						userInput.setText(null);
						
						Main.main(null);
						
						frame.dispose();
						
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
						passInput.setText(null);
						userInput.setText(null);
					}
				}
			}
		});
		passInput.setBounds(168, 198, 151, 20);
		frame.getContentPane().add(passInput);

		JButton login = new JButton("Log In");
		login.setForeground(new Color(0, 0, 0));
		login.setBackground(new Color(255, 128, 0));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = passInput.getText();
				String username = userInput.getText();
				if(password.contains("admin12345") && username.contains("admin")) {
					passInput.setText(null);
					userInput.setText(null);
					
					Main.main(null);
					
					frame.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
					passInput.setText(null);
					userInput.setText(null);
				}
			}
		});
		login.setBounds(312, 292, 108, 29);
		frame.getContentPane().add(login);
		
		JButton reset = new JButton("Reset");
		reset.setBackground(new Color(255, 128, 64));
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userInput.setText(null);
				passInput.setText(null);
			}
		});
		reset.setBounds(76, 292, 108, 29);
		frame.getContentPane().add(reset);
		
		JButton exit = new JButton("Exit");
		exit.setBackground(new Color(255, 128, 64));
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exit.setBounds(194, 292, 108, 29);
		frame.getContentPane().add(exit);
		
		JLabel lblNewLabel = new JLabel("Welcome Back!");
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 44));
		lblNewLabel.setBounds(76, 13, 350, 102);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel Title = new JLabel("  BroCode ");
		Title.setBounds(515, 69, 379, 103);
		frame.getContentPane().add(Title);
		Title.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 94));
		Title.setBackground(new Color(128, 255, 255));
		
		JLabel lblGym = new JLabel("  GYM");
		lblGym.setBounds(561, 174, 257, 99);
		frame.getContentPane().add(lblGym);
		lblGym.setFont(new Font("Stencil", Font.BOLD, 99));
		lblGym.setBackground(new Color(128, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setEnabled(false);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\PC\\Downloads\\gymicon.png"));
		lblNewLabel_1.setBounds(571, 0, 327, 361);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
