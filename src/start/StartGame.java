package start;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import screen.MenuGame;
import screen.VarTelas;

/**
 *	Classe main do projeto, responsável pelo boot inicial.
 *	@author Luiz Oliveira
 */

public class StartGame extends Application {

	public static Stage frame = new Stage();
	private MenuGame mg = new MenuGame();
	private VarTelas var = new VarTelas();

	
	@Override
	public void start(Stage nl) throws Exception {

		frame.getIcons().add(new Image(getClass().getResourceAsStream(var.getLogoGame())));
		frame.setScene(mg.sceneMenu());
		frame.setTitle(var.getTitleGame());
		frame.setResizable(false);
		frame.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
