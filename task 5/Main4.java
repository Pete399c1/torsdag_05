import java.util.ArrayList;
public class Main4 
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
    GameMenu1 gm = new GameMenu1(actions);

    gm.displayMenu();



    // instantiates user input choice
    String choice = gm.getAction(); 
    int num = Integer.parseInt(choice);
    doAction(num);
	}
    public static void doAction(int action) 
    {
        switch(action){

    case 1: 
        System.out.println("Start Game");
        break;
    case 2:
        System.out.println("Resume Game");
        break;
    case 3:
        System.out.println("Pause Game");
        break;
    case 4:
        System.out.println("End Game");
        break;
    default:
        System.out.println("Input denied");
        break;
    }

    }

}