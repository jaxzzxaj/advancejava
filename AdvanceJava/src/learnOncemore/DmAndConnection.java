package learnOncemore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DmAndConnection {
	public static void main(String [] args) throws SQLException{
//		データベースの場所、user=root権限者/管理者、パスワードの宣言
		String url ="jdbc:mysql://localhost/world";
		String user ="root";
		String password ="";
//		さきほど準備した鍵たちを使って接続する
		Connection con = DriverManager.getConnection(url,user,password);
//		DBに理解できる文章（SQL文）を使って取得したいものを投げかける
		PreparedStatement pstmt = con.prepareStatement
				("SELECT Name,CountryCode FROM city WHERE CountryCode = \"JPN\"");
//	結果表をresultSetで返すように設定
		ResultSet rs =pstmt.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString("name");
			System.out.println("JPNを含む都市名は"+name);
		}
//		コネクションを破棄
//		conが切られた場合でも、preは閉じるが、大きいデータベースを使用するときにあきっぱしなると
//		別の開発者があきっぱの状態で続きをする。？
		pstmt.close();
		con.close();
	}
}
