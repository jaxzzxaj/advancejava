package daopractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TraDaoMulti {
//	DM
	private static final String url = "jdbc:mysql://localhost/advancedb";
	private static final String user = "root";
	private static final String password = "";
//TraineeテーブルのCOLDを探してください、そのあとtrianeeの箱の中へ）
	public List <Trainee> searchByCold(int cold) {//この中に入れる
			List<Trainee> list = new ArrayList<>();
		
		try {
//	鍵を持って接続
			Connection con = DriverManager.getConnection(url, user, password);
//	SQL文を送る、IDは？状態＝多分呼び起こすときにidを取得する設定を追加		
			PreparedStatement pstmt = con.prepareStatement("SELECT id,name,age,sex FROM trainee WHERE co_id =?");
			pstmt.setInt(1, cold);
//	DBで回収したデータをｒｓに格納
			ResultSet rs = pstmt.executeQuery();
//	もし格納した中身に、id,name,age,sexがあったらgetしてsetせよ
			while (rs.next()) {
//	Traineeという型に新しく変数（箱）を作って新しいインスタンスを生成
//	★trainee = new Trainee();の場合は変数を初期化している。
//				ここ
				Trainee trainee = new Trainee();
				trainee.setId(rs.getInt("id"));
				trainee.setName(rs.getString("name"));
				trainee.setAge(rs.getInt("age"));
				trainee.setSex(rs.getString("sex"));
//	複数の場合
				list.add(trainee);
			}
//	ＳＱＬ内でエラーが起きた時ＳＱＬＥｘｅｃｅｐｔｉｏｎをcatchしてthrow
		} catch (SQLException e) {
			e.printStackTrace();
		}
//	１8行目のlistに戻り値
		return list;
	}
}
