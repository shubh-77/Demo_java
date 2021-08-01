package Activity2;

import java.util.Scanner;

class HotelRoom{
	private String hotelName;
	private int numberOfSqFeet;
	protected boolean hasTV,hasWifi;
	
	 public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		 this.hotelName=hotelName;
		 this.numberOfSqFeet=numberOfSqFeet;
		 this.hasTV=hasTV;
		 this.hasWifi=hasWifi;
	 }
	 
	 public int calculateTariff() {
		 
		 int sqft=numberOfSqFeet;
		 int rate = getRatePerSqFeet();
		 return sqft*rate ;
	 }
	 public int getRatePerSqFeet() {
		 return 0;
	 }
}


class DeluxeRoom extends HotelRoom{
	protected int ratePerSqFeet; 

	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=10;
//		this.ratePerSqFeet = ratePerSqFeet;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getRatePerSqFeet() {
		// TODO Auto-generated method stub
		if (hasWifi==true)
			return ratePerSqFeet+2;
		else
			return ratePerSqFeet;
	}
}
class DeluxeSeaViewRoom extends DeluxeRoom{

	public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=12;

		// TODO Auto-generated constructor stub
	}
	
}

class SuiteRoom extends HotelRoom{
	private int ratePerSqFeet;
	public SuiteRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		ratePerSqFeet=15;
		// TODO Auto-generated constructor stub
		
	}
	
	public int getRatePerSqFeet() {
		// TODO Auto-generated method stub
		if (hasWifi==true)
			return ratePerSqFeet+2;
		else
			return ratePerSqFeet;
	}
	
	
	
}





public class HotelRoomMain {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator\n1.Deluxe Room\n2.2. Deluxe AC Room\n3.Suite AC Room\nSelect Room Type:");
		int choice = sc.nextInt();
		String hotelName;int numberOfSqFeet;
		boolean hasTV, hasWifi; 
		if(choice ==1) {
			System.out.println("Hotel Name:");
			hotelName=sc.next();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			System.out.println("Room has TV (yes/no):");
			hasTV=(sc.next().equals("yes"))? true:false;
			System.out.println("Room has Wifi(yes/no):");
			hasWifi=(sc.next().equals("yes"))? true:false;
			DeluxeRoom dr = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);	
			System.out.println("Room tariff per day is:"+dr.calculateTariff());

		}
		else if(choice ==2) {
			System.out.println("Hotel Name:");
			hotelName=sc.next();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			System.out.println("Room has TV (yes/no):");
			hasTV=(sc.next().equals("yes"))? true:false;
			System.out.println("Room has Wifi(yes/no):");
			hasWifi=(sc.next().equals("yes"))? true:false;
			DeluxeSeaViewRoom dsvr = new DeluxeSeaViewRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);	
			System.out.println("Room tariff per day is:"+dsvr.calculateTariff());

		}
		else if(choice ==3) {
			System.out.println("Hotel Name:");
			hotelName=sc.next();
			System.out.println("Room Square Feet Area:");
			numberOfSqFeet=sc.nextInt();
			System.out.println("Room has TV (yes/no):");
			hasTV=(sc.next().equals("yes"))? true:false;
			System.out.println("Room has Wifi(yes/no):");
			hasWifi=(sc.next().equals("yes"))? true:false;
			SuiteRoom sr = new SuiteRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);	
			System.out.println("Room tariff per day is:"+sr.calculateTariff());

		}
	
		else {
			System.out.println("Invalid Choice");
		}
		
		
		
		sc.close();
		
	}
}
