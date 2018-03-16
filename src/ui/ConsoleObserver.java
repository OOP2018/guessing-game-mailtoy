package ui;

import java.util.Observable;
import java.util.Observer;

import game.NumberGame;
/**
 * 
 * @author Kanchanok Kannee
 *
 */
public class ConsoleObserver implements Observer {
	private NumberGame game;
	
	public ConsoleObserver(NumberGame game) {
		this.game = game;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(game.getCount());
		
		
	}
	

}
