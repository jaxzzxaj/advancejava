//package ex4;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//
//
//public class DBAccessEx2 {
//	public static void main(String[] args) {
////	DM
//	String url ="jdbc:mysql://localhost/advancedb";
//	String user ="root";
//	String password ="";
//	String chose ="SELECT id,name,age,unit.unit_name " +
//					"FROM trainee JOIN unit "+
//					"ON trainee.unit_id = unit.unit_id WHERE id =7";
//	
////	CON
//	try(Connection con = DriverManager.getConnection(url, user, password);
////	PRE
//			PreparedStatement pstmt = con.prepareStatement
//					("SELECT id,name,age,unit.unit_name " +
//							"FROM trainee JOIN unit "+
//							"ON trainee.unit_id = unit.unit_id WHERE id =7"));
////	RS		
//			ResultSet rs = executeQuery();
//			if(rs.next()){
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				int age =rs.getInt("age");
//				String unitname = rs.getString("unit_name");
//				System.out.println("ID:"+ id+ "名前:"+ name +"年齢:"+ age + "単元"+ unit_name);
//			}
//
//	}
//}