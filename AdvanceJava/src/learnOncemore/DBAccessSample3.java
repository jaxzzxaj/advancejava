package learnOncemore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBAccessSample3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("名前を入力してください");
		String inputName = s.next();
//		driveStatmentで準備中
		String url = "jdbc:mysql://localhost/advancedb";
		String user ="root";
		String password ="";
//		三つの鍵を使ってConnectionで接続
		try(Connection con = DriverManager.getConnection(url,user,password);
//		SQL文でDBないのデータを指定		
				PreparedStatement pstmt =con.prepareStatement
						("SELECT name, age FROM trainee WHERE name =?")){
//		DBないに新しく標準入力したものを（キー：１、入力した文字列）を入れる	
			pstmt.setString(1,inputName);
//		返ってきたデータを格納して送る
			ResultSet rs = pstmt.executeQuery();
//		もしPrepareStatementに（ｐｓｔｍｔ→ｒｓ）カラムが追加されたら。。
			if(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("名前："+ name + "年齢：" + age);
//		追加されなかったら。。。
			}else {
				System.out.println("社員証を見つかりませんでした");
			}
//		ＳＱＬないにエラーが起きたら下のをcatchしてエラーを送って
		}catch(SQLException e) {
			System.out.println("last");
		e.printStackTrace();
			System.out.println("last-end");
		}
		s.close();
	}
}
