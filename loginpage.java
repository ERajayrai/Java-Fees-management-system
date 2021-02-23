import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class loginpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage frame = new loginpage();
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
	String uname,password;
	public loginpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 393, 398);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(370, 87, -365, 71);
		panel.setBackground(Color.BLUE);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 377, 104);
		panel_1.setBackground(new Color(0, 0, 128));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login\r\n");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(158, 11, 56, 36);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("\r\n");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\admin.png"));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(68, 11, 80, 82);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 205));
		panel_2.setBounds(0, 104, 377, 255);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("UserName:");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(43, 44, 86, 25);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(43, 105, 86, 25);
		panel_2.add(lblNewLabel_1_1);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(139, 44, 182, 25);
		panel_2.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(139, 105, 182, 25);
		panel_2.add(txtPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\login.png"));
		
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				uname=txtUsername.getText();
				 password=txtPassword.getText();
				if(uname.trim().equals("")|| password.trim().equals("")) {
					
					JOptionPane.showMessageDialog(txtUsername, "please enter username and passwor ");
					
				}
				else {
					userVarification(  uname, password);
				}
				
			}
			void userVarification( String uname,String password) {
				try
					{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usersingup","root","root");
					String sql="select * from signup where uname='"+uname+"'and password='"+password+"';";
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					if(rs.next()) {
						JOptionPane.showMessageDialog(btnLogin, "Login successfully");
						home home=new home();
						home.show();
						dispose();
						
					}
					else {
						JOptionPane.showMessageDialog(txtUsername, "please enter correct username and password ");
					}
				}

				catch(Exception e)
				{
					e.printStackTrace();
				}
			
				
				
			}
		});
		
		btnLogin.setBackground(new Color(0, 51, 102));
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBounds(31, 172, 101, 33);
		panel_2.add(btnLogin);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				 
				
				// Fm.show();
				//dispose();
				
			
			}
		});
		btnSignup.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\signup.png"));
		btnSignup.setForeground(new Color(255, 255, 255));
		btnSignup.setBackground(new Color(0, 153, 0));
		btnSignup.setBounds(149, 173, 115, 33);
		panel_2.add(btnSignup);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setBackground(new Color(0, 102, 51));
		btnExit.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\exit.png"));
		btnExit.setBounds(274, 172, 93, 33);
		panel_2.add(btnExit);
		
		JLabel lbleror = new JLabel("");
		lbleror.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbleror.setForeground(new Color(204, 0, 0));
		lbleror.setBounds(43, 136, 229, 25);
		panel_2.add(lbleror);
		
	}
}
