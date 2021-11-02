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
		frmMyApp.getContentPane().setBackground(Color.BLACK);
		frmMyApp.getContentPane().setForeground(Color.PINK);
		frmMyApp.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sritika manjrekar\\Desktop\\first responder material\\First Reponder - Copy.png"));
		frmMyApp.setTitle("My App");
		frmMyApp.setBounds(100, 100, 904, 627);
		frmMyApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyApp.getContentPane().setLayout(null);
		
		tf = new JTextField();
		tf.setToolTipText("Enter your email address");
		tf.setBounds(308, 131, 221, 47);
		frmMyApp.getContentPane().add(tf);
		tf.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel.setBounds(308, 95, 117, 26);
		frmMyApp.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblPassword.setBounds(308, 188, 117, 26);
		frmMyApp.getContentPane().add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
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
						StudentManagement frame=new StudentManagement();
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
		btnNewButton.setBackground(new Color(0, 191, 255));
		btnNewButton.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		btnNewButton.setBounds(365, 311, 104, 47);
		frmMyApp.getContentPane().add(btnNewButton);
		
		
		tf1 = new JPasswordField();
		tf1.setText("");
		tf1.setBounds(308, 224, 221, 52);
		frmMyApp.getContentPane().add(tf1);
	}
}
