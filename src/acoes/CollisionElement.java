package acoes;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe responsável pela ação que verifica se houve uma colissão entre
 *         os elementos da tela.
 *
 */

public class CollisionElement extends ElementScreen {

	public boolean isCollision(Circle c, ImageView img) {
		return c.intersects(img.getTranslateX(), img.getTranslateY(), img.getFitWidth(), img.getFitHeight());
	}

}

