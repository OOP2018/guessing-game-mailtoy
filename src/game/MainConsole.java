package game;

/**
 * A main class for the GuessingGame. It is responsible for creating objects,
 * connecting objects, and running the game UI.
 * 
 * @author Kanchanok Kannee
 */
public class MainConsole {
	public static void main(String[] args) {
		
		int upperBound = 100;
		NumberGame game = new GuessNumberGame(upperBound);

		GameConsole ui = new GameConsole();
		GameSolver ui2 = new GameSolver(); 
		
		int solution = ui.play(game);
		System.out.println("play() returned " + solution);
		System.out.println(game.getCount());
	}
}
