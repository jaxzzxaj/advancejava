package daopractice;

public class DBAccessSample5 {
	public static void main(String [] args) {
//	Daoのインスタンスを生成
		TraDao dao = new TraDao();
//	Daoのクラスはnull状態だからここで追加させる
		int id = 1;
//	先ほどdaoの中に追加したいidを指定
		Trainee trainee = dao.searchByID(id);
		
//		traineeの中が空っぽ出なければしたをしてください
		if(trainee !=null) {
			System.out.println("ID:"+trainee.getId()+"名前"+trainee.getName()+"年齢"+trainee.getAge()+"性別"+trainee.getSex());
		}else {
			System.out.println("研修生は見つかりませんでした");
		}
		
	}
}
