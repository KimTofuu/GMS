package mainPackage;

import java.awt.EventQueue;
import javax.swing.DefaultListModel;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultListModel;
import javax.swing.JTable;
public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(00, 00, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 128, 0));
		panel.setBounds(0, 0, 1894, 44);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnMembers = new JButton("Members");
		btnMembers.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMembers.setBackground(new Color(255, 128, 0));
		btnMembers.setBounds(468, 11, 108, 23);
		btnMembers.setBorderPainted(false);
		panel.add(btnMembers);
		
		JButton btnPayment = new JButton("Payment");
		btnPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPayment.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPayment.setBorderPainted(false);
		btnPayment.setBackground(new Color(255, 128, 0));
		btnPayment.setBounds(879, 11, 108, 23);
		panel.add(btnPayment);
		
		JButton btnLogoutExit = new JButton("Logout & Exit");
		btnLogoutExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogoutExit.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnLogoutExit.setBorderPainted(false);
		btnLogoutExit.setBackground(new Color(255, 128, 0));
		btnLogoutExit.setBounds(1337, 11, 157, 23);
		panel.add(btnLogoutExit);
		
		JPanel mainInput = new JPanel();
		mainInput.setBackground(SystemColor.scrollbar);
		mainInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mainInput.setBounds(335, 94, 1145, 162);
		//mainInput.setBorderPainting()
		frame.getContentPane().add(mainInput);
		mainInput.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Last Name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(158, 13, 120, 17);
		mainInput.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblFirstName.setBounds(339, 13, 120, 17);
		mainInput.add(lblFirstName);
		
		JLabel lblContactNumber = new JLabel("Contact Number:");
		lblContactNumber.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblContactNumber.setBounds(532, 11, 120, 17);
		mainInput.add(lblContactNumber);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblAge.setBounds(925, 11, 41, 17);
		mainInput.add(lblAge);
		
		textField = new JTextField();
		textField.setBounds(148, 33, 159, 20);
		mainInput.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(339, 33, 159, 20);
		mainInput.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(532, 33, 159, 20);
		mainInput.add(textField_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(925, 33, 41, 20);
		mainInput.add(spinner);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblHeight.setBounds(148, 64, 120, 17);
		mainInput.add(lblHeight);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(148, 86, 159, 20);
		mainInput.add(textField_3);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblWeight.setBounds(339, 64, 120, 17);
		mainInput.add(lblWeight);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(339, 86, 159, 20);
		mainInput.add(textField_4);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblGender.setBounds(532, 64, 120, 17);
		mainInput.add(lblGender);
		
		JList list = new JList();
		list.setValueIsAdjusting(true);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(1);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(532, 86, 128, 20);
		mainInput.add(list);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(723, 33, 159, 20);
		mainInput.add(textField_6);
		
		JLabel lblBirthdate = new JLabel("Birthdate:");
		lblBirthdate.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblBirthdate.setBounds(723, 11, 120, 17);
		mainInput.add(lblBirthdate);
		
		JButton btnNewButton = new JButton("show gender");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel DLM = new DefaultListModel();
				DLM.addElement("Male");
				DLM.addElement("Female");
				DLM.addElement("LGBT");
				DLM.addElement("Prefer not to say");
				list.setModel(DLM);
			}
		});
		btnNewButton.setBounds(666, 85, 232, 23);
		mainInput.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(SystemColor.scrollbar);
		panel_1.setBounds(134, 281, 1631, 738);
		frame.getContentPane().add(panel_1);
	}
}
