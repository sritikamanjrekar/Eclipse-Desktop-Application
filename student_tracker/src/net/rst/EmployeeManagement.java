package net.rst;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EtchedBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EmployeeManagement extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTable table;
	Connection conn;
	JRadioButton r1,r2;
	JComboBox comboBox;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeManagement frame = new EmployeeManagement();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	/* Add data in combobox */

	void addItem() throws SQLException {
		String query = "Select * from student";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			comboBox.addItem(rs.getString("name"));
		}
		
	}
	
	/* Creating Method of Gender */
	
		String getGender() {
			
			if(r1.isSelected())
				return "M";
			else if(r2.isSelected())
				return "F";
			else
				return "N";
		}
		
		/* Show Data Automatically when get Deleted */
		public void getLoad() {
			String s = "SELECT * from student";
			
			try {
				Statement smt = conn.createStatement();		// Creating Statement
				ResultSet rs = smt.executeQuery(s);				//Executing Query And storing into resultset
				table.setModel(DbUtils.resultSetToTableModel(rs));	// Setting Data in to Table Model
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	
	/**
	 * Create the frame.
	 */
	public EmployeeManagement() {
		
		conn = DbConn.getConn();
		
		setTitle("EMPLOYEE MANAGMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setForeground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String query = "select * from student where name=?";
				
				
					try {
						PreparedStatement ps =conn.prepareStatement(query);
						ps.setString(1, String.valueOf(comboBox.getSelectedItem()));
						ResultSet rs=ps.executeQuery();
						
						if(rs.next()) {
							tf1.setText(rs.getString("name"));
							tf2.setText(rs.getString("company"));
							tf3.setText(rs.getString("id"));
							tf4.setText(rs.getString("dept"));
							tf5.setText(rs.getString("salary"));
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
				
			}
		});
		comboBox.setBounds(183, 52, 425, 53);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(101, 188, 123, 29);
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblCompany = new JLabel("Company");
		lblCompany.setBounds(101, 253, 123, 29);
		lblCompany.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(lblCompany);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(101, 315, 123, 29);
		lblId.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(lblId);
		
		JLabel lblSalary = new JLabel("Salary");
		lblSalary.setBounds(101, 429, 123, 29);
		lblSalary.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(lblSalary);
		
		JLabel lblDepartment = new JLabel("Department");
		lblDepartment.setBounds(101, 369, 123, 29);
		lblDepartment.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(lblDepartment);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(101, 498, 123, 29);
		lblGender.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(lblGender);
		
		tf1 = new JTextField();
		tf1.setBounds(292, 184, 329, 41);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setBounds(292, 249, 329, 41);
		tf2.setColumns(10);
		contentPane.add(tf2);
		
		tf3 = new JTextField();
		tf3.setBounds(292, 311, 329, 44);
		tf3.setColumns(10);
		contentPane.add(tf3);
		
		tf4 = new JTextField();
		tf4.setBounds(292, 365, 329, 41);
		tf4.setColumns(10);
		contentPane.add(tf4);
		
		tf5 = new JTextField();
		tf5.setBounds(292, 425, 329, 41);
		tf5.setColumns(10);
		contentPane.add(tf5);
		
		r1 = new JRadioButton("Male");
		r1.setBounds(337, 492, 111, 41);
		r1.setBackground(new Color(216, 191, 216));
		r1.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setBounds(480, 492, 111, 41);
		r2.setBackground(new Color(216, 191, 216));
		r2.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(r2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		tf6 = new JTextField();
		tf6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String q = "SELECT * from student where name = ? or id = ? or company = ?";
				
				try {
					PreparedStatement ps = conn.prepareStatement(q);
					ps.setString(1, tf6.getText());
					ps.setString(2, tf6.getText());
					ps.setInt(3,Integer.parseInt(tf6.getText()));
					ResultSet rs = ps.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		tf6.setBounds(751, 52, 558, 53);
		contentPane.add(tf6);
		tf6.setColumns(10);
		
		JButton btnNewButton = new JButton("INSERT");
		btnNewButton.setBounds(137, 595, 138, 41);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						/* Insert Query */
				String Query = "INSERT into student values(?,?,?,?,?,?)";
				
				try {
					PreparedStatement ps = conn.prepareStatement(Query); //Preapring Statement
					ps.setString(1, tf1.getText());
					ps.setString(2, tf2.getText());
					ps.setInt(3, Integer.parseInt(tf3.getText()));
					ps.setString(4, tf4.getText());
					ps.setInt(5, Integer.parseInt(tf5.getText()));
					ps.setString(6, getGender());			//Calling Gender Method
					ps.execute();
					getLoad();
					
					JOptionPane.showMessageDialog(null, "Data Inserted Sucessfully"); //popup Message
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Data Insert Fail");
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(btnNewButton);
		
		JButton btnLoad = new JButton("LOAD");
		btnLoad.setBounds(310, 595, 138, 41);
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
							/* Load Query*/
				String s = "SELECT * from student";
				
				try {
					Statement smt = conn.createStatement();		// Creating Statement
					ResultSet rs = smt.executeQuery(s);				//Executing Query And storing into resultset
					table.setModel(DbUtils.resultSetToTableModel(rs));		// Setting Data in to Table Model
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnLoad.setBackground(Color.YELLOW);
		btnLoad.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(btnLoad);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.setBounds(480, 595, 138, 41);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							/* Upadte Query */
				String Query = "UPDATE student set name = ?, company = ?, id = ?, dept = ?, salary = ?, gender = ? where id = ? ";
				
				try {
					PreparedStatement ps = conn.prepareStatement(Query);
					ps.setString(1, tf1.getText());
					ps.setString(2, tf2.getText());
					ps.setInt(3, Integer.parseInt(tf3.getText()));
					ps.setString(4, tf4.getText());
					ps.setInt(5, Integer.parseInt(tf5.getText()));
					ps.setString(6, getGender());
					ps.setInt(7, Integer.parseInt(tf3.getText()));
					
					ps.execute();
					getLoad();
					JOptionPane.showMessageDialog(null, "Data Updated Sucessfully");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Data Update Fail");
					e1.printStackTrace();
				}
				
				
			}
		});
		btnUpdate.setBackground(Color.YELLOW);
		btnUpdate.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setBounds(222, 661, 138, 41);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s = "DELETE from student where id = ?";
				
				try {
					PreparedStatement ps = conn.prepareStatement(s);
					
					ps.setInt(1, Integer.parseInt(tf3.getText()));
					
					ps.execute();
					getLoad();
					
					JOptionPane.showMessageDialog(null, "Data Deleted Sucessfully");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Data Delete Fail");
					e1.printStackTrace();
				}
						
				
			}
		});
		btnDelete.setBackground(Color.YELLOW);
		btnDelete.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(btnDelete);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBounds(411, 661, 138, 41);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(table.print()) {
						JOptionPane.showConfirmDialog(null, "Printing Sucessfull","Employee Managment Sysytem", JOptionPane.INFORMATION_MESSAGE);
					}else
						JOptionPane.showConfirmDialog(null, "Printing Failed","Employee Managment Sysytem", JOptionPane.ERROR_MESSAGE);
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				}
				
				
			}
		});
		btnPrint.setBackground(Color.YELLOW);
		btnPrint.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(btnPrint);
		
		table = new JTable();
		table.setBounds(751, 188, 558, 424);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		contentPane.add(table);
		
		JButton btnShutdown = new JButton("SHUTDOWN");
		btnShutdown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Runtime.getRuntime().exec("shutdown -s -t 300");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnShutdown.setBounds(994, 661, 188, 41);
		btnShutdown.setBackground(Color.YELLOW);
		btnShutdown.setFont(new Font("Calibri", Font.BOLD, 20));
		contentPane.add(btnShutdown);
		
		JPanel panel = new JPanel();
		panel.setBounds(751, 161, 558, 22);
		contentPane.add(panel);
		panel.setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(0, 0, 558, 22);
		panel.add(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Company", "Id", "Department", "Salary", "Gender"},
			},
			new String[] {
				"Name", "Company", "Id", "Department", "Salary", "Gender"
			}
		));
		table_1.getColumnModel().getColumn(0).setMinWidth(75);
		
		try {
			addItem();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}