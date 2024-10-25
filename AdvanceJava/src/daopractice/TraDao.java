package daopractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TraDao {
//	DM
	private static final String url = "jdbc:mysql://localhost/advancedb";
	private static final String user = "root";
	private static final String password = "";
//TraineeテーブルのIDを探してください、そのあとtrianeeの箱の中へ）
	public Trainee searchByID(int id) {
		Trainee trainee = null;
		
		try {
//	鍵を持って接続
			Connection con = DriverManager.getConnection(url, user, password);
//	SQL文を送る、IDは？状態＝多分呼び起こすときにidを取得する設定を追加		
			PreparedStatement pstmt = con.prepareStatement("SELECT id,name,age,sex FROM trainee WHERE id =?");
			pstmt.setInt(1, id);
//	DBで回収したデータをｒｓに格納
			ResultSet rs = pstmt.executeQuery();
//	もし格納した中身に、id,name,age,sexがあったらgetしてsetせよ
//	★すべての型のtraineeメソッドで未定義↓
			if (rs.next()) {
				trainee = new Trainee();
				trainee.setId(rs.getInt("id"));
				trainee.setName(rs.getString("name"));
				trainee.setAge(rs.getInt("age"));
				trainee.setSex(rs.getString("sex"));
			}
//	ＳＱＬ内でエラーが起きた時ＳＱＬＥｘｅｃｅｐｔｉｏｎをcatchしてthrow
		} catch (SQLException e) {
			e.printStackTrace();
		}
//	１0行目のＴｒａｉｎｅｅに戻り値（あやふや）
		return trainee;
	}
}
