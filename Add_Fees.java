import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Add_Fees extends JFrame {


	private JPanel contentPane;
	private JTextField txt_receiptno;
	private JTextField txt_dd;
	private JTextField txt_checkno;
	private JTextField year;
	private JTextField todate;
	private JTextField txt_rolno;
	private JTextField txt_head;
	private JTextField txt_amount;
	private JTextField txt_cgst;
	private JTextField txt_sgst;
	private JTextField txt_total;
	private JTextField txt_two;
	private JTextField txt_studantname;
	private JTextField txt_bankname;
	protected int page;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Add_Fees frame = new Add_Fees();
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
	String Receptnumber,Rollnumber,matheods,y,yto,head,bankname,studant,cgst,sgst,TotalAmaunt,inWord,DDname,amaunt,s,re,checknumber;
	Date date;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Add_Fees() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 583);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBounds(0, 11, 264, 533);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel pnlhome = new JPanel();
		pnlhome.setForeground(new Color(0, 0, 128));
		pnlhome.setBackground(new Color(0, 0, 128));
		pnlhome.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250)));
		pnlhome.setBounds(21, 11, 166, 64);
		panel.add(pnlhome);
		pnlhome.setLayout(null);
		
		
		
		JLabel btnhome = new JLabel("Home");
		btnhome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				pnlhome.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,128);
				pnlhome.setBackground(clr);
				
			}
			
		});
		btnhome.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		btnhome.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\home.png"));
		btnhome.setForeground(new Color(245, 255, 250));
		btnhome.setBounds(10, 11, 146, 42);
		pnlhome.add(btnhome);
		
		JPanel pnlhome_1 = new JPanel();
		pnlhome_1.setLayout(null);
		pnlhome_1.setForeground(new Color(0, 0, 128));
		pnlhome_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250)));
		pnlhome_1.setBackground(new Color(0, 0, 128));
		pnlhome_1.setBounds(21, 81, 192, 73);
		panel.add(pnlhome_1);
		
		JLabel lblSearchRecord = new JLabel("Search Record");
		lblSearchRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				pnlhome_1.setBackground(clr);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,128);
				pnlhome_1.setBackground(clr);
			}
		});
		lblSearchRecord.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\search2.png"));
		lblSearchRecord.setForeground(new Color(245, 255, 250));
		lblSearchRecord.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblSearchRecord.setBounds(10, 0, 194, 62);
		pnlhome_1.add(lblSearchRecord);
		
		JPanel pnlhome_2 = new JPanel();
		pnlhome_2.setLayout(null);
		pnlhome_2.setForeground(new Color(0, 0, 128));
		pnlhome_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250)));
		pnlhome_2.setBackground(new Color(0, 0, 128));
		pnlhome_2.setBounds(21, 160, 184, 79);
		panel.add(pnlhome_2);
		
		JLabel lblEditCource = new JLabel("Edit Cource");
		lblEditCource.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				pnlhome_2.setBackground(clr);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,128);
				pnlhome_2.setBackground(clr);
				
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Editcourse ed=new Editcourse();
				ed.show();
				dispose();
			}
		});
		lblEditCource.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\edit2.png"));
		lblEditCource.setForeground(new Color(245, 255, 250));
		lblEditCource.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblEditCource.setBounds(10, 11, 164, 57);
		pnlhome_2.add(lblEditCource);
		
		JPanel pnlhome_2_1 = new JPanel();
		pnlhome_2_1.setLayout(null);
		pnlhome_2_1.setForeground(new Color(0, 0, 128));
		pnlhome_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250)));
		pnlhome_2_1.setBackground(new Color(0, 0, 128));
		pnlhome_2_1.setBounds(21, 247, 184, 79);
		panel.add(pnlhome_2_1);
		
		JLabel lblCourseList = new JLabel("Course List\r\n");
		lblCourseList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				pnlhome_2_1.setBackground(clr);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,128);
				pnlhome_2_1.setBackground(clr);
			}
		});
		lblCourseList.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\list_1.png"));
		lblCourseList.setForeground(new Color(245, 255, 250));
		lblCourseList.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblCourseList.setBounds(10, 11, 164, 57);
		pnlhome_2_1.add(lblCourseList);
		
		JPanel pnlhome_2_1_1 = new JPanel();
		pnlhome_2_1_1.setLayout(null);
		pnlhome_2_1_1.setForeground(new Color(0, 0, 128));
		pnlhome_2_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250)));
		pnlhome_2_1_1.setBackground(new Color(0, 0, 128));
		pnlhome_2_1_1.setBounds(21, 337, 208, 79);
		panel.add(pnlhome_2_1_1);
		
		JLabel lblViewallRecord = new JLabel("ViewAll Record\r\n\r\n");
		lblViewallRecord.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				pnlhome_2_1_1.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,128);
				pnlhome_2_1_1.setBackground(clr);
			}
		});
		lblViewallRecord.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\view all record.png"));
		lblViewallRecord.setForeground(new Color(245, 255, 250));
		lblViewallRecord.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblViewallRecord.setBounds(10, 11, 188, 57);
		pnlhome_2_1_1.add(lblViewallRecord);
		
		JPanel pnlhome_2_1_1_1 = new JPanel();
		pnlhome_2_1_1_1.setLayout(null);
		pnlhome_2_1_1_1.setForeground(new Color(0, 0, 128));
		pnlhome_2_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250)));
		pnlhome_2_1_1_1.setBackground(new Color(0, 0, 128));
		pnlhome_2_1_1_1.setBounds(0, 427, 122, 79);
		panel.add(pnlhome_2_1_1_1);
		
		JLabel lblBack = new JLabel("Back\r\n\r\n");
		lblBack.setBounds(10, 11, 112, 57);
		pnlhome_2_1_1_1.add(lblBack);
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				pnlhome_2_1_1_1.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,128);
				pnlhome_2_1_1_1.setBackground(clr);
			}
		});
		lblBack.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\left-arrow.png"));
		lblBack.setForeground(new Color(245, 255, 250));
		lblBack.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		
		JPanel pnlhome_2_1_1_1_1 = new JPanel();
		pnlhome_2_1_1_1_1.setLayout(null);
		pnlhome_2_1_1_1_1.setForeground(new Color(0, 0, 128));
		pnlhome_2_1_1_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250), new Color(255, 250, 250)));
		pnlhome_2_1_1_1_1.setBackground(new Color(0, 0, 128));
		pnlhome_2_1_1_1_1.setBounds(126, 424, 138, 98);
		panel.add(pnlhome_2_1_1_1_1);
		
		JLabel lblLogout = new JLabel("Logout\r\n\r\n");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,128);
				pnlhome_2_1_1_1_1.setBackground(clr);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,0,51);
				pnlhome_2_1_1_1_1.setBackground(clr);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				loginpage lg=new loginpage();
				lg.show();
				dispose();
			}
		});
		
		lblLogout.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\logout.png"));
		lblLogout.setForeground(new Color(245, 255, 250));
		lblLogout.setFont(new Font("Sitka Heading", Font.PLAIN, 18));
		lblLogout.setBounds(10, 11, 118, 76);
		pnlhome_2_1_1_1_1.add(lblLogout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		panel_1.setBounds(256, 11, 521, 533);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Receipt No:\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(31, 45, 75, 21);
		panel_1.add(lblNewLabel);
		
		JLabel lbl_modepay = new JLabel("Mode of payment:");
		lbl_modepay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_modepay.setBounds(31, 77, 124, 14);
		panel_1.add(lbl_modepay);
		
		JLabel lbl_dd = new JLabel("DD No:");
		lbl_dd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_dd.setBounds(31, 111, 59, 21);
		panel_1.add(lbl_dd);
		lbl_dd.setVisible(false);
		
		JLabel lbl_check = new JLabel("Cheque No :");
		lbl_check.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_check.setBounds(18, 114, 88, 14);
		panel_1.add(lbl_check);
		lbl_check.setVisible(false);
		
		JLabel lbl_bankname = new JLabel("Bank Name :");
		lbl_bankname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_bankname.setBounds(31, 160, 88, 14);
		panel_1.add(lbl_bankname);
		lbl_bankname.setVisible(false);
		
		JLabel lblNewLabel_5 = new JLabel("Date :\r\n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(348, 37, 46, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("GSTIN :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(335, 77, 59, 14);
		panel_1.add(lblNewLabel_6);
		
		txt_receiptno = new JTextField();
		txt_receiptno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_receiptno.setBounds(108, 45, 114, 22);
		panel_1.add(txt_receiptno);
		txt_receiptno.setColumns(10);
		
		txt_dd = new JTextField();
		txt_dd.setBounds(108, 113, 114, 22);
		panel_1.add(txt_dd);
		txt_dd.setColumns(10);
		txt_dd.setVisible(false);
		
		txt_checkno = new JTextField();
		txt_checkno.setBounds(111, 113, 114, 22);
		panel_1.add(txt_checkno);
		txt_checkno.setColumns(10);
		txt_checkno.setVisible(false);
		
		JComboBox combo = new JComboBox();
		
		
		
		
			
		combo.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				if(combo.getSelectedIndex()==0) {
					 lbl_dd.setVisible(true);
					 txt_dd.setVisible(true);
					 lbl_bankname.setVisible(true);
					 txt_bankname.setVisible(true);
					 lbl_check.setVisible(false);
					 txt_checkno.setVisible(false);
				}
				if(combo.getSelectedIndex()==1) {
					lbl_dd.setVisible(false);
					 txt_dd.setVisible(false);
					 lbl_bankname.setVisible(true);
					 txt_bankname.setVisible(true);
					 lbl_check.setVisible(true);
					 txt_checkno.setVisible(true);
						
				}
				if(combo.getSelectedIndex()==2) {
					lbl_dd.setVisible(false);
					 txt_dd.setVisible(false);
					 lbl_bankname.setVisible(false);
					 lbl_bankname.setVisible(false);
					 lbl_check.setVisible(false);
					 txt_checkno.setVisible(false);
					 
						
				}
				if(combo.getSelectedIndex()==3) {
					lbl_dd.setVisible(false);
					 txt_dd.setVisible(false);
					 lbl_bankname.setVisible(false);
					 txt_bankname.setVisible(false);
					 lbl_check.setVisible(false);
					 txt_checkno.setVisible(false);
						
				}
			}
		});
		combo.setModel(new DefaultComboBoxModel(new String[] {"DD", "Cheque", "Cash", "Card"}));
		combo.setSelectedIndex(2);
		combo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		combo.setBounds(165, 73, 88, 22);
		panel_1.add(combo);
		
		JDateChooser txt_date = new JDateChooser();
		txt_date.getCalendarButton().setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_date.setBounds(393, 37, 106, 20);
		panel_1.add(txt_date);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 255));
		panel_2.setBounds(10, 201, 511, 332);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("Receved From :");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1.setBounds(23, 11, 105, 14);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("The following Payment in the collage office for the year");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_2.setBounds(23, 41, 266, 14);
		panel_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("to");
		lblNewLabel_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4_2_1.setBounds(344, 41, 18, 14);
		panel_2.add(lblNewLabel_4_2_1);
		
		year = new JTextField();
		year.setFont(new Font("Tahoma", Font.PLAIN, 11));
		year.setColumns(10);
		year.setBounds(291, 38, 43, 22);
		panel_2.add(year);
		
		todate = new JTextField();
		todate.setColumns(10);
		todate.setBounds(372, 38, 50, 22);
		panel_2.add(todate);
		
		JLabel lblNewLabel_4_3 = new JLabel("Course :");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_3.setBounds(23, 66, 59, 14);
		panel_2.add(lblNewLabel_4_3);
		
		JComboBox cource = new JComboBox();		
		//comboBox_1.addItem(name);
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usersingup","root","root");
		String sql="select * from Addcourse;";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()){
			
				String name=rs.getString(2);
				cource.addItem(name);
			
			
			}
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}

		
		
		cource.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		
		});
		cource.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cource.setBounds(81, 64, 170, 22);
		panel_2.add(cource);
		
		JLabel lblNewLabel_7 = new JLabel("Roll No :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(301, 66, 61, 14);
		panel_2.add(lblNewLabel_7);
		
		txt_rolno = new JTextField();
		txt_rolno.setColumns(10);
		txt_rolno.setBounds(354, 66, 135, 22);
		panel_2.add(txt_rolno);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 115, 501, 22);
		panel_2.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 137, 501, 22);
		panel_2.add(separator_1);
		
		JLabel lblNewLabel_4_4 = new JLabel("Serial NO :");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_4.setBounds(10, 115, 72, 22);
		panel_2.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Head :");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_5.setBounds(181, 115, 50, 22);
		panel_2.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Amount :");
		lblNewLabel_4_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_6.setBounds(375, 115, 66, 22);
		panel_2.add(lblNewLabel_4_6);
		
		txt_head = new JTextField();
		txt_head.setColumns(10);
		txt_head.setBounds(119, 148, 170, 22);
		panel_2.add(txt_head);
		
		txt_amount = new JTextField();
		

		
		
			
		
		txt_amount.addKeyListener(new KeyAdapter() {
			String one[] = { "", "one ", "two ", "three ", "four ",  "five ", "six ", "seven ", "eight ",  "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ",  "sixteen ", "seventeen ", "eighteen ", 
            "nineteen " }; 



	String ten[] = { "", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety " }; 
	  
	String numToWords( int n,String S) 
	 { 
		 String str = ""; 

		 if (n> 19) { 
			 str += ten[n/ 10] + one[n% 10]; 
		 } 
		 else { 
			 str += one[n]; 
		 } 


		if (n != 0) { 
			 str += S; 
		 } 

		 return str; 
		 
	 } 
	    String cWords(long n) 
	    { 
	        
	        String out = ""; 
	  
	        
	     
	  
	     
	        out += numToWords((int)((n / 1000) % 100), "thousand "); 
	  
	       
	        out += numToWords((int)((n / 100) % 10), "hundred "); 
	  
	        if (n > 100 && n % 100 > 0) { 
	            out += " "; 
	        } 
	  
	     
	        out += numToWords((int)(n % 100), ""); 
	  
	        return out; 
	    }
			@Override
			public void keyReleased(KeyEvent e) {
				String p=txt_amount.getText();
				long c= Integer.parseInt(p);
				
				 double cgst=c*9/100;
				 s=Double.toString(cgst);
				txt_cgst.setText(s);
				txt_sgst.setText(s);
				double str1 = Double.parseDouble(s);
				double st=str1+str1+c ;
				 re=Double.toString(st);
				long l = (new Double(st)).longValue();
			 
				txt_total.setText(re);
				txt_two.setText(cWords( l) );
			}
		});
	
		txt_amount.setColumns(10);
		txt_amount.setBounds(354, 148, 147, 22);
		panel_2.add(txt_amount);
		
		
		txt_cgst = new JTextField();
		txt_cgst.setColumns(10);
		txt_cgst.setBounds(354, 181, 147, 22);
		panel_2.add(txt_cgst);
		
		txt_sgst = new JTextField();
		txt_sgst.setColumns(10);
		txt_sgst.setBounds(354, 214, 147, 22);
		panel_2.add(txt_sgst);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(344, 242, 167, 14);
		panel_2.add(separator_2);
		
		txt_total = new JTextField();
		txt_total.setColumns(10);
		txt_total.setBounds(354, 247, 147, 22);
		panel_2.add(txt_total);
		
		JLabel lblNewLabel_5_1 = new JLabel("CGST 9% \r\n");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_1.setBounds(119, 181, 72, 14);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("SGST 9%\r\n");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_2.setBounds(130, 214, 72, 18);
		panel_2.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Total in word :");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4_1_1.setBounds(0, 250, 94, 14);
		panel_2.add(lblNewLabel_4_1_1);
		
		txt_two = new JTextField();
		txt_two.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txt_two.setColumns(10);
		txt_two.setBounds(98, 248, 191, 22);
		panel_2.add(txt_two);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(331, 280, 170, 22);
		panel_2.add(separator_2_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Receiver Signature");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1_1_1.setBounds(364, 288, 125, 14);
		panel_2.add(lblNewLabel_4_1_1_1);
		
		JButton btn_print = new JButton("Print");
		btn_print.addActionListener(new ActionListener() {
			boolean validation(){
				//String Receptnumber,Rollnumber,matheods,y,yto,head,bankname,studant,cgst,sgst,TotalAmaunt,inWord,DDname,amaunt
				
				Receptnumber=txt_receiptno.getText();
				Rollnumber=txt_rolno.getText();
				matheods=combo.getSelectedItem().toString();
				y=year.getText();
				yto=todate.getText();
				bankname=txt_bankname.getText();
				studant=txt_studantname.getText();
				cgst=s;
				sgst=s;
				TotalAmaunt=re;
				DDname=txt_dd.getText();
				inWord=txt_two.getText();
				amaunt=txt_amount.getText();
				head=txt_head.getText();
				date=txt_date.getDate();
				if(Receptnumber.equals("")) {
					JOptionPane.showMessageDialog(txt_receiptno, "pleas enter user recept number");
					return false;
				}
				if(Rollnumber.equals("")) {
					JOptionPane.showMessageDialog(txt_rolno, "please enter Roll number");
					return false;
				}
				if(y.equals("")) {
					JOptionPane.showMessageDialog(year, "please enter yera");
					return false;
				}
				if(yto.equals("")) {
					JOptionPane.showMessageDialog(todate, "please enter year");
					return false;
				}
				
				if(studant.equals("")) {
					JOptionPane.showMessageDialog(txt_studantname, "PLEASE enter studant name ");
					return false;
				}
				if(cgst.equals("")) {
					JOptionPane.showMessageDialog(txt_cgst, "please ente cgst");
					return false;
				}
				if(sgst.equals("")) {
					JOptionPane.showMessageDialog(txt_sgst, "please enter sgst");
					return false;
				}
				if(TotalAmaunt.equals("")) {
					JOptionPane.showMessageDialog(txt_total, "please enter total Amount");
					return false;
				}
			
				
				if(amaunt.equals("")) {
					JOptionPane.showMessageDialog(txt_amount, "please enter the date of barth");
					return false;
				}
				if(head.equals("")) {
					JOptionPane.showMessageDialog(txt_head, "please enter the date of barth");
					return false;
				}
				
				return true; 
				
				
				
				
			}
			public void actionPerformed(ActionEvent e) {
				validation();
				 Addfeedata();
			}
			void Addfeedata() {
			
			
				DateFormat formate=new SimpleDateFormat("yyyy-mm-dd");
				String	Date=formate.format(date);
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usersingup","root","root");
					String sql="insert into AddfeeData values('"+Receptnumber+"','"+Date+"' ,'"+matheods+"','"+Rollnumber+"','"+y+"','"+yto+"','"+studant+"','"+cgst+"','"+sgst+"','"+amaunt+"','"+TotalAmaunt+"','"+inWord+"','"+head+"');";
					Statement stmt=con.createStatement();
					int i=stmt.executeUpdate(sql);
					if(i>0) 
					{
						JOptionPane.showMessageDialog(btn_print,  "record inserted");
						
					}
					else 
					{
						JOptionPane.showMessageDialog(btn_print, "recard not inserted");
					}	
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}	
				
				
				
			
		});
		btn_print.addMouseListener(new MouseAdapter() {

			
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				
				
				PrinterJob jb=PrinterJob.getPrinterJob();
				if(jb.printDialog()) {
					try{
							jb.print();
					}
					catch (PrinterException exc) {
						  System.out.println(exc);
						
					}
				}	
					
				
				
			}	
			
	
		});
		btn_print.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_print.setBounds(10, 298, 89, 23);
		panel_2.add(btn_print);
		
		txt_studantname = new JTextField();
		txt_studantname.setColumns(10);
		txt_studantname.setBounds(130, 10, 176, 22);
		panel_2.add(txt_studantname);
		
		txt_bankname = new JTextField();
		txt_bankname.setColumns(10);
		txt_bankname.setBounds(123, 159, 135, 22);
		panel_1.add(txt_bankname);
		txt_bankname.setVisible(false);
	}	
}



