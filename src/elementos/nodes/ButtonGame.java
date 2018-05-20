package elementos.nodes;

import javax.swing.JOptionPane;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import screen.ExecutionGame;

/**
 * 
 * @author Luiz Oliveira
 * 
 *         Classe responsável pelos botões da tela de menu do game.
 *
 */

public class ButtonGame {

	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private Button startGame;
	private Button exitGame;
	private Button endGame;
	
	public static boolean cond = false;

	public Button getStartGame(final Stage frame, final Scene scene) {

		startGame = node.createButton(var.get_textButtonStart(), 210, 150);

		startGame.getStyleClass().add("ButtonsMenu");

		startGame.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				
				frame.setScene(scene);
				frame.show();
				ExecutionGame.contarSegundos();
				cond = true;
				
			}

		});

		return startGame;
	}

	public Button getExitGame() {

		exitGame = node.createButton(var.get_textButtonExit(), 210, 220);

		exitGame.getStyleClass().add("ButtonsMenu");

		exitGame.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {

				if (JOptionPane.showConfirmDialog(null, "Tem certeza?", "AVISO DO GAME",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
				}
			}
		});

		return exitGame;
	}

	public Button getEndGame(AnimationTimer execucao) {

		endGame = node.createButton("Desistir?", 450, 10);
		endGame.getStyleClass().add("ButtonsGame");
		endGame.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				execucao.stop();
			}
		});
		return endGame;
	}
}
