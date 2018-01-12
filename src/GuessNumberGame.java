
import java.util.Random;

/**
 * Game of guessing a secret number.-- write a description here
 * 
 * @author Kanchanok Kannee
 */
public class GuessNumberGame extends NumberGame {
	/* properties of a guessing game */

	private int upperBound;
	private int secret;
	private String massage;
	private int count = 0;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1).
	 */
	public GuessNumberGame(int upperbound) { // this is a constructor
		this.upperBound = upperbound;
		this.secret = getRandomNumber(upperbound);
		this.massage = "I'm thinking of a number between 1 and " + upperbound;
	}

	/**
	 * Create a random number between 1 and upperBound.
	 * 
	 * @param upperBound is the upper limit for random number
	 * @return a random number between 1 and upperBound (inclusive)
	 */
	private int getRandomNumber(int upperBound) {
		long seed = System.nanoTime();
		Random rand = new Random(seed);
		int value = rand.nextInt(upperBound) + 1;
		return value;

	}

	/**
	 * Evaluate a user's guess.
	 * 
	 * @param number is the user's answer, as an integer.
	 * @return true if it is correct, false otherwise. Also set a message to
	 *         help the user.
	 * 
	 */
	public boolean guess(int number) {
		count++;
		if (number == secret) {
			setMessage("Right! The secret number is " + number);
			return true;
		} else if (number < secret) {
			setMessage("Sorry, too small.");
			return false;
		}
		setMessage("Sorry, too large.");
		return false;
	}

	/**
	 * Return a value of upperBound from the User.
	 * 
	 * @return a value of upperBound from the User.
	 */
	public int getUpperBound() {
		return this.upperBound;
	}

	/**
	 * Describe the game.
	 * 
	 * @return the message that you correct or not.
	 */
	public String toString() {
		return "Guess a secret number between 1 and " + this.upperBound;
	}

	/**
	 * Return a count based on the most recent guess.
	 * 
	 * @return count based on most recent guess
	 */
	public int getCount() {
		return count;
	}

}
