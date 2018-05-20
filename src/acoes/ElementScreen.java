package acoes;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe responsável por adicionar ou remover um elemento da tela.
 *
 */

public class ElementScreen extends RandomLocation {

	public void putElementInScreen(AnchorPane root, ImageView img) {
		if (!root.getChildren().contains(img)) {
			root.getChildren().add(img);
			img.setTranslateX(getRandomX());
			img.setTranslateY(getRandomY());
		}

	}

	public void removeTrash(AnchorPane root, ImageView img) {
		img.setTranslateX(1);
		img.setTranslateY(1);
		root.getChildren().remove(img);
	}
}
