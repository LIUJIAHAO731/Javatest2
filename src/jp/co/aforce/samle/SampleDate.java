package jp.co.aforce.samle;
import java.util.Calendar;

public class SampleDate {
	

	public static void main(String[] args) {
		/*
		 * Calendar calendar = Calendar.getInstance();
		 * System.out.println(calendar);
		   Date today = calendar.getTime();
		   System.out.println(today);
		 */
		/*
		 * 
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(2023,3,24);
		Date birthday = calendar.getTime();
		System.out.println(birthday);
		*/
		
		/*
		 * Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.set(1999,6,31,11,33,50);
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		System.out.println(hourOfDay);
		
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);	
		System.out.println(calendar.get(Calendar.YEAR));
		 */
		
		/*
		 * Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		calendar.add(Calendar.DAY_OF_MONTH,3);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH,-6);
		System.out.println(calendar.getTime());
		 */
		
	/*
	 * Calendar calendar= Calendar.getInstance();
	 * System.out.println(calendar.getTime());
		System.out.println("日本の時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です。");
		calendar.setTimeZone(TimeZone.getTimeZone("America/los_Angeles"));
		System.out.println(calendar.getTime());
		System.out.println("ロサンゼルスの時間は" + calendar.get(Calendar.HOUR_OF_DAY) + "時です。");
	 */
	
		/*
		 * Calendar calendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MMM/dd(EEE) HH:mm:ss",new Locale("en","US"));
		String formattedate = format.format(calendar.getTime());
		System.out.println(formattedate);
		 */
		
	
		
		Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();
        
		 System.out.println(today);
		 
		calendar.set(1999,6,31);
		Date birthday = calendar.getTime();
		System.out.println(birthday);
		
		calendar.clear();
		calendar.set(2020,0,2,10,20,30);
		Date date = calendar.getTime();	
		
		System.out.println(date);
		
		System.out.println(calendar.get(Calendar.YEAR));
		
		calendar.add(Calendar.HOUR_OF_DAY, -5);
		System.out.println(calendar.getTime());
		
		calendar.clear();
		calendar.set(2020,6,29,8,11);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 (E) hh:mm:ss");
		string formatDate = formatDate
		
	}
		 
}