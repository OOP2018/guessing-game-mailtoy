import java.util.Scanner;

/**
 * Automatically find the secret to any NumberGame.
 * 
 * @author Kanchanok Kannee
 *
 */
public class GameSolver {
	/**
	 * Play a NumberGame and return the solution. The NumberGame object must
	 * provide messages (getMessage) containing the phrase "too small" if a
	 * guess is too small and "too large" if a guess is too large, for efficient
	 * solution.
	 *
	 * @param game
	 *            is the NumberGame to solve
	 * @return //TODO what does it return?
	 */
	public int play(NumberGame game) {

		System.out.println(game.toString());
		int takeupperBound = game.getUpperBound() / 4;
		int halfupperBound = game.getUpperBound() / 2;
		while (!game.guess(halfupperBound)) {
			
				System.out.print("Your answer? ");
				if (game.getMessage().contains("too small")) {
					System.out.println(halfupperBound);
					halfupperBound = halfupperBound + takeupperBound;
				} else if (game.getMessage().contains("too large")) {
					System.out.println(halfupperBound);
					halfupperBound = halfupperBound - takeupperBound;
				}
				if (takeupperBound != 1) {
					takeupperBound = takeupperBound/2;
				}
			
		}
		System.out.println("Right! The secret number is " + halfupperBound);
		return halfupperBound;

	}

}
