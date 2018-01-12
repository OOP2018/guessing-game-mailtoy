import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {

	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param play game on the console.
	 * @return the secret number when user guesses it.
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		
		// describe the game
		System.out.println( game.toString() );
		
		// This is just an example.
		System.out.println( game.getMessage() );
		boolean correct;
		int guess;
		
		do{
		System.out.print("Your answer? ");
		guess = console.nextInt();
		correct = game.guess(guess);
		System.out.println( game.getMessage() );
		} while( !correct );
		return guess;
		
	}
	
}
