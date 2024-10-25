package ex3;
import java.util.ArrayList;
public class ListEx3 {
	public static void main (String[] args) {
//	リスト
		ArrayList <String>shrips = new ArrayList<String>();
		shrips.add("えび");
		shrips.add("甘えび");
		shrips.add("伊勢えび");
		shrips.add("桜えび");
		shrips.add("赤えび");
		
		System.out.println("え→ゑに置き換えます\n");
		
		for(String e : shrips) {
			System.out.println(e.replaceAll("え","ゑ"));
		}
	}
}
