package ui;

import java.util.Observable;
import java.util.Observer;

import game.NumberGame;

/**
 * Print the counter value on the console whenever it changes.
 * 
 * @author Kanchanok Kannee
 *
 */
public class ConsoleView implements Observer {
	private NumberGame game;

	/**
	 * A ConsoleView with reference to a NumberGame (the subject).
	 * 
	 * @param game
	 *            the counter to display.
	 */
	public ConsoleView(NumberGame game) {
		this.game = game;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(game.getCount());

	}

}
