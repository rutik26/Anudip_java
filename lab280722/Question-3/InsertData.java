package dml_ops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String insert_qry =" INSERT INTO student (sID, FName, State, City) VALUES (?,?,?,?)";
		
		Connection con=null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		PreparedStatement pstmt4 = null;
		
		try {
			Class.forName(driver);
			System.out.println("Driver loaded ");
			
			con=DriverManager.getConnection(url,"root","password");
			System.out.println("Connection established");
			
			pstmt1 = con.prepareStatement(insert_qry);
			pstmt2 = con.prepareStatement(insert_qry);
			pstmt3 = con.prepareStatement(insert_qry);
			pstmt4 = con.prepareStatement(insert_qry);
			System.out.println("Platform created ");
			
			pstmt1.setInt(1, 401);
			pstmt1.setString(2, "rohit");
			pstmt1.setString(3, "maharashtra");
			pstmt1.setString(4, "mumbai");
			
			
			pstmt2.setInt(1, 501);
			pstmt2.setString(2, "bharat");
			pstmt2.setString(3, "maharashtra");
			pstmt2.setString(4, "mumbai");
			
			
			pstmt3.setInt(1, 601);
			pstmt3.setString(2, "adarsh");
			pstmt3.setString(3, "maharashtra");
			pstmt3.setString(4, "mumbai");
			
			
			pstmt4.setInt(1, 701);
			pstmt4.setString(2, "rajas");
			pstmt4.setString(3, "maharashtra");
			pstmt4.setString(4, "mumbai");
			
			
			
			
			pstmt1.executeUpdate();
			pstmt2.executeUpdate();
			pstmt3.executeUpdate();
			pstmt4.executeUpdate();
			System.out.println("Query executed succesfully ");
			
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}

	}

}
