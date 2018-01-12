import java.util.Scanner;

/**
 * Automatically find the secret to any NumberGame.
 * @author Kanchanok Kannee
 *
 */
public class GameSolver {
    /**
     * Play a NumberGame and return the solution.
     * The NumberGame object must provide messages (getMessage)
     * containing the phrase "too small" if a guess is too small
     * and "too large" if a guess is too large, for efficient
     * solution.
     *
     * @param game is the NumberGame to solve
     * @return //TODO what does it return?
     */
    public int play(NumberGame game){
    	Scanner console = new Scanner(System.in);
    	int number = console.nextInt();
    	int upperbound = game.getUpperBound();
    	GuessNumberGame bot = new GuessNumberGame(upperbound);
    	int halfupperBound = game.getUpperBound()/2;
    	if(game.getMessage().contains("Right! The secret number is "+ number)){
    		
    	}
    	return 0;
    	
    	
    	
    }





}
