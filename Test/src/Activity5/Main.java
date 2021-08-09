package Activity5;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		String name,wickets;


		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the player name\n");
//		name=sc.next();
//		System.out.println("Enter wickets - seperated by | symbol.\n");
//		wickets=sc.next();	
		Map<String, List<Wicket>> hashMap = new HashMap<>();

		boolean addPlayer = true;
		while (addPlayer) {
			System.out.println("Enter the player name");
			name = sc.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol");
			wickets = sc.next();
			String bowlersWickets[] = wickets.split("%|%");
			for (int i = 0; i < bowlersWickets.length; i++) {
				if (hashMap.containsKey(name)) {
					//                    List<Wicket>
				}
			}
			System.out.println("Do you want to add another player (yes/no)");
			addPlayer = sc.nextBoolean();



		}
	}
}

/*
Ashwin
Virat Kohli|Shane Watson|Ajinkya Rahane

*/
