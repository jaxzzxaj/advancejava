package ex3;
import java.util.HashMap;
import java.util.Scanner;
public class ListEx4 {
	public static void main(String[] args) {
//	①Scannerを導入
	Scanner sc = new Scanner(System.in);
//	②質問をする
	System.out.println("英語で動物の名前を入力してください：");
//	③入力した後、箱の中に入れる
	String animal = sc.nextLine();
//	④マップを作る（import→インスタンス生成→マップをつくる）
	HashMap <String,String> pet  = new HashMap<String,String>();
	pet.put("ねこ","neko");
	pet.put("dog","いぬ");
	pet.put("rabbit","うさぎ");
	pet.put("bear","くま");

//⑤入力した英語と一致するマップの値を探す設定を作る	
	String p = pet.get(animal);
	System.out.println("「"+p+"」です。");
	sc.close();
	}
}


//わかった！pet.get(animal)はインデックスを取得＝NG
//pet.get(animal)はkeyを取得している！

//なにが混乱していたのかというと＝map外にmapのカラム（？）を定義して
//いるのはなぜできるの？
