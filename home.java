
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
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
	public home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 153));
		panel.setBounds(0, 0, 779, 86);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jaipur National University jaipur");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\jnu-logo-final.jpg"));
		lblNewLabel.setBounds(164, 11, 416, 63);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("A venture of the seedling group of Educational institutiosion");
		lblNewLabel_2.setBounds(270, 61, 369, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.GREEN);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(0, 83, 779, 447);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2_1.setBackground(new Color(0, 0, 51));
		panel_2_1.setBounds(252, 11, 250, 147);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Search Record");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				panel_2_1.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,51);
				panel_2_1.setBackground(clr);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				SearchRecard sr=new SearchRecard();
				sr.show();
				dispose();
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\search-document.png"));
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(0, 11, 247, 133);
		panel_2_1.add(lblNewLabel_1_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2_2.setBackground(new Color(0, 0, 51));
		panel_2_2.setBounds(512, 11, 257, 127);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("View Record");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				panel_2_2.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,51);
				panel_2_2.setBackground(clr);
			}
		});
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\text-book-opened-from-top-view.png"));
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(10, 11, 237, 105);
		panel_2_2.add(lblNewLabel_1_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2_3.setBackground(new Color(0, 0, 51));
		panel_2_3.setBounds(270, 187, 222, 155);
		panel_1.add(panel_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("View Course");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				panel_2_3.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,51);
				panel_2_3.setBackground(clr);
			}
		});
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\view all record.png"));
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3.setBounds(10, 11, 206, 133);
		panel_2_3.add(lblNewLabel_1_3);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2_4.setBackground(new Color(0, 0, 51));
		panel_2_4.setBounds(519, 187, 250, 155);
		panel_1.add(panel_2_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Edit Course\r\n");
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				panel_2_4.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,51);
				panel_2_4.setBackground(clr);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Editcourse ec=new Editcourse();
				ec.show();
				dispose();
			}
		});
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\edit.png"));
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_4.setBounds(10, 11, 230, 133);
		panel_2_4.add(lblNewLabel_1_4);
		
		JPanel panel_2_5 = new JPanel();
		panel_2_5.setLayout(null);
		panel_2_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2_5.setBackground(new Color(0, 0, 51));
		panel_2_5.setBounds(10, 187, 250, 155);
		panel_1.add(panel_2_5);
		
		JLabel lblNewLabel_1_5 = new JLabel("View Report");
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				panel_2_5.setBackground(clr);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,51);
				panel_2_5.setBackground(clr);
			}
		});
		lblNewLabel_1_5.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\view report.png"));
		lblNewLabel_1_5.setForeground(Color.WHITE);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_5.setBounds(10, 11, 230, 133);
		panel_2_5.add(lblNewLabel_1_5);
		
		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBounds(10, 353, 150, 89);
		panel_1.add(panel_2_6);
		panel_2_6.setLayout(null);
		panel_2_6.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2_6.setBackground(new Color(0, 0, 51));
		
		JLabel lblNewLabel_1_6 = new JLabel("Logout\r\n");
		lblNewLabel_1_6.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\logout.png"));
		lblNewLabel_1_6.setBounds(10, 11, 130, 67);
		panel_2_6.add(lblNewLabel_1_6);
		lblNewLabel_1_6.setForeground(Color.WHITE);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2.setBackground(new Color(0, 0, 51));
		panel_2.setBounds(10, 11, 222, 155);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Add Fees");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Color clr=new Color(0,51,51);
				panel_2.setBackground(clr);
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Color clr=new Color(0,0,51);
				panel_2.setBackground(clr);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Add_Fees addfees=new Add_Fees();
				addfees.show();
				dispose();
				
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\plus.png"));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 11, 206, 133);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_2_6_1 = new JPanel();
		panel_2_6_1.setLayout(null);
		panel_2_6_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(0, 153, 0), new Color(0, 0, 51), new Color(255, 255, 255)));
		panel_2_6_1.setBackground(new Color(0, 0, 51));
		panel_2_6_1.setBounds(619, 353, 150, 89);
		panel_1.add(panel_2_6_1);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("About\r\n");
		lblNewLabel_1_6_1.setIcon(new ImageIcon("C:\\Users\\ajayr\\Downloads\\my icons\\my icons\\about.png"));
		lblNewLabel_1_6_1.setForeground(Color.WHITE);
		lblNewLabel_1_6_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_6_1.setBounds(10, 11, 130, 67);
		panel_2_6_1.add(lblNewLabel_1_6_1);
	}
}
