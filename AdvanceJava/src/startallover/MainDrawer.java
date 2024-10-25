package startallover;

public class MainDrawer {

	public static void main(String[] args) {
		DaoDrawer a = new DaoDrawer();
		int id = 001;
		
		drawer d = a.searchById(id);
		
		if(d !=null) {
			System.out.println("ID: "+d.getId() +"\n\nブランド名: "+d.getBrand()+"\n性別： "+d.getSex() +"\n靴： "+ d.getShoe());
		}else {
			System.out.println("靴は見つかりませんでした。");
		}
		

	}

}
