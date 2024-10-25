package ex1;
import java.util.Scanner;
public class StringEx1 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ファイルのパスを入力してください：");
		String path = s.nextLine();
		
//		どうして\\\\でできるのかわからない　\"→"みたいにできない
//		エスケープシークエンスと正規表現で”\\”を使うので「え？なにしてるの？」ってなる
		String[] part = path.split("\\\\");
		String lastPart = part[part.length -1];
		
		System.out.println("最後の部分："+ lastPart + " \" ");
		s.close();
	
	}
}
