package ouyoutest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Testnum8 {

	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		
		String sql ="SELECT id,product,price FROM"
				+	" product ORDER BY price ASC";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rs =pstmt.executeQuery();
		
		if(rs.next()) {
		System.out.println(rs.getString("product"));
		}
		
		con.close();
		pstmt.close();
	}

}
