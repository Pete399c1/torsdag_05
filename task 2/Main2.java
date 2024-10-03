import java.util.Scanner;

public class Main2 
{



	public static void main(String[]args)
	{
		System.out.println("Please type your name");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("Hello " + name);
		System.out.println("Please type your age");

		int age = scanner.nextInt();
		System.out.println("You are " + age + " years old");

		int retirement =	67;

		System.out.println("You have " + (retirement - age) + " Years until retirement");

		
	}
}