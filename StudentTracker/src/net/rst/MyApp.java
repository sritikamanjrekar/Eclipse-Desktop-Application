package net.rst;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import java.awt.Label;

public class MyApp {

	private JFrame frmMyApp;
	private JTextField tf;
	private JPasswordField tf1;
	
	Connection con;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyApp window = new MyApp();
					window.frmMyApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyApp() {
		initialize();
		con=DbConn.getConn();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyApp = new JFrame();
		frmMyApp.getContentPane().setBackground(new Color(0, 153, 255));
		frmMyApp.getContentPane().setForeground(Color.PINK);
		frmMyApp.setTitle("Login");
		frmMyApp.setBounds(100, 100, 904, 627);
		frmMyApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyApp.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setToolTipText("Enter Your Username");
		tf.setBounds(274, 185, 314, 47);
		frmMyApp.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username ");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Kristen ITC", Font.PLAIN, 25));
		lblNewLabel.setBounds(275, 142, 188, 27);
		frmMyApp.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBackground(Color.BLACK);
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Kristen ITC", Font.PLAIN, 25));
		lblPassword.setBounds(276, 265, 149, 34);
		frmMyApp.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 153, 255));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str="SELECT * FROM login WHERE username=? and password=? ";
				
				try {
					PreparedStatement ps=con.prepareStatement(str);
					ps.setString(1, tf.getText());
					ps.setString(2, String.valueOf(tf1.getPassword()) );
					
					ResultSet rs= ps.executeQuery();
					
					if(rs.next()) {
						EmployeeManagement frame=new EmployeeManagement();
						frame.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Kristen ITC", Font.PLAIN, 30));
		btnNewButton.setBounds(330, 396, 199, 64);
		frmMyApp.getContentPane().add(btnNewButton);
		
		
		tf1 = new JPasswordField();
		tf1.setToolTipText("Enter Your Password");
		tf1.setText("");
		tf1.setBounds(276, 309, 314, 52);
		frmMyApp.getContentPane().add(tf1);
	}

	
}
