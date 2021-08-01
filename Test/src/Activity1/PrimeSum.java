package Activity1;

import java.util.Scanner;

public class PrimeSum {

	private static int sumPrimeArray(int array[], int size){
		int sum=0,i,j,p;
		for (i = 0; i < size; i++) {
			j = 2;
			p = 1;
			if (array[i]==1) {
				i++;
			}
			

			while (j < array[i]) {
				if (array[i] % j == 0) {
					p = 0;
					break;
				}
				j++;
			}
			if (p == 1) {
				sum = sum + array[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size;
		Scanner sc = new Scanner(System.in);
		size= sc.nextInt();
		if (size<0) {	
			System.exit(0);
		}
		
		int[] arr= new int[size];
		  for (int i = 0; i < size; i++) {  
			  arr[i] = sc.nextInt();
			  if (arr[i]<0) {
				  System.out.println("No -ve values allowed");
				  System.exit(0);
				 
			  }
	           
	        }
		 
		  

		
		System.out.println(PrimeSum.sumPrimeArray(arr,size));
		sc.close();
	}





}
