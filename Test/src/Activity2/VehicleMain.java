package Activity2;

import java.util.Scanner;

class Vehicle{
	protected String make,vehicleNumber,fuelType;
	protected int fuelCapacity,cc;
	
	public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc) {
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity= fuelCapacity;
		this.cc = cc;
	}
	void displayMake() {
		System.out.println("***"+make+"***");
	}
	
	void displayBasicInfo() {
		displayMake();
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Fuel Capacity: "+fuelCapacity);
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Engine CC: "+cc);
		
	}
	
	void displayDetailInfo() {
		//empty method
	}
}



class TwoWheeler extends Vehicle{

	private boolean kickStartAvailable;
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,boolean kickStartavailable) {
		// TODO Auto-generated constructor stub
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartavailable;
	}

	@Override
	void displayDetailInfo() {
		super.displayBasicInfo();
		System.out.println("---Detail Information---");
		if(kickStartAvailable==true) {
			System.out.println("Kick Start Availability: YES");	
		}
		else
		{
			System.out.println("Kick Start Availability: NO");
		}
		
	}

}


class FourWheeler extends Vehicle{
	private String audioSystem;
	private int numberOfDoors;
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,String audioSystem,int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		
		this.audioSystem = audioSystem;
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	void displayDetailInfo() {
		// TODO Auto-generated method stub
		super.displayBasicInfo();
		System.out.println("---Detail Information---");
		System.out.println("Audio System: "+audioSystem);
		System.out.println("Number of Doors:"+numberOfDoors);

		
	}
	
	
	
	
}

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Vehicle Type: \n 1.Four Wheeler\n 2.Two Wheeler\n");
		int choice=sc.nextInt();
		String vehicleMake,vehicleNumber,fuelType="";
		int fuelCapacity,cc,ch;
		String audioSystem;
		int numberOfDoors;
		boolean kickStartAvailable;
		
		
		if (choice==1) {
			vehicleMake="Four Wheeler";
			System.out.println("Vehicle Make:");
			vehicleMake= sc.next();
			
			System.out.println("Vehicle Number:\n");
			vehicleNumber=sc.next();
			System.out.println("Fuel Type: \n 1.Petrol \n2.Diesel");
			ch=sc.nextInt();
			if(ch==1)
				fuelType="Petrol";
			else if (ch==2)
				fuelType="Diesel";
			else
				System.out.println("Invalid");
			System.out.println("Fuel Capacity:\n");
			fuelCapacity=sc.nextInt();
			System.out.println("Engine CC:\n");
			cc=sc.nextInt();
			System.out.println("Audio System:\n");
			audioSystem=sc.next();
			System.out.println("Number of Doors:\n");
			numberOfDoors=sc.nextInt();	
			FourWheeler fw = new FourWheeler(vehicleMake, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
			fw.displayDetailInfo();
		}
		else if (choice==2) {
			vehicleMake="Two Wheeler";
			System.out.println("Vehicle Make:");
			vehicleMake= sc.next();
			System.out.println("Vehicle Number:\n");
			vehicleNumber=sc.next();
			System.out.println("Fuel Type: \n 1.Petrol \n2.Diesel");
			ch=sc.nextInt();
			if(ch==1)
				fuelType="Petrol";
			else if (ch==2)
				fuelType="Diesel";
			else
				System.out.println("Invalid");
			System.out.println("Fuel Capacity:\n");
			fuelCapacity=sc.nextInt();
			System.out.println("Engine CC:\n");
			cc=sc.nextInt();
			System.out.println("Kick Start Available(yes/no):\n");
			kickStartAvailable=(sc.next().equals("yes"))? true:false;
			TwoWheeler tw = new TwoWheeler(vehicleMake, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);
			tw.displayDetailInfo();
	
		}
		else {
			System.out.println("Invalid Choice!");
		}
		
		sc.close();
	}

}
