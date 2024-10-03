import java.util.ArrayList;

public class GameMenu 
{
	ArrayList<String> actions = new ArrayList<String>(); 

	GameMenu(ArrayList<String> actions)
	{
		this.actions = actions;
	}


	/*public String getAction(String p)
	{
		return this.actions = actions; 
	}*/

	public void displayMenu()
	{
		for(int i = 0; i < actions.size(); i++){
			System.out.println(actions.get(i));
		}
	}
}