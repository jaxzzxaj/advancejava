package ex3;
import java.util.HashMap;
public class Mapsample {
	public static void main(String []args) {
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	map.put(1,"apple");
	map.put(2,"orange");
	map.put(3,"peach");
	
	String fruits = map.get(1);
	System.out.println(fruits);
	}
 }
