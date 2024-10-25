package ex1;
import java.util.Scanner;
public class StringEx2 {
	public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("電話番号をハイフン付きで入力してください：");
	String number = s.next();
	
	String [] phones =number.split("-");
	System.out.println("市外局番："+ phones[0] + "。");
	System.out.println("真ん中は："+ phones[1] + "。");
	System.out.println("最後は："+ phones[2] + "。");
	s.close();
	
	}
}
