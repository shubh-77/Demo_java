package Activity1;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String teamname,inningsname;
		int runs;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the team name:");
		teamname=sc.nextLine();
		System.out.println("Enter session:");
		inningsname=sc.nextLine();
		System.out.println("Enter runs:");
		runs = sc.nextInt();
		
		Innings i = new Innings();
		i.setInfo(teamname, inningsname, runs);
		i.displayInningsDetails();
		sc.close();
		
	}
}
