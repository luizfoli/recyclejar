package elementos.nodes;

import javafx.scene.control.Label;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe responsável por todos os elementos de texto da tela de menu do
 *         game.
 *
 */

public class LabelGame {

	// Instância das classes necessárias
	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	// Labels
	private Label lbTitleGame;
	private Label lbSubTitleGame;

	public Label get_lbTitleGame() {
		lbTitleGame = node.createLabel(var.get_textLabelTitleGame());
		lbTitleGame.setLayoutX(180);
		lbTitleGame.setLayoutY(30);
		lbTitleGame.getStyleClass().add("TitleMenu");
		return lbTitleGame;
	}

	public Label get_lbSubTitleGame() {
		lbSubTitleGame = node.createLabel(var.get_textLabelSubTitleGame());
		lbSubTitleGame.setLayoutX(170);
		lbSubTitleGame.setLayoutY(100);
		lbSubTitleGame.getStyleClass().add("SubTitleMenu");
		return lbSubTitleGame;
	}
}
