package screen;

import elementos.nodes.ButtonGame;
import elementos.nodes.LabelGame;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import start.StartGame;

public class MenuGame  {


	private AnchorPane menu;
	private Scene sceneMenu;

	
	private ExecutionGame sg = new ExecutionGame();
	private ButtonGame btn = new ButtonGame();
	private LabelGame lb = new LabelGame();


	public AnchorPane menu() {

		menu = new AnchorPane();
		menu.getChildren().addAll(btn.getStartGame(StartGame.frame, sg.gameScene()), btn.getExitGame());
		menu.getChildren().addAll(lb.get_lbTitleGame(), lb.get_lbSubTitleGame());
	
		
		return menu;
	}

	public Scene sceneMenu() {
		sceneMenu = new Scene(menu(), 600, 600);
		sceneMenu.getStylesheets().add(getClass().getResource("styleMenu.css").toExternalForm());
		return sceneMenu;
		
	}

}
