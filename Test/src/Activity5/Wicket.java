package Activity5;

public class Wicket {

	private String playerName;
	Bowler obj;
	
	
	public Wicket(String playerName, Bowler obj) {
		
		this.playerName = playerName;
		this.obj = obj;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Bowler getObj() {
		return obj;
	}
	public void setObj(Bowler obj) {
		this.obj = obj;
	}
	
	
	
}
