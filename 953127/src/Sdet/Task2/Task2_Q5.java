package Sdet.Task2;

//difference between two time periods

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task2_Q5 {
	
		public static void main(String[] args) throws Exception{
			String time1 = "12:00:00";
			String time2 = "12:01:00";
	 
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date date1 = format.parse(time1);
			Date date2 = format.parse(time2);
			long difference = date2.getTime() - date1.getTime();
			System.out.println(difference/1000);
		}
	
}
