package daopractice;

import java.util.List;

public class DBAccessMultiSample5 {

	public static void main(String[] args) {
//インスタンスを生成（別のクラスをよぶ）
		TraDaoMulti dao = new TraDaoMulti();
//	TraDaoMultiのcoldがnull状態なので追加する
		int cold =3; //①
		
//追加した値を指定（指さす）		
		List<Trainee> list = dao.searchByCold(cold);//②クラスTraDaoの中に入れる
//	もしLISTに中身があるとき下の処理をしてください
		if(!list.isEmpty()) {
//	リストの個数までが条件。i++
		for(int i = 0; i < list.size(); i++) {
//	Traineeクラスの（IMPORT済み）変数traineeにLISTのgetを取得してください。
			Trainee trainee = list.get(i);
			System.out.println("ID:"+trainee.getId()+"名前"+trainee.getName()+"年齢"+trainee.getAge()+"性別"+trainee.getSex());
		}
		}else {
			System.out.println("研修生は見つかりません");
		}
		
		

	}

}
