package start;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import screen.MenuGame;
import screen.VarTelas;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe main do projeto, responsável pela execução do Game.
 *
 */

public class StartGame extends Application {

	public static Stage frame = new Stage();
	private MenuGame mg = new MenuGame();
	private VarTelas var = new VarTelas();

	@Override
	public void start(Stage nl) throws Exception {

		frame.getIcons().add(new Image(getClass().getResourceAsStream(var.get_logoGame())));
		frame.setScene(mg.sceneMenu());
		frame.setTitle(var.get_titleGame());
		frame.setResizable(false);
		frame.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
