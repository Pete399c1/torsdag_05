import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	    System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Read user input
	Scanner scan = new Scanner(System.in);
        System.out.println("Make a guess: "); 
        String stringGuess = scan.nextLine(); 	 
        int guess = 0;
        // use hasNextDouble to check if input is numeric,
        // if so...
        if(scan.hasNextDouble()){
            guess = Integer.parseInt(stringGuess);
            // Compare it with the random number
            if(rnd_number == guess){
                System.out.println("correct guess");
            // Help the user by revealing wether the guess was lower or higher than the target number
            }else if(guess < rnd_number){
                System.out.println("to low");
                // Let the user try again by calling this method recursively
                makeAGuess();
            }else if(guess > rnd_number){
                System.out.println("to high");
                // Let the user try again by calling this method recursively
                makeAGuess();
            }

        }else{
            System.out.println("Thats not a number");
            makeAGuess();
        }
        
    
        
        
        
        // if input was not numeric show an error message and call this method recursively
    }
}