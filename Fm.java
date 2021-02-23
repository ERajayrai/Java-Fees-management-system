import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


import com.toedter.calendar.JDateChooser;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Fm {

	private JFrame frame;
	private JTextField txt_firstname;
	private JTextField txt_lastname;
	private JTextField txt_username;
	private JPasswordField psd_password;
	private JPasswordField psd_conformpassword;
	private JTextField text_contactnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fm window = new Fm();
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
	public Fm() {
		initialize();
		
	}
	String cname,uname,cnumber,password,cpassword,lname;
	
	Date dob;


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 503, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(265, 11, -209, 26);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		panel_1.setBounds(0, 0, 487, 72);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Signup\r\n");
		lblNewLabel.setForeground(new Color(245, 255, 250));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 45));
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.setBackground(new Color(0, 0, 205));
		panel_2.setForeground(new Color(0, 128, 0));
		panel_2.setBounds(0, 72, 487, 401);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("FirstName:");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(50, 53, 88, 28);
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("LastName:");
		lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(50, 93, 88, 19);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("UserName:");
		lblNewLabel_1_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(50, 129, 88, 19);
		panel_2.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Password:");
		lblNewLabel_1_1_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_3.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_3.setBounds(50, 177, 88, 28);
		panel_2.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("ConformPassword:");
		lblNewLabel_1_1_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_4.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_4.setBounds(10, 221, 128, 28);
		panel_2.add(lblNewLabel_1_1_4);
		
		JLabel lblNewLabel_1_1_5 = new JLabel("D.O.B:");
		lblNewLabel_1_1_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_5.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_5.setBounds(69, 260, 69, 28);
		panel_2.add(lblNewLabel_1_1_5);
		
		JLabel lblNewLabel_1_1_6 = new JLabel("Contact No:");
		lblNewLabel_1_1_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_6.setForeground(new Color(240, 255, 240));
		lblNewLabel_1_1_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_6.setBounds(10, 299, 110, 28);
		panel_2.add(lblNewLabel_1_1_6);
		
		txt_firstname = new JTextField();
		txt_firstname.setBackground(new Color(255, 255, 255));
		txt_firstname.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_firstname.setBounds(136, 53, 224, 28);
		panel_2.add(txt_firstname);
		txt_firstname.setColumns(10);
		
		JDateChooser txt_bob = new JDateChooser();
		txt_bob.setBounds(136, 252, 224, 27);
		panel_2.add(txt_bob);
		
		txt_lastname = new JTextField();
		txt_lastname.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_lastname.setColumns(10);
		txt_lastname.setBackground(Color.WHITE);
		txt_lastname.setBounds(136, 92, 224, 28);
		panel_2.add(txt_lastname);
		
		txt_username = new JTextField();
		txt_username.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txt_username.setColumns(10);
		txt_username.setBackground(Color.WHITE);
		txt_username.setBounds(136, 131, 224, 32);
		panel_2.add(txt_username);
		
		psd_password = new JPasswordField();
	
		
		psd_password.setBounds(136, 174, 224, 28);
		panel_2.add(psd_password);
		
		psd_conformpassword = new JPasswordField();
		psd_conformpassword.setBounds(136, 213, 224, 28);
		panel_2.add(psd_conformpassword);
		
		text_contactnumber = new JTextField();
		text_contactnumber.setFont(new Font("Tahoma", Font.PLAIN, 25));
		text_contactnumber.setColumns(10);
		text_contactnumber.setBackground(Color.WHITE);
		text_contactnumber.setBounds(136, 296, 224, 28);
		panel_2.add(text_contactnumber);
		
		
		JButton btn_signup = new JButton("Signup");
		btn_signup.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				loginpage pg=new loginpage();
				pg.show();
				frame.dispose();
				
			}
		});
		btn_signup.addActionListener(new ActionListener() {
			@SuppressWarnings({ "deprecation", "unlikely-arg-type" })
			boolean validation() {
				
				
				cname=txt_firstname.getText();
				
				lname=txt_lastname.getText();
				uname=txt_username.getText();
				cnumber=text_contactnumber.getText();
				password=psd_password.getText();
				cpassword=psd_conformpassword.getText();
				dob=txt_bob.getDate();
				if(cname.equals("")) {
					JOptionPane.showMessageDialog(txt_firstname, "please enter first name");
					return false;
				}
				if(lname.equals("")) {
					JOptionPane.showMessageDialog(txt_firstname, "please enter lastname");
					return false;
				}
				if(cnumber.equals("")) {
					JOptionPane.showMessageDialog(txt_firstname, "please enter ContactNumber");
					return false;
				}
				if(password.equals("")) {
					JOptionPane.showMessageDialog(txt_firstname, "please enter the password");
					return false;
				}
				if(cpassword.equals("")) {
					JOptionPane.showMessageDialog(txt_firstname, "please enter the conformpassword");
					return false;
				}
				if(dob.equals("")) {
					JOptionPane.showMessageDialog(txt_firstname, "please enter the date of barth");
					return false;
				}
				return true; 
			}
				
				
			
		
			public void actionPerformed(ActionEvent e) {
				
				validation() ;
					insertDetails(); 
					
				
					
				
			}
			void insertDetails() {
				DateFormat formate=new SimpleDateFormat("yyyy-mm-dd");
				String	myDob=formate.format(dob);
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usersingup","root","root");
					String sql="insert into signup values('"+myDob+"','"+cname+"' ,'"+lname+"','"+uname+"','"+password+"','"+cnumber+"');";
					Statement stmt=con.createStatement();
					int i=stmt.executeUpdate(sql);
					if(i>0) 
					{
						JOptionPane.showMessageDialog(btn_signup,  "record inserted");
						loginpage pj=new loginpage();
						pj.show();
						frame.dispose();
					}
					else 
					{
						JOptionPane.showMessageDialog(btn_signup, "recard not inserted");
					}	
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			
			}
			
		});
		btn_signup.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_signup.setForeground(new Color(0, 0, 128));
		btn_signup.setBackground(Color.WHITE);
		btn_signup.setBounds(69, 349, 97, 41);
		panel_2.add(btn_signup);
		
		JButton btn_login = new JButton("Login");
		btn_login.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn_login.setForeground(new Color(0, 0, 128));
		btn_login.setBounds(261, 349, 89, 41);
		panel_2.add(btn_login);
	
	}

	
}
