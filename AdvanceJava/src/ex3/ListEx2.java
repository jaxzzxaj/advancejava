package ex3;
import java.util.ArrayList;
public class ListEx2 {
	public static void main(String [] args) {
//		リストの設定
		ArrayList <String> fruits = new ArrayList<String>();
		fruits.add("りんご");
		fruits.add("みかん");
		fruits.add("ぶどう");
		
	int n = fruits.size();
	System.out.println("要素の数は"+n + "です。");
	for(int i = 0; i <n; i++) {
		String name = fruits.get(i);
		System.out.println("要素の数は"+name + "です。");		
	}
	}
}