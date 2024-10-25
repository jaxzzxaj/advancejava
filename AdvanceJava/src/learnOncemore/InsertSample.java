package learnOncemore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertSample {

	public static void main(String[] args) throws SQLException{
//		drivesManager(接続準備）
		String url ="jdbc:mysql://localhost/advancedb";
		String user = "root";
		String password = "";

//		Connection（接続するための鍵を回収）
		Connection con = DriverManager.getConnection(url,user,password);
		
//		preparedStatement（DB内でしたいことを指示）
		PreparedStatement pstmt = con.prepareStatement
				("INSERT INTO trainee VALUES(21,'鈴木一郎',23,'男',1,7)");
//		INSERT/UPDATE/DELETEのボタン
		int rows = pstmt.executeUpdate();
		System.out.println(rows + "件のデータを挿入しました。");
		
		pstmt.close();
		con.close();
				
	}

}
