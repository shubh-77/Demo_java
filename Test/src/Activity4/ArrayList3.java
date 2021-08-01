package Activity4;

import java.util.*;

public class ArrayList3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> gayleScore=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int count_fifty=0,count_hundred=0;
		
		
		
		for(int i=0;i<limit;i++) {
			int num =sc.nextInt();
//			count score 50
			if(num>=50 && num<100)
				count_fifty++;
//			count score 100
			else if(num>=100)
				count_hundred++;
			gayleScore.add(num);
		}
		
		
		System.out.println(count_fifty);
		System.out.println(count_hundred);
		
		sc.close();
		
		
	}
}
/*
6 
58 
100 
49 
50 
110 
60 
*/