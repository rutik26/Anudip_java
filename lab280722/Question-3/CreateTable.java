package ddl_ops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String qry = " CREATE TABLE student ( sID int,FName varchar(255),State varchar(255),City varchar(255))";
		
		Connection con=null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			System.out.println("Driver loaded ");
			
			con=DriverManager.getConnection(url,"root","password");
			System.out.println("Connection established");
			
			stmt = con.createStatement();
			System.out.println("Platform created ");
			
			stmt.execute(qry);
			System.out.println("Query executed succesfully ");
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
