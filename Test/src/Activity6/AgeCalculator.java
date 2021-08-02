package Activity6;

import java.text.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date in (dd/MM/yyyy) format:");
		String dateStr =sc.nextLine();
		try {
			date = sdf.parse(dateStr);
			sdf = new SimpleDateFormat("yyyy,MM,dd");
//			System.out.println("Date: " + sdf.format(date));
			
			String date1=sdf.format(date);
			String[] arrOfStr=date1.split(",");
			int year = Integer.parseInt(arrOfStr[0]);
			int month = Integer.parseInt(arrOfStr[1]);
			int day = Integer.parseInt(arrOfStr[2]);
			
			LocalDate ld1=LocalDate.now();
			LocalDate ld2 = LocalDate.of(year, month, day);
			Period p = Period.between(ld2, ld1);
			
			
			
			
			
			
			System.out.println("Age: "+p.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days");
			
			
			
		}
		catch (ParseException e) { 
			System.out.println("Parse Exception");
		}
		
		sc.close();
	}

}



