package ui;

import java.util.Observable;
import java.util.Observer;
import game.NumberGame;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * A Controller for a window that shows the number of times a guess of a NumberGame.
 * 
 * @author Kanchanok Kannee
 *
 */
public class CounterView extends Stage implements Observer {
	/** the stage (top-level window) for showing scene */
	private Stage stage;
	/** a counter to show value of */
	private NumberGame game;
	/** the label that shows the counter value. */
	private Label label;

	/**
	 * Initialize a CounterView, which shows value of a counter.
	 * @param game the NumberGame to show.
	 */
	public CounterView(NumberGame game) {
		this.game = game;
		initComponents();
	}

	/**
	 * Initialize anything your controller or UI needs.
	 */
	private void initComponents() {
		stage = this;
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setAlignment(Pos.CENTER);
		label = new Label("   ");
		label.setPrefWidth(144);
		label.setFont(new Font("Arial", 80.0));
		label.setAlignment(Pos.CENTER);
		root.getChildren().add(label);
		Scene scene = new Scene(root);
		this.setScene(scene);
		this.setTitle("Count");
		this.sizeToScene();
	}

	/** Show the window and update the counter value. */
	public void run() {
		stage.show();
		displayCount();
	}

	/**
	 * Show the counter value.
	 */
	public void displayCount() {
		label.setText(String.format("%2d", game.getCount()));
	}

	@Override
	public void update(Observable o, Object arg) {
		displayCount();

	}

}
