package ex3;
import java.util.ArrayList;
public class ListSample1 {

	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();

	list.add("apple");
	list.add("orange");
	list.add("peach");
	
	for(int i= 0; i < list.size(); i++) {
		String str = list.get(i);
		System.out.println(str);
	}
	}

}
