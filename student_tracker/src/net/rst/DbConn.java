package net.rst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DbConn {
	
	static Connection getConn() {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String pass="root";
		
		try {
			Connection conn=DriverManager.getConnection(url,user,pass);
			JOptionPane.showMessageDialog(null, "Connection Established");
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Connection Failed");
			e.printStackTrace();
			return null;
		}
		
		
	}

}
