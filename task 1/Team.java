import java.util.ArrayList;

public class Team 
{
	private String teamName;
	private int teamRank; 
	private ArrayList<String> playerNames;

	public Team(String teamName)
	{
		this.teamName = teamName;
		// initialize arraylist
		this.playerNames = new ArrayList<>();
	}


	public String getTeamName()
	{
		return teamName;
	}

    public void setTeam(String teamName)
	{
		this.teamName = teamName;
	}


	public int getTeamRank()
	{
		return teamRank;
	}

	public void setRank(int teamRank)
	{
		this.teamRank = teamRank;
	}

	public ArrayList<String> getPlayNames()
	{
		return this.playerNames; 
	}

	public void setPlayerNames(ArrayList<String> playerNames)
	{
		this.playerNames = playerNames; 
	}

	//method so that we can add a player to the list
	public void addPlayer(String playerName)
	{
		this.playerNames.add(playerName);
	}

	public String toString(){
		// assigning append to the means to assigning data to the String builder
		String result = "";
		{
			result ="Hold: " + teamName + " rang: " + teamRank;
			
            for(String s : this.playerNames)
            {
            	// means \n new line 
            	result += "\n" + s; 
            }


			return result; 
		}
	}	
}