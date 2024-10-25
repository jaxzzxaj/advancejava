package ex3;

import java.util.HashMap;
import java.util.Scanner;

public class ListEx44 {

	public static void main(String[] args) {
		HashMap<String,String> animalMap = new HashMap<>();
		animalMap.put("cat", "ねこ");
		animalMap.put("dog", "いぬ");
		animalMap.put("rabbit", "うさぎ");
		animalMap.put("bear", "くま");
		
		System.out.println("英語で動物の名前を入れてください→");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		System.out.println(animalMap.get(name));
		s.close();
	}

}
