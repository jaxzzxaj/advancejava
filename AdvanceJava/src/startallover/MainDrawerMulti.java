package startallover;

import java.util.List;

public class MainDrawerMulti {

	public static void main(String[] args) {
		DaoDrawermulti a = new DaoDrawermulti();
		
		String shoe ="pumps";
		
		List<drawer> list = a.searchByShoe(shoe);
		
//		listの中身がから出ない場合
		if(!list.isEmpty()) {
			for(int i = 0; i < list.size(); i++) {
				drawer chose = list.get(i);
				System.out.println("靴の種類は"+chose.getShoe() +"\n\n品番は"+chose.getId()+"\nブランドは"+chose.getBrand()+"\n性別は"+chose.getSex());
			}
		}
	}

}
