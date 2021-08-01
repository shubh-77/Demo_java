package Activity3;

import java.util.*;

public class ArrOutOfBoundsAndNegativeArraySizeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int size,overNumber;
		
		try {
			System.out.println("Enter number of overs");
			size=sc.nextInt();
			int []arr = new int[size];
			System.out.println("Enter the number of runs for each over");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter over number:");
			overNumber=sc.nextInt();
			System.out.println("Runs scored in this over :"+arr[overNumber-1]);
			

			
		}
		catch(NegativeArraySizeException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
		
		sc.close();
	}

}
