import java.util.ArrayList;
public class Main3 
{
	public static void main(String[]args)
	{
	ArrayList<String> actions = new ArrayList<String>();
    actions.add("Start Game");
    actions.add("Resume Game");
    actions.add("Pause Game");
    actions.add("End game");

    //System.out.println(actions.get(1));


    // instantiate new object from class
    GameMenu gm = new GameMenu(actions);

    gm.displayMenu();
	}
}