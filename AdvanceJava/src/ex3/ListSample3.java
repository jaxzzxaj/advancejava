package ex3;
import java.util.ArrayList;
public class ListSample3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			System.out.println(num);
		}
	}

}
