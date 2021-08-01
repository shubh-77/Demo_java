package Activity4;


import java.util.*;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> teamNames = new ArrayList<String>(); 
		int x,y;
		System.out.println("Enter Team Names");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String a =sc.nextLine();
			teamNames.add(a);
		}
		System.out.println("Enter swap positons:");
		x = sc.nextInt();
		y=sc.nextInt();
//		System.out.printf("Swapping %dth and %dth element.",x,y);
		Collections.swap(teamNames,x,y);
		for(String teamName:teamNames) {
			System.out.println(teamName);
		}

		
		sc.close();
	}
}
/*
Sunrisers Hyderabad
Delhi Capitals
Royal Challengers Bangalore
Kolkata Knight Riders
Mumbai Indians
*/