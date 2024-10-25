package startallover;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoDrawer {
	private static final String url = "jdbc:mysql://localhost/test";
	private static final String user = "root";
	private static final String password = "";

	//	クラス名：drawerを指定してる
	public drawer searchById(int id) {
		drawer drawer = null;

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = con.prepareStatement("SELECT id,brand,sex,shoe FROM drawer WHERE id = ?");
			pstmt.setInt(1, id);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				drawer = new drawer();
				drawer.setId(rs.getInt("id"));
				drawer.setBrand(rs.getString("brand"));
				drawer.setSex(rs.getString("sex"));
				drawer.setShoe(rs.getString("shoe"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return drawer;
	}
}
