import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Editcourse extends JFrame {

	
	private JPanel contentPane;
	private JTextField txt_id;
	private JTextField txt_cname;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Editcourse frame = new Editcourse();
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
	String CourseName;
	String id;
	private JTable table;
	protected Vector<?> row;
	
	public Editcourse() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 599);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(240, 248, 255));
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 0, 713, 62);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Course");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel.setForeground(new Color(240, 255, 240));
		lblNewLabel.setBackground(new Color(240, 255, 240));
		lblNewLabel.setBounds(234, 11, 191, 40);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(0, 62, 355, 487);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_id = new JLabel("Course id :");
		lbl_id.setForeground(new Color(245, 245, 245));
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_id.setBounds(10, 110, 76, 39);
		panel_1.add(lbl_id);
		
		txt_id = new JTextField();
		txt_id.setBounds(84, 121, 122, 28);
		panel_1.add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lbl_cname = new JLabel("Course Name :");
		lbl_cname.setForeground(new Color(245, 245, 245));
		lbl_cname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl_cname.setBounds(10, 235, 99, 28);
		panel_1.add(lbl_cname);
		
		txt_cname = new JTextField();
		txt_cname.setBounds(114, 235, 180, 26);
		panel_1.add(txt_cname);
		txt_cname.setColumns(10);
		
		JButton btn_update = new JButton("Update");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				model.setValueAt(txt_id.getText(), i, 0);
				model.setValueAt(txt_cname.getText(), i, 1);
			}
		});
	
	
	
		btn_update.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_update.setForeground(new Color(248, 248, 255));
		btn_update.setBackground(new Color(0, 128, 128));
		btn_update.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\update.png"));
		btn_update.setBounds(119, 308, 118, 39);
		panel_1.add(btn_update);
		
		JButton btn_delete = new JButton("Delete");
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				model.removeRow(i);
				JOptionPane.showMessageDialog(null,  "Deleted successfully ");
			}
		});
		btn_delete.setForeground(new Color(248, 248, 255));
		btn_delete.setBackground(new Color(0, 128, 128));
		btn_delete.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\delete.png"));
		btn_delete.setBounds(247, 310, 108, 39);
		panel_1.add(btn_delete);
		
		JButton btn_add = new JButton("Add");
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object [] column= {"Id","Course Name"};
				 Object [] row=new Object[2];
			
					row [0]=txt_id.getText();
					row[1]=txt_cname.getText();
					JOptionPane.showMessageDialog(null,  "Seved Succesfully ");
					
				 
				
				model.addRow(row);
			
				
				
			}
		});
	
		
		
		btn_add.addMouseListener(new MouseAdapter() {
			void vadi() {
				id=txt_id.getText();
				CourseName=txt_cname.getText();
				if(CourseName.equals("")) {
					JOptionPane.showMessageDialog(null,  "please enter name ");
					
				}
				if(id.equals("")) {
					JOptionPane.showMessageDialog(null,  "please enter id");
					
				
				}
			}
			
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				vadi();
				 insertDetails();
			
			
			}
			void insertDetails() {
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usersingup","root","root");
					String sql="insert into AddCourse values('"+id+"','"+CourseName+"');";
					Statement stmt=con.createStatement();
					int i=stmt.executeUpdate(sql);
					if(i>0) 
					{
						JOptionPane.showMessageDialog(null,  "record inserted");
					
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "recard not inserted");
					}	
					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
			
				
		
		});
		
		
	
		btn_add.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\add2.png"));
		btn_add.setForeground(new Color(245, 255, 250));
		btn_add.setBackground(new Color(0, 128, 128));
		btn_add.setBounds(10, 308, 99, 39);
		panel_1.add(btn_add);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 128, 128));
		panel_2.setBounds(354, 62, 359, 487);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				txt_id.setText(model.getValueAt(i, 0).toString());
				txt_cname.setText(model.getValueAt(i, 1).toString());
			}
		});
		scrollPane.setBounds(34, 100, 303, 360);
		
		panel_2.add(scrollPane);
		
		table = new JTable();
		model=new DefaultTableModel();
		Object [] column= {"Id","Course Name"};
		 Object [] row=new Object[0];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
	}
}
