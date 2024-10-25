package startallover;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoDrawermulti {
	//	DM
	private final String url = "jdbc:mysql://localhost/test";
	private final String user = "root";
	private final String password = "";

	//	メソッド（配列）
	public List<drawer> searchByShoe(String shoe) {
		List<drawer> list = new ArrayList<>();

		//	接続とSQL文章
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement("SELECT id,brand,sex,shoe FROM drawer WHERE shoe =?");
//			★
			pstmt.setString(1, shoe);
			//	RS
			ResultSet rs = pstmt.executeQuery();

			//	DBで受け取れる分だけ取得する（while)
			//インスタンスを生成しているものは配列＝配列（紫色のやつ）と同じ小文字にしなければならない	
//			わざわざインスタンスを生成していたのはwhile文で場所の指定をしたいから
			while (rs.next()) {
				drawer drawer = new drawer();
				drawer.setId(rs.getInt("id"));
				drawer.setBrand(rs.getString("brand"));
				drawer.setSex(rs.getString("sex"));
				drawer.setShoe(rs.getString("shoe"));
//				while中に取得した値たちをLISTの中に格納するのわすれないように！
				list.add(drawer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		★を」しているからMAINのほうにReturnしたい
		return list;
	}
}
