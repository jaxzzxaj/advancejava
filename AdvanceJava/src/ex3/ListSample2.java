package ex3;
import java.util.ArrayList;
import java.util.List;

public class ListSample2 {

	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		list.add("coffee");
		
		String str = list.get(0);
		
		System.out.println(str);
	}

}
