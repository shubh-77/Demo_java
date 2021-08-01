package Activity1;

public class Innings {

	private String teamname,inningsname;
	private int runs;
	// setter 
	public void setTeamname(String teamname) {
		this.teamname=teamname;
	}
	
	public void setInningsname(String inningsname) {
		this.inningsname=inningsname;
	}
	
	public void setRuns(int runs) {
		this.runs=runs;
	}
		

	public void setInfo(String teamname,String inningsname,int runs) {
		setTeamname(teamname);
		setInningsname(inningsname);
		setRuns(runs);
	}
	
	
	//getter
	
	String getTeamname() {
		return teamname;
	}
	String getInningsname() {
		return inningsname;
	}
	int getRuns() {
		return runs;
	}
	
	
	
	
	
	void displayInningsDetails() {
		if(inningsname.equals("First")) {
			System.out.println("Name: "+teamname+"\n"+"Scored: "+runs);
			runs=runs+1;
			System.out.println("Need "+runs+" to win");
		} 
		else if(inningsname.equals("Second")) {
			System.out.println("Name: "+teamname+"\n"+"Scored: "+runs);
			System.out.println("Match Ended.");
		} 	
		else {
			System.out.println("Invalid input.");
		}
	}
	
	
	
}
