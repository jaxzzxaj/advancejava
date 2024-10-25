package learnOncemore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class trycatchfinally {
	public static void main(String [] args){
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String url ="jdbc:mysql://localhost/advancedb";
			String user = "root";
			String password = "";
			con = DriverManager.getConnection(url,user,password);
			pstmt = con.prepareStatement("SELECT name FROM trainee");
			ResultSet rs =pstmt.executeQuery();
			
			while(rs.next()){
//		ResultStatementに下のを実行したら、、、もしできない場合catchまで。
				String name = rs.getString("name");
				System.out.println("名前"+name);
//		もしSQLとJAVA間にエラーが発生したら下をcatchして表示してください。
			}}catch(SQLException e) {
				System.out.println("first");
				e.printStackTrace();
				System.out.println("first-end");
//		PreparedStatementが閉じていなければ閉じてください、もしできない場合catchまで
			}finally {
				try {
					if(pstmt !=null) {
						System.out.println("second");
						pstmt.close();
						System.out.println("second-end");
					}
//					
				}catch(SQLException e ) {
					System.out.println("last");
					e.printStackTrace();
				}
			}
			
			
		
		}
	}
