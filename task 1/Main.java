public class Main {

public static void main(String[]args)
{
	// instanciating the team
	Team team1 = new Team("De uovervindelige");
	team1.setRank(3);
	team1.addPlayer("Peter");
	team1.addPlayer("Simon");
	team1.addPlayer("Anna");

	System.out.println(team1.toString());

	Team team2 = new Team("The golden state warriors");
	team2.setRank(6);
	team2.addPlayer("Allan");
	team2.addPlayer("Søren");
	team2.addPlayer("John");

	Team team3 = new Team("the trump supporters");
	team3.setRank(4);
	team3.addPlayer("Harry");
	team3.addPlayer("Daniel");
	team3.addPlayer("Mads");

	Team team4 = new Team("the giraffes");
	team4.setRank(2);
	team4.addPlayer("Jennifer");
	team4.addPlayer("Silla");
	team4.addPlayer("Ila");

	Team team5 = new Team("the rabbits");
	team5.setRank(1);
	team5.addPlayer("Ashley");
	team5.addPlayer("Sofie");
	team5.addPlayer("sofia");

	Team team6 = new Team("the ballers");
	team6.setRank(5);
	team6.addPlayer("christoffer");
	team6.addPlayer("Anton");
	team6.addPlayer("Marcus");

	System.out.println(team2.toString());
    System.out.println(team3.toString());
    System.out.println(team4.toString());
	System.out.println(team5.toString());
	System.out.println(team6.toString());

}
	
}