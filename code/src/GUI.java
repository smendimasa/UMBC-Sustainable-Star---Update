import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.TextArea;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JPanel login_Panel;
	private JPanel addDataPanel;
	private JPanel panel;
	private JPanel schoolPanel;
	private JPanel placesPanel;
	private JPanel rankPanel;
	private JTextField loginTextField;
	private JPasswordField passwordTextField;

	private ButtonGroup radioButtonsGroup;
	private JRadioButton placeRButton;
	private JRadioButton rankRButton;
	private JRadioButton addDataRButton;

	private JTextArea textAreaPlaces;
	private JTextArea dRankTextArea;
	private JTextArea wRankTextArea;
	private GUIManager manager;
	private JTextField txtDailyRanking;
	private JTextField txtWeeklyRanking;

	private JList recyleList;
	private JList landFillList;
	private JList compostList;
	
	private String userName="";
	
	JLabel lblNewLabel_1;
	private JTextField fNameField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField textField_3;
	private JPasswordField textField_4;
	
	private JPanel createUserPanel;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// instance of image icon to hold a picture
		// add this image as a header to the gui

		ImageIcon image = new ImageIcon("sustain_head2.jpg");
		JLabel imageLabel = new JLabel();
		imageLabel.setBackground(Color.WHITE);
		imageLabel.setBounds(-122, 11, 792, 102);
		imageLabel.setIcon(image);
		contentPane.add(imageLabel);

		ImageIcon image2 = new ImageIcon("sustain_tail.png");
		JLabel imageLabeltail = new JLabel();
		imageLabeltail.setBounds(-43, 427, 792, 102);
		imageLabeltail.setIcon(image2);
		contentPane.add(imageLabeltail);
		
		
		manager = new GUIManager();
		startPanel();
		loginPanel();
		createUserPanel();
		addDataPanel();
		schoolPanel();
		placesPanel();
		rankPanel();
		
		
		

		

	}
	
	public void createUserPanel(){
		createUserPanel = new JPanel();
		createUserPanel.setBackground(Color.WHITE);
		createUserPanel.setBounds(127, 124, 482, 302);
		contentPane.add(createUserPanel);
		createUserPanel.setLayout(null);
		createUserPanel.setVisible(false);
		
		JLabel lblPleaseEnterThe = new JLabel("Please Enter the Following Information:");
		lblPleaseEnterThe.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPleaseEnterThe.setBounds(102, 33, 348, 25);
		createUserPanel.add(lblPleaseEnterThe);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFirstName.setBounds(29, 81, 85, 14);
		createUserPanel.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblLastName.setBounds(29, 106, 85, 14);
		createUserPanel.add(lblLastName);
		
		JLabel lblCollege = new JLabel("College\r\n");
		lblCollege.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCollege.setBounds(29, 156, 85, 14);
		createUserPanel.add(lblCollege);
		
		JLabel lblUsername_1 = new JLabel("Username:");
		lblUsername_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUsername_1.setBounds(29, 181, 85, 14);
		createUserPanel.add(lblUsername_1);
		
		JLabel lblPassword_1 = new JLabel("Password:\r\n");
		lblPassword_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword_1.setBounds(29, 206, 85, 14);
		createUserPanel.add(lblPassword_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmPassword.setBounds(10, 231, 124, 14);
		createUserPanel.add(lblConfirmPassword);
		
		fNameField = new JTextField();
		fNameField.setBounds(135, 79, 86, 20);
		createUserPanel.add(fNameField);
		fNameField.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(135, 104, 86, 20);
		createUserPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(135, 154, 86, 20);
		createUserPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(135, 179, 86, 20);
		createUserPanel.add(textField_2);
		
		textField_3 = new JPasswordField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 204, 86, 20);
		createUserPanel.add(textField_3);
		
		textField_4 = new JPasswordField();
		textField_4.setColumns(10);
		textField_4.setBounds(135, 229, 86, 20);
		createUserPanel.add(textField_4);
		
		

		JLabel lblGradeLevel = new JLabel("Grade Level");
		lblGradeLevel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGradeLevel.setBounds(29, 131, 105, 14);
		createUserPanel.add(lblGradeLevel);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(135, 129, 86, 20);
		createUserPanel.add(textField_5);
		
		JButton btnNewButton_1 = new JButton("Submit\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname, lname, gradeL;
				fname=fNameField.getText();
				lname=textField.getText();
				gradeL=textField_5.getText();
				manager.univ1.addStudent(fname, lname, gradeL);
				
				placesPanel.setVisible(false);
				login_Panel.setVisible(false);
				
				rankPanel.setVisible(false);
				recyleList.setVisible(false);
				landFillList.setVisible(false);
				compostList.setVisible(false);
				loginTextField.setText("");
				passwordTextField.setText("");
				lblNewLabel_1.setVisible(false);
				createUserPanel.setVisible(false);
				panel.setVisible(false);
				schoolPanel.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(156, 260, 89, 23);
		createUserPanel.add(btnNewButton_1);
		
		JButton btnCancel = new JButton("Cancel\r\n");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				placesPanel.setVisible(false);
				login_Panel.setVisible(false);
				schoolPanel.setVisible(false);
				rankPanel.setVisible(false);
				recyleList.setVisible(false);
				landFillList.setVisible(false);
				compostList.setVisible(false);
				loginTextField.setText("");
				passwordTextField.setText("");
				lblNewLabel_1.setVisible(false);
				createUserPanel.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnCancel.setBounds(280, 260, 89, 23);
		createUserPanel.add(btnCancel);
		
	}

	public void rankPanel() {
		rankPanel = new JPanel();
		rankPanel.setBackground(Color.WHITE);
		rankPanel.setBounds(10, 192, 672, 245);
		contentPane.add(rankPanel);
		rankPanel.setLayout(null);

		dRankTextArea = new JTextArea();
		dRankTextArea.setBackground(SystemColor.menu);
		dRankTextArea.setBounds(54, 45, 253, 189);
		dRankTextArea.setEditable(false);

		rankPanel.add(dRankTextArea);

		wRankTextArea = new JTextArea();
		wRankTextArea.setEditable(false);
		wRankTextArea.setBackground(SystemColor.menu);
		wRankTextArea.setBounds(370, 45, 253, 189);
		rankPanel.add(wRankTextArea);

		txtDailyRanking = new JTextField();
		txtDailyRanking.setEditable(false);
		txtDailyRanking.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDailyRanking.setText("Daily Ranking: ");
		txtDailyRanking.setBounds(109, 11, 141, 23);
		rankPanel.add(txtDailyRanking);
		txtDailyRanking.setColumns(10);

		txtWeeklyRanking = new JTextField();
		txtWeeklyRanking.setEditable(false);
		txtWeeklyRanking.setText("Weekly Ranking: ");
		txtWeeklyRanking.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtWeeklyRanking.setColumns(10);
		txtWeeklyRanking.setBounds(420, 11, 141, 23);
		rankPanel.add(txtWeeklyRanking);

		JButton btnExit_2 = new JButton("Log Off");
		btnExit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thanks for Running this Application! ");
				placesPanel.setVisible(false);
				login_Panel.setVisible(false);
				schoolPanel.setVisible(false);
				rankPanel.setVisible(false);
				recyleList.setVisible(false);
				landFillList.setVisible(false);
				compostList.setVisible(false);
				createUserPanel.setVisible(false);
				loginTextField.setText("");
				passwordTextField.setText("");
				lblNewLabel_1.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnExit_2.setBounds(288, 13, 89, 23);
		rankPanel.add(btnExit_2);
		rankPanel.setVisible(false);
	}

	public void placesPanel() {
		placesPanel = new JPanel();
		placesPanel.setBackground(Color.WHITE);
		placesPanel.setBounds(10, 192, 672, 251);
		contentPane.add(placesPanel);
		placesPanel.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setToolTipText("");
		comboBox.setMaximumRowCount(10);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "True Grit's", "Salsaritas", "2.Mato", "Pollo",
				"Masala", "Wild Greens", "Outtakes", "AuBonPain", "Hissho", "Mondo Subs" }));
		comboBox.setBounds(21, 46, 89, 20);
		placesPanel.add(comboBox);

		comboBox.addItemListener(new checkItemListener());

		JLabel lblNewLabel = new JLabel("Food Location:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(21, 21, 126, 25);
		placesPanel.add(lblNewLabel);

		JLabel lblMaterialType = new JLabel("Recylable | Compost | Landfill");
		lblMaterialType.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMaterialType.setBounds(281, 21, 272, 25);
		placesPanel.add(lblMaterialType);

		textAreaPlaces = new JTextArea();
		textAreaPlaces.setBackground(SystemColor.menu);
		textAreaPlaces.setBounds(157, 44, 487, 189);

		placesPanel.add(textAreaPlaces);

		JButton btnExit_1 = new JButton("Log Off");
		btnExit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Thanks for Running this Application! ");
				placesPanel.setVisible(false);
				login_Panel.setVisible(false);
				schoolPanel.setVisible(false);
				rankPanel.setVisible(false);
				recyleList.setVisible(false);
				createUserPanel.setVisible(false);
				landFillList.setVisible(false);
				lblNewLabel_1.setVisible(false);
				compostList.setVisible(false);
				loginTextField.setText("");
				passwordTextField.setText("");
				panel.setVisible(true);
			}
		});
		btnExit_1.setBounds(21, 196, 89, 23);
		placesPanel.add(btnExit_1);
		placesPanel.setVisible(false);
	}

	public void schoolPanel() {
		schoolPanel = new JPanel();
		schoolPanel.setBackground(Color.WHITE);
		schoolPanel.setBounds(66, 103, 562, 82);
		contentPane.add(schoolPanel);
		schoolPanel.setLayout(null);
		schoolPanel.setVisible(false);

		JLabel lblSchoolUmbc = new JLabel("School: UMBC");
		lblSchoolUmbc.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSchoolUmbc.setBounds(86, 11, 250, 37);
		schoolPanel.add(lblSchoolUmbc);

		//System.out.println(userName);
		String label1 ="User: "+userName;
		System.out.println(label1);
		JLabel lblWelcomeSam = new JLabel(label1);
		lblWelcomeSam.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcomeSam.setBounds(236, 2, 196, 56);
		schoolPanel.add(lblWelcomeSam);

		String label2="  Class: "+manager.univ1.getClassLevel(userName);
		JLabel lblClassJunior = new JLabel(label2);
		lblClassJunior.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblClassJunior.setBounds(346, 2, 196, 56);
		schoolPanel.add(lblClassJunior);

		// makes the integer radio button
		radioButtonsGroup = new ButtonGroup();
		placeRButton = new JRadioButton("Places");
		placeRButton.setBounds(96, 55, 109, 23);
		schoolPanel.add(placeRButton);
		placeRButton.setBackground(Color.WHITE);
		radioButtonsGroup.add(placeRButton);

		// makes the String radio button
		rankRButton = new JRadioButton("Rank");
		rankRButton.setBounds(246, 55, 109, 23);
		schoolPanel.add(rankRButton);
		rankRButton.setBackground(Color.WHITE);
		radioButtonsGroup.add(rankRButton);

		// makes the object radio button
		addDataRButton = new JRadioButton("Add Data");
		addDataRButton.setBounds(391, 55, 109, 23);
		schoolPanel.add(addDataRButton);
		addDataRButton.setBackground(Color.WHITE);
		radioButtonsGroup.add(addDataRButton);

		// makes a radio button group
		// radioButtonsGroup = new ButtonGroup();
		// add a listener object to each radio button
		placeRButton.addActionListener(new RadioButtonListener());
		rankRButton.addActionListener(new RadioButtonListener());
		addDataRButton.addActionListener(new RadioButtonListener());

		// placesPanel();
	}

	public void addDataPanel() {

		addDataPanel = new JPanel();
		addDataPanel.setBackground(Color.WHITE);
		addDataPanel.setBounds(10, 190, 672, 243);
		contentPane.add(addDataPanel);
		addDataPanel.setLayout(null);

		recyleList = new JList();
		recyleList.setModel(new AbstractListModel() {
			String[] values = new String[] { "Soda Cans", "Plastic Water Bottles", "Plastic Cups", "Steel / Glass Cups",
					"Mixed Paper" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		recyleList.setBounds(62, 51, 140, 128);
		addDataPanel.add(recyleList);

		compostList = new JList();
		compostList.setModel(new AbstractListModel() {
			String[] values = new String[] { "Fruits", "Non-Oily Food", "Leaves", "Tea Bags", "Coffe Grounds",
					"Egg Shells", "Flowers" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		compostList.setBounds(274, 51, 140, 128);
		addDataPanel.add(compostList);

		lblNewLabel_1 = new JLabel("Recyclable:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(85, 11, 97, 29);
		addDataPanel.add(lblNewLabel_1);

		JLabel lblCompost = new JLabel("Compost:");
		lblCompost.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCompost.setBounds(287, 11, 97, 29);
		addDataPanel.add(lblCompost);

		JLabel lblLandfill = new JLabel("Landfill:");
		lblLandfill.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblLandfill.setBounds(492, 11, 97, 29);
		addDataPanel.add(lblLandfill);

		landFillList = new JList();
		landFillList.setModel(new AbstractListModel() {
			String[] values = new String[] { "Pizza Grease", "Cooking oil", "Heavily coated or printed paper",
					"Special Plastics" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		landFillList.setBounds(463, 51, 140, 128);
		addDataPanel.add(landFillList);

		JButton btnNewButton = new JButton("Submit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ampSelected=0.0;
				
				int[] selectedRec = recyleList.getSelectedIndices();
				int[] selectedComp = compostList.getSelectedIndices();
				int[] selectedland = landFillList.getSelectedIndices();
			     
				ampSelected=(0.5*(selectedRec.length-1))+(selectedComp.length-1)+(0.2*(selectedland.length-1));
				manager.univ1.addRank(userName, ampSelected);
				
				recyleList.clearSelection();
				landFillList.clearSelection();
				compostList.clearSelection();
			}
		});
		btnNewButton.setBounds(202, 192, 89, 23);
		addDataPanel.add(btnNewButton);

		JButton btnLogOff = new JButton("Log Off\r\n");
		btnLogOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				placesPanel.setVisible(false);
				login_Panel.setVisible(false);
				schoolPanel.setVisible(false);
				rankPanel.setVisible(false);
				landFillList.setVisible(false);
				createUserPanel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				compostList.setVisible(false);
				recyleList.setVisible(false);
				loginTextField.setText("");
				passwordTextField.setText("");
				panel.setVisible(true);
			}
		});
		btnLogOff.setBounds(338, 190, 89, 23);
		addDataPanel.add(btnLogOff);
		addDataPanel.setVisible(false);
		// contentPane.add(rankPanel);
	}

	public void startPanel() {
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(126, 143, 429, 231);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblWelcomeToSustainable = new JLabel("Welcome to Sustainable Star !");
		lblWelcomeToSustainable.setBounds(134, 11, 233, 38);
		panel.add(lblWelcomeToSustainable);

		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createUserPanel.setVisible(true);
				panel.setVisible(false);
			}
		});
		btnCreateAccount.setBounds(134, 49, 155, 23);
		panel.add(btnCreateAccount);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				login_Panel.setVisible(true);

			}
		});
		btnLogin.setBounds(165, 83, 89, 23);
		panel.add(btnLogin);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// exits the application
				System.exit(0);
			}
		});
		btnExit.setBounds(165, 117, 89, 23);
		panel.add(btnExit);

	}

	public void loginPanel() {

		login_Panel = new JPanel();
		login_Panel.setBackground(Color.WHITE);
		login_Panel.setBounds(114, 128, 462, 274);
		contentPane.add(login_Panel);
		login_Panel.setLayout(null);
		login_Panel.setVisible(false);

		JLabel lblUsername = new JLabel("UserName: ");
		lblUsername.setBounds(128, 104, 75, 20);
		login_Panel.add(lblUsername);
		

		loginTextField = new JTextField();
		loginTextField.setBounds(198, 104, 86, 20);
		login_Panel.add(loginTextField);
		loginTextField.setColumns(10);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(128, 138, 75, 20);
		login_Panel.add(lblPassword);

		passwordTextField = new JPasswordField();
		passwordTextField.setColumns(10);
		passwordTextField.setBounds(198, 138, 86, 20);
		login_Panel.add(passwordTextField);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// exits the application
				System.exit(0);
			}
		});
		btnExit.setBounds(278, 181, 89, 23);
		login_Panel.add(btnExit);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login=manager.univ1.login(loginTextField.getText());
				
				if(login.equals("")){
					JOptionPane.showMessageDialog(null, "Error !");
				}
				else{
					userName=login;
					schoolPanel();
					System.out.println(userName);
				login_Panel.setVisible(false);
				schoolPanel.setVisible(true);
				}
			}
			
		});
		
		btnSubmit.setBounds(179, 181, 89, 23);
		login_Panel.add(btnSubmit);

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(80, 181, 89, 23);
		login_Panel.add(btnClear);

		JLabel lblPleaseEnterInformation = new JLabel("Please Enter Information Below: ");
		lblPleaseEnterInformation.setBounds(128, 79, 283, 14);
		login_Panel.add(lblPleaseEnterInformation);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login_Panel.setVisible(false);
				panel.setVisible(true);
			}
		});
		btnBack.setBounds(179, 215, 89, 23);
		login_Panel.add(btnBack);

	}

	private class checkItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if (e.getItem() == "Masala") {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					textAreaPlaces.setText(manager.getFoodList("Masala"));
					// System.out.println("Masala selected");
				}
			} // ends if

			else if (e.getItem() == "Salsaritas") {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					textAreaPlaces.setText(manager.getFoodList("Salsaritas"));
					// System.out.println("Masala selected");
				}
			} // ends if

			else if (e.getItem() == "AuBonPain") {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					textAreaPlaces.setText(manager.getFoodList("AuBonPain"));
					// System.out.println("Masala selected");
				}
			} // ends if

			else {
				textAreaPlaces.setText("");

			}

		}

	}

	private void hideList() {
		landFillList.setVisible(false);
		compostList.setVisible(false);
		recyleList.setVisible(false);
		lblNewLabel_1.setVisible(false);
	}

	private void showList() {
		landFillList.setVisible(true);
		compostList.setVisible(true);
		recyleList.setVisible(true);
		lblNewLabel_1.setVisible(true);
	}

	private class RadioButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// System.out.println("Hey, I am here!");
			// make new instance of the manager class
			// manager = new GUIManager<>();

			// when integer button is click display the integer panel and makes
			// the other panels not visible
			if (e.getSource() == placeRButton) {
				placesPanel.setVisible(true);
				addDataPanel.setVisible(false);
				rankPanel.setVisible(false);
				hideList();
			}

			else if (e.getSource() == rankRButton) {
				placesPanel.setVisible(false);
				addDataPanel.setVisible(false);
				rankPanel.setVisible(true);
				
				dRankTextArea.setText(manager.getRank());
				wRankTextArea.setText("Weekly Ranking will soon be available !");
				hideList();

				// System.out.println("Rank");
			} else if (e.getSource() == addDataRButton) {
				showList();
				placesPanel.setVisible(false);
				rankPanel.setVisible(false);
				addDataPanel.setVisible(true);

				// System.out.println("add Data");
			}

		}
	}
}
