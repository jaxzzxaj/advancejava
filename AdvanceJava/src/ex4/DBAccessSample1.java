package ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBAccessSample1 {
//	throws SQLExceptionを追加
//	データベース内で例外が発生したときにスローされる！
	public static void main(String[] args)throws SQLException {
//		DriverManager準備
		String url ="jdbc:mysql://localhost/world";
		String user = "root";
		String password ="";
//		DBへの接続
		Connection con = DriverManager.getConnection(url,user,password);
//		DBにSQL文章を送信
		PreparedStatement pstmt = con.prepareStatement
				("SELECT Name,Population FROM city WHERE CountryCode = \"JPN\"");
		ResultSet rs = pstmt.executeQuery();
//		検索結果が返ってくる
		while(rs.next()) {
			String name= rs.getString("Name");
			int population = rs.getInt("Population");
			System.out.println("名前"+ name + "人口"+ population);	
		
		}
//		コネクション（接続）を破棄
		pstmt.close();
		con.close();
	}

}
