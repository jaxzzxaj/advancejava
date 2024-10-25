package learnOncemore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteSample {

	public static void main(String[] args)throws SQLException{
//		DM
		String url = "jdbc:mysql://localhost/advancedb";
		String user = "root";
		String password =	"";
		
//		CON
		Connection con = DriverManager.getConnection(url,user,password);
		
//		PS
		PreparedStatement pstmt = con.prepareStatement
				("DELETE FROM trainee WHERE id = 21");
//		RS
		int rows =pstmt.executeUpdate();
		System.out.println(rows + "件のデータを削除しました");
		
		pstmt.close();
		con.close();
		
	

	}

}
