package ex2;

import java.util.Calendar;

public class DateEx2 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		int year = date.get(Calendar.YEAR);
		int month =date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);
		int week = date.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year+ "年" +month+ "月" +day+ "日（" +week+ "）");
	}
}

