package Activity6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


class Model{
	private String vehicleNumber,mobile;
	private LocalTime inTime,outTime;
	private LocalDate currentDate;
	private double amount;


	public Model(String vehicleNumber, String mobile, LocalTime inTime, LocalTime outTime, LocalDate currentDate) {

		this.vehicleNumber = vehicleNumber;
		this.mobile = mobile;
		this.inTime = inTime;
		this.outTime = outTime;
		this.currentDate = currentDate;
		this.amount = 20;
	}
	
	void display() {
		System.out.println("Vehicle Number: "+vehicleNumber+"\nMobile: "+mobile+"\nDate: "+currentDate+"\nIn-Time: "+inTime+"\nOut-Time: "+outTime+"\nAmount: "+amount);
	}
	
	
	void calculateTariff(LocalTime inTime,LocalTime outTime) {
	    Duration diff = Duration.between(inTime, outTime);
	    if(diff.toHours()>1) {
	    	amount=amount*diff.toHours();
	    }
	    display();
	}
}

public class Parking{
	public static void main(String[] args)throws ParseException {
		// TODO Auto-generated method stub

		String vehicleNumber,mobile;
		LocalDate currentDate;

		//Date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date; 

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Vehicle:");
		vehicleNumber=sc.nextLine();
		System.out.println("Enter Mobile:");
		mobile=sc.nextLine();
		//	date entering in user format
		System.out.println("Enter Date in (dd/MM/yyyy) format:");
		String dateStr =sc.nextLine();

		//date parsing in required
		date = sdf.parse(dateStr);
		sdf = new SimpleDateFormat("yyyy,MM,dd");
		//date conversion
		String date1=sdf.format(date);
		String[] arrOfStr=date1.split(",");
		int year = Integer.parseInt(arrOfStr[0]);
		int month = Integer.parseInt(arrOfStr[1]);
		int day = Integer.parseInt(arrOfStr[2]);
		currentDate = LocalDate.of(year, month, day);
		
		//intime & outTime
		System.out.println("Enter in-time");
		String time1 =sc.nextLine();
		LocalTime inTime = LocalTime.parse(time1);
		System.out.println("Enter out-time");
		String time2 = sc.nextLine();
		LocalTime outTime = LocalTime.parse(time2);
		
		
		
		
		Model m1 = new Model(vehicleNumber,mobile,inTime,outTime,currentDate);
		m1.calculateTariff(inTime,outTime);

		sc.close();

	}
}


