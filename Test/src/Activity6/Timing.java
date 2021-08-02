package Activity6;

import java.util.*;
import java.text.*;
import java.time.*;


public class Timing {
	public static void main(String[] args) throws ParseException {
//		Scanner sc = new Scanner(System.in);
//		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
//		System.out.print("Enter first time (hh:mm:ss)");
//		String timeStr1 = sc.nextLine();
//		System.out.println();
//		System.out.print("Enter second time (hh:mm:ss) ");
//		String timeStr2 = sc.nextLine();
//		System.out.println();
//		//PArsing date
//		Date d1 = sdf.parse(timeStr1);
//		Date d2 = sdf.parse(timeStr2);
//		sdf = new SimpleDateFormat("hh,mm,ss");
//		String time1=sdf.format(d1);
//		System.out.println(time1);
//		String time2=sdf.format(d2);
//		System.out.println(time2);
//		sc.close();
		
		
		Scanner sc = new Scanner(System.in);
		String time1 =sc.nextLine();
		LocalTime t1 = LocalTime.parse(time1);
		String time2 = sc.nextLine();
		LocalTime t2 = LocalTime.parse(time2);
		Duration diff = Duration.between(t2, t1);
		System.out.println(diff.toHours());

		sc.close();
		

	}
}
