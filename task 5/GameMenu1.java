import java.util.ArrayList;
import java.util.Scanner;
public class GameMenu1 
{
	ArrayList<String> actions = new ArrayList<String>(); 

	GameMenu1(ArrayList<String> actions)
	{
		this.actions = actions;
	}


	/*public String getAction(String p)
	{
		return this.actions = actions; 
	}*/

	public void displayMenu()
	{
		for(int i = 0; i < actions.size(); i++)
		{
			System.out.println(actions.get(i));
		}
	}

	public String getAction()
	{
		displayMenu();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number to choose an action: ");
		String choice = scanner.nextLine();

		return choice;
	}





}