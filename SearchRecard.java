import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchRecard extends JFrame {

	private JPanel contentPane;
	private JTextField txt_studentName;
	private JTextField txt_studentRollnumber;
	private JTextField txt_Receptnumber;
	private JTextField txt_rl;
	private JTextField txt_tl;
	private JTextField txt_student;
	private JTextField text_paymentMode;
	private JTextField txt_session;
	private JTextField txt_Tosession;
	private JTextField text_course;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField txt_amount;
	private JTextField txt_cgst;
	private JTextField txt_sgst;
	private JTextField txt_total;
	private JTextField txt_head;
	private JTextField txt_inWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchRecard frame = new SearchRecard();
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
	
	String Studant;
	public SearchRecard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 512);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(245, 245, 245));
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 306, 462);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Search Record");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 34));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\search2.png"));
		lblNewLabel.setBounds(10, 0, 275, 73);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter The Student  Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(27, 195, 235, 34);
		panel.add(lblNewLabel_1);
		
		txt_studentName = new JTextField();
		txt_studentName.setBounds(27, 150, 221, 34);
		panel.add(txt_studentName);
		txt_studentName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("OR");
		lblNewLabel_2.setForeground(new Color(139, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(101, 240, 46, 41);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Student Rollnumber");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_3.setBounds(27, 334, 221, 49);
		panel.add(lblNewLabel_3);
		
		txt_studentRollnumber = new JTextField();
		txt_studentRollnumber.setBounds(27, 279, 222, 34);
		panel.add(txt_studentRollnumber);
		txt_studentRollnumber.setColumns(10);
		
		JButton btn_search = new JButton("Search");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rollnumber=txt_studentRollnumber.getText();
				String tudant=txt_studentName.getText();
				if(rollnumber.equals("")) {
					try
					{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usersingup","root","root");
					String sql="select * from AddfeeData where studant='"+tudant+"' ;";
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery(sql);
					
					
						
						if(rs.next()) {
						
						
							String Receptnumber=rs.getString(1);
							txt_Receptnumber.setText(Receptnumber);	
						String	Datevalue=rs.getString(2);
						txt_tl.setText(Datevalue);
						String matheods=rs.getString(3);
						text_paymentMode.setText(matheods);
						int Rollnumber=rs.getInt(4);
						txt_rl.setText(String.valueOf(Rollnumber));
						int y=rs.getInt(5);
						txt_session.setText(String.valueOf(y));
						int yto=rs.getInt(6);
						txt_Tosession.setText(String.valueOf(yto));
						String studant=rs.getString(7);
						txt_student.setText(studant);
						double cgst=rs.getDouble(8);
						txt_cgst.setText(String.valueOf(cgst));
						double sgst=rs.getDouble(9);
						txt_sgst.setText(String.valueOf(sgst));
						long amount=rs.getLong(10);
						txt_amount.setText(String.valueOf(amount));
						double Totalamaunt=rs.getDouble(11);
						txt_total.setText(String.valueOf(Totalamaunt));
						String inWord=rs.getString(12);
						txt_inWord.setText(inWord);
						String head=rs.getString(13);
						txt_head.setText(head);
						text_course.setText(head);
						}
						else {
						JOptionPane.showMessageDialog(null, "Name not Found"); 
						}
						
						con.close();
					
					}
						
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
			if(tudant.equals("")) 
				{	
				
						try
							{
								Class.forName("com.mysql.cj.jdbc.Driver");
								Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/usersingup","root","root");
								String sql="select * from AddfeeData where  Rollnumber='"+rollnumber+"';";
								Statement stmt=conn.createStatement();
								ResultSet rs=stmt.executeQuery(sql);
								if(rs.next())
								{
										
									String Receptnumber=rs.getString(1);
									txt_Receptnumber.setText(Receptnumber);	
									String	Datevalue=rs.getString(2);
									txt_tl.setText(Datevalue);
									String matheods=rs.getString(3);
									text_paymentMode.setText(matheods);
									String Rollnumber=rs.getString(4);
									txt_rl.setText(Rollnumber);
									int y=rs.getInt(5);
									txt_session.setText(String.valueOf(y));
									int yto=rs.getInt(6);
									txt_Tosession.setText(String.valueOf(yto));
									String studant1=rs.getString(7);
									txt_student.setText(studant1);
									double cgst=rs.getDouble(8);
									txt_cgst.setText(String.valueOf(cgst));
									double sgst=rs.getDouble(9);
									txt_sgst.setText(String.valueOf(sgst));
									long amount=rs.getLong(10);
									txt_amount.setText(String.valueOf(amount));
									double Totalamaunt=rs.getDouble(11);
									txt_total.setText(String.valueOf(Totalamaunt));
									String inWord=rs.getString(12);
									txt_inWord.setText(inWord);
									String head=rs.getString(13);
									txt_head.setText(head);
									text_course.setText(head);
									JOptionPane.showMessageDialog(null, " Record found "); 
									
									
								}
								else
								{
									JOptionPane.showMessageDialog(null, "recard is not found"); 
								}
								conn.close();
					
							}
							catch(Exception ex)
							{
								ex.printStackTrace();
							}
					
						}
			
			}
		});
		btn_search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color bk=new Color(0,51,51);
				btn_search.setBackground(bk);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color bk=new Color(47,79,79);
				btn_search.setBackground(bk);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btn_search.setForeground(new Color(245, 245, 245));
		btn_search.setBackground(new Color(47, 79, 79));
		btn_search.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btn_search.setBounds(194, 394, 89, 41);
		panel.add(btn_search);
		
		JButton btn_back = new JButton("Back");
		btn_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			Color bk=new Color(0,51,51);
			btn_back.setBackground(bk);
			
			
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color bk=new Color(240,240,240);
				btn_back.setBackground(bk);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Add_Fees fs=new Add_Fees();
				fs.show();
				dispose();
			}
		});
		btn_back.setBounds(37, 394, 89, 41);
		panel.add(btn_back);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(305, 0, 502, 462);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Recept No :");
		lblNewLabel_4.setForeground(new Color(248, 248, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(22, 37, 85, 19);
		panel_1.add(lblNewLabel_4);
		
		txt_Receptnumber = new JTextField();
		txt_Receptnumber.setBounds(101, 38, 94, 20);
		panel_1.add(txt_Receptnumber);
		txt_Receptnumber.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Date :");
		lblNewLabel_4_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(300, 24, 51, 19);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Rollnumber :\r\n");
		lblNewLabel_4_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2.setBounds(267, 85, 85, 19);
		panel_1.add(lblNewLabel_4_2);
		
		txt_rl = new JTextField();
		txt_rl.setColumns(10);
		txt_rl.setBounds(352, 86, 110, 20);
		panel_1.add(txt_rl);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Student Name :\r\n");
		lblNewLabel_4_2_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1.setBounds(22, 85, 110, 19);
		panel_1.add(lblNewLabel_4_2_1);
		
		txt_student = new JTextField();
		txt_student.setBounds(126, 86, 110, 20);
		panel_1.add(txt_student);
		txt_student.setColumns(10);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("Payment Mode :\r\n");
		lblNewLabel_4_2_1_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1_1.setBounds(22, 154, 110, 19);
		panel_1.add(lblNewLabel_4_2_1_1);
		
		text_paymentMode = new JTextField();
		text_paymentMode.setColumns(10);
		text_paymentMode.setBounds(139, 155, 110, 20);
		panel_1.add(text_paymentMode);
		
		JLabel lblNewLabel_4_2_1_1_1 = new JLabel("Session\r\n");
		lblNewLabel_4_2_1_1_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1_1_1.setBounds(22, 196, 62, 19);
		panel_1.add(lblNewLabel_4_2_1_1_1);
		
		JLabel lblNewLabel_4_2_1_1_2 = new JLabel("To\r\n");
		lblNewLabel_4_2_1_1_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1_1_2.setBounds(139, 196, 28, 19);
		panel_1.add(lblNewLabel_4_2_1_1_2);
		
		txt_session = new JTextField();
		txt_session.setColumns(10);
		txt_session.setBounds(78, 197, 54, 20);
		panel_1.add(txt_session);
		
		txt_Tosession = new JTextField();
		txt_Tosession.setColumns(10);
		txt_Tosession.setBounds(163, 197, 54, 20);
		panel_1.add(txt_Tosession);
		
		JLabel lblNewLabel_4_3 = new JLabel("Course :");
		lblNewLabel_4_3.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_3.setBounds(22, 126, 62, 19);
		panel_1.add(lblNewLabel_4_3);
		
		text_course = new JTextField();
		text_course.setColumns(10);
		text_course.setBounds(78, 127, 110, 20);
		panel_1.add(text_course);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 224, 502, 29);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 264, 502, 12);
		panel_1.add(separator_1);
		
		JLabel lblNewLabel_4_2_1_1_1_1 = new JLabel("Amount :\r\n");
		lblNewLabel_4_2_1_1_1_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_2_1_1_1_1.setBounds(368, 227, 94, 39);
		panel_1.add(lblNewLabel_4_2_1_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(0, 128, 0));
		panel_1_1.setBounds(0, 0, 502, 462);
		panel_1.add(panel_1_1);
		
		JLabel lblNewLabel_4_4 = new JLabel("Recept No :");
		lblNewLabel_4_4.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_4.setBounds(22, 37, 85, 19);
		panel_1_1.add(lblNewLabel_4_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(101, 38, 94, 20);
		panel_1_1.add(textField_7);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Date :");
		lblNewLabel_4_1_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1_1.setBounds(300, 24, 51, 19);
		panel_1_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("Rollnumber :\r\n");
		lblNewLabel_4_2_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_2.setBounds(267, 85, 85, 19);
		panel_1_1.add(lblNewLabel_4_2_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(352, 86, 110, 20);
		panel_1_1.add(textField_8);
		
		JLabel lblNewLabel_4_2_1_2 = new JLabel("Student Name :\r\n");
		lblNewLabel_4_2_1_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1_2.setBounds(22, 85, 110, 19);
		panel_1_1.add(lblNewLabel_4_2_1_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(126, 86, 110, 20);
		panel_1_1.add(textField_9);
		
		JLabel lblNewLabel_4_2_1_1_3 = new JLabel("Payment Mode :\r\n");
		lblNewLabel_4_2_1_1_3.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1_1_3.setBounds(22, 154, 110, 19);
		panel_1_1.add(lblNewLabel_4_2_1_1_3);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(139, 155, 110, 20);
		panel_1_1.add(textField_10);
		
		JLabel lblNewLabel_4_2_1_1_1_2 = new JLabel("Session\r\n");
		lblNewLabel_4_2_1_1_1_2.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1_1_1_2.setBounds(22, 196, 62, 19);
		panel_1_1.add(lblNewLabel_4_2_1_1_1_2);
		
		JLabel lblNewLabel_4_2_1_1_2_1 = new JLabel("To\r\n");
		lblNewLabel_4_2_1_1_2_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_2_1_1_2_1.setBounds(139, 196, 28, 19);
		panel_1_1.add(lblNewLabel_4_2_1_1_2_1);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(78, 197, 54, 20);
		panel_1_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(163, 197, 54, 20);
		panel_1_1.add(textField_12);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Course :");
		lblNewLabel_4_3_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_3_1.setBounds(22, 126, 62, 19);
		panel_1_1.add(lblNewLabel_4_3_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(78, 127, 110, 20);
		panel_1_1.add(textField_13);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 224, 502, 29);
		panel_1_1.add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(0, 264, 502, 12);
		panel_1_1.add(separator_1_1);
		
		JLabel lblNewLabel_4_2_1_1_1_1_1 = new JLabel("Amount :\r\n");
		lblNewLabel_4_2_1_1_1_1_1.setForeground(new Color(248, 248, 255));
		lblNewLabel_4_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4_2_1_1_1_1_1.setBounds(368, 227, 94, 39);
		panel_1_1.add(lblNewLabel_4_2_1_1_1_1_1);
		
		txt_amount = new JTextField();
		txt_amount.setBounds(352, 277, 140, 29);
		panel_1_1.add(txt_amount);
		txt_amount.setColumns(10);
		
		txt_cgst = new JTextField();
		txt_cgst.setColumns(10);
		txt_cgst.setBounds(352, 317, 140, 29);
		panel_1_1.add(txt_cgst);
		
		txt_sgst = new JTextField();
		txt_sgst.setColumns(10);
		txt_sgst.setBounds(352, 357, 140, 29);
		panel_1_1.add(txt_sgst);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(344, 397, 158, 12);
		panel_1_1.add(separator_3);
		
		txt_total = new JTextField();
		txt_total.setColumns(10);
		txt_total.setBounds(352, 409, 140, 29);
		panel_1_1.add(txt_total);
		
		JLabel lblNewLabel_5 = new JLabel("CGST :\r\n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(286, 319, 56, 21);
		panel_1_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("SGST :\r\n");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(286, 359, 56, 21);
		panel_1_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Total :\r\n");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(291, 416, 51, 21);
		panel_1_1.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6 = new JLabel("Head");
		lblNewLabel_6.setForeground(new Color(245, 255, 250));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(126, 224, 54, 39);
		panel_1_1.add(lblNewLabel_6);
		
		txt_head = new JTextField();
		txt_head.setBounds(78, 281, 127, 20);
		panel_1_1.add(txt_head);
		txt_head.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("In Word :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setForeground(new Color(248, 248, 255));
		lblNewLabel_7.setBounds(0, 397, 78, 14);
		panel_1_1.add(lblNewLabel_7);
		
		txt_inWord = new JTextField();
		txt_inWord.setColumns(10);
		txt_inWord.setBounds(78, 388, 184, 29);
		panel_1_1.add(txt_inWord);
		
		JButton btnNewButton_1 = new JButton("Print");
		btnNewButton_1.setBounds(22, 439, 89, 23);
		panel_1_1.add(btnNewButton_1);
		
		txt_tl = new JTextField();
		txt_tl.setBounds(348, 25, 102, 20);
		panel_1_1.add(txt_tl);
		txt_tl.setColumns(10);
	}
}
