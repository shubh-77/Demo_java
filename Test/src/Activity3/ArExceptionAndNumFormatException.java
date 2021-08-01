package Activity3;

import java.io.*;
public class ArExceptionAndNumFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int runs,oversFaced;
		float currentRunRate;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		
		try {
			System.out.println("Enter the total runs scored");
			runs=Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced");
			oversFaced=Integer.parseInt(br.readLine());
			currentRunRate=runs/oversFaced;
			System.out.println("Current Run Rate :"+currentRunRate);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 



	}

}
