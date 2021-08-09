package Activity5;

import java.util.*;

class Team{
	String name;
	long noOfMatches;
	public Team(String name,long noOfMatches) {
		this.name=name;
		this.noOfMatches=noOfMatches;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(long noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public String toString()
    {
        return  this.name +"-"+ this.noOfMatches;
    }
	
}

class TeamComparator implements Comparator<Team>{

	@Override
	public int compare(Team o1, Team o2) {
		// TODO Auto-generated method stub
		return  (int) (o1.getNoOfMatches() - o2.getNoOfMatches());
		
	}
	
}


class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Team> ar = new ArrayList<Team>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of teams");
		int noOfteams=sc.nextInt();
		for(int i=0;i<noOfteams;i++) {
			sc.nextLine();
			System.out.printf("Enter team %d detail\nEnter Name\n",i+1);
			String teamname=sc.nextLine();
			System.out.println("Enter number of matches\n");
			int noOfMatches=sc.nextInt();
	        ar.add(new Team(teamname, noOfMatches));
		}
		System.out.println("Unsorted");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new TeamComparator());
		System.out.println("\nTeam list after sort by number of matches\n");
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
		
		sc.close();
		
	}

}

