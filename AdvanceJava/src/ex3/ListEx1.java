package ex3;
//④リストをインポートする
import java.util.ArrayList;
//①traineeとextendsする
public class ListEx1 extends Trainee {
//②インスタンスを生成
	Trainee a = new Trainee("田中");
//③コンストラクタを設定
	public ListEx1(String name) {
		super(name);
		}
//	⑤リストを生成
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("山田");
		list.add("田中");
		list.add("増田");
		
		for(int i=0; i< list.size(); i++) {
		String n = list.get(i);
		introduced();
		System.out.println(n);
		}
	}
		
	}
