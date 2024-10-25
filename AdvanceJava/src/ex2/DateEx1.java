package ex2;
import java.util.Calendar;
public class DateEx1 {
	public static void main(String [] args) {
		Calendar date = Calendar.getInstance();
		date.add(Calendar.MONTH,20);
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		String [] weekdays = {"sun","mon","tues","wed","thur","fri","sat"};
		String weekday = weekdays[date.get(Calendar.DAY_OF_WEEK)-1];
		
		System.out.println(year+ "年" + month + "月" +day+ "日（" +weekday+ "）");
		
		
	}
}