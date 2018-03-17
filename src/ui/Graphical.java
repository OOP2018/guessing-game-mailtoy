package ui;

import game.GuessNumberGame;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * UI controller and initializing components.
 * 
 * @author Kanchanok Kannee
 *
 */
public class Graphical {
	@FXML
	TextField textField1;
	@FXML
	Label label1;

	GuessNumberGame numberGame;

	/**
	 * Set a reference to the game.
	 * 
	 * @param numberGame
	 */
	public void setGuess(GuessNumberGame numberGame) {
		this.numberGame = numberGame;
	}

	/**
	 * Submit the number that user guess and show message that correct or not.
	 */
	public void handleSubmit() {
		int number = Integer.parseInt(textField1.getText().trim());
		numberGame.guess(number);
		label1.setText(numberGame.getMessage());
	}

	/**
	 * Exit the program.
	 */
	public void handleClear() {
		Platform.exit();
	}

}
