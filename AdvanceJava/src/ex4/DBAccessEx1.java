package ex4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DBAccessEx1 {
	public static void main(String [] args)throws SQLException{
//		DM
		String url = "jdbc:mysql://localhost/advancedb";
		String user = "root";
		String password = "";
		
//		CON
		Connection con = DriverManager.getConnection(url,user,password);
		
//		PRE
		PreparedStatement pstmt = con.prepareStatement
				("SELECT ID,name,age FROM trainee WHERE ID<=3 ORDER BY ID");
//		RS
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			System.out.println("ID"+id+"名前："+ name+"年齢："+age);
			
//			pstmt.close();
//			con.close();
			}
		
		}
	}

