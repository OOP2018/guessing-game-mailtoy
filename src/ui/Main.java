package ui;

import java.net.URL;

import com.sun.org.apache.bcel.internal.generic.NEW;

import game.GuessNumberGame;
import game.NumberGame;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main class to launch the program.
 * 
 * @author Kanchanok Kannee
 *
 */
public class Main extends Application {
	NumberGame game = new GuessNumberGame(100);

	/**
	 * Initiate the program.
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			URL url = getClass().getResource("Graphic.fxml");
			if (url == null) {
				System.out.println("Couldn't find file: Graphic.fxml");
				Platform.exit();
			}
			// Load the FXML and get reference to the loader
			FXMLLoader loader = new FXMLLoader(url);
			// Create the UI. This will instantiate the controller object, too.
			Parent root = loader.load();
			Graphical controller = loader.getController();
			controller.setGuess((GuessNumberGame) game);
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("Guessing Game.");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		ConsoleView view = new ConsoleView(game);
		game.addObserver(view);

		CounterView view2 = new CounterView(game);
		game.addObserver(view2);
		view2.run();

		NumberView view3 = new NumberView(game);
		game.addObserver(view3);
		view3.run();
	}

	/**
	 * Run the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
