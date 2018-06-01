package elementos.nodes;

import javax.swing.JOptionPane;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import screen.ExecutionGame;

/**
 * Class responsible for all buttons in the game.
 * 
 * @author LFO
 *
 */

public class ButtonGame {

	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private Button startGame;
	private Button exitGame;
	private Button endGame;

	public static boolean cond = false;

	/**
	 * 
	 * Responsible for init the game, when it's click the scene will change for the
	 * execution game scene and the seconds will start to count.
	 * 
	 * @param frame
	 * @param scene
	 * @return
	 */

	public Button getStartGame(final Stage frame, final Scene scene) {

		startGame = node.createButton(var.get_textButtonStart(), 210, 150);

		startGame.getStyleClass().add("ButtonsMenu");

		startGame.setOnAction((ActionEvent event) -> {

			frame.setScene(scene);
			frame.show();
			ExecutionGame.countSeconds();
			cond = true;

		});

		return startGame;
	}

	/**
	 * Responsible for the close in the menu. When it's click an alert will appear
	 * asking if wants to close the game.
	 * 
	 * @return
	 */

	public Button getExitGame() {

		exitGame = node.createButton(var.get_textButtonExit(), 210, 220);

		exitGame.getStyleClass().add("ButtonsMenu");

		exitGame.setOnAction((ActionEvent event) -> {

			if (JOptionPane.showConfirmDialog(null, "Tem certeza?", "AVISO DO GAME",
					JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		});

		return exitGame;
	}

	
	
	public Button getEndGame(AnimationTimer execucao) {

		endGame = node.createButton("Desistir?", 450, 10);

		endGame.getStyleClass().add("ButtonsGame");

		endGame.setOnAction((ActionEvent event) -> execucao.stop());

		return endGame;
	}
}
