
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
	 * @param game is the NumberGame to solve
	 * @return the correct solution.
	 */
	public int play(NumberGame game) {

		int takeupperBound = game.getUpperBound() / 4;
		int guess = game.getUpperBound() / 2;
		while (!game.guess(guess)) {

			if (game.getMessage().contains("too small")) {
				guess = guess + takeupperBound;
			} else if (game.getMessage().contains("too large")) {
				guess = guess - takeupperBound;
			}
			if (takeupperBound != 1) {
				takeupperBound = takeupperBound / 2;
			}

		}

		return guess;

	}

}
