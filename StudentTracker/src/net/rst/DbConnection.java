package net.rst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DbConnection {
	
	static void getConnection() {
		String url="jdbc:mysql://localhost:3306/mydb";
		String user="root";
		String pass="root";
		
		try {
			Connection conn=DriverManager.getConnection(url,user,pass);

			JOptionPane.showMessageDialog(null, "Connection Established...");
			
			//create statment
			Statement stmt=conn.createStatement();
			
			//execute query
			String q="SELECT * FROM login";
			
			ResultSet rs=stmt.executeQuery(q);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Connection failed...");
			e.printStackTrace(); //trace exception
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getConnection();

	}

}
