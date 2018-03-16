package ui;
import game.GuessNumberGame;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
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
	
	public void setGuess(GuessNumberGame numberGame){
		this.numberGame = numberGame;	
	}
	
	public void handleSubmit() {
		int number = Integer.parseInt(textField1.getText().trim());
		numberGame.guess(number);
		label1.setText(numberGame.getMessage());
	}
	
	public void handleClear(){
		Platform.exit();
	}

	
}
