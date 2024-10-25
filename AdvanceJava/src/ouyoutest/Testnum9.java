package ouyoutest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testnum9 {

	public static void main(String[] args) throws SQLException{
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
		
		String sql ="UPDATE product SET price = 200"
					+ " WHERE id = 001";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		int result =pstmt.executeUpdate();
		
		System.out.println(result);

		
		con.close();
		pstmt.close();
	}

}
