package Activity4;


import java.util.*;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> topFiveScorerIpl13 = new ArrayList<String>(); 
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			String a =sc.nextLine();
			topFiveScorerIpl13.add(a);
		}
//        System.out.println(topFiveScorerIpl13);

		ArrayList<String> topFiveScorerIpl12 = new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++) {
			String a =sc.nextLine();
			topFiveScorerIpl12.add(a);
		}
		
		topFiveScorerIpl12.retainAll(topFiveScorerIpl13);
		System.out.println("Consistent run scorers");
		for(String playerName:topFiveScorerIpl12) {
			System.out.println(playerName);
		}
		
       sc.close();
	}
}
/*

KL Rahul
Shikhar Dhawan
David Warner
Shreyas Iyer
Ishan Kishan

David Warner
KL Rahul
Quinton De Kock
Shikhar Dhawan
Andre Russel
*/