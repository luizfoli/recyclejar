package acoes;

import javafx.event.EventHandler;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe responsável pela interação dos elementos da tela com o mouse,
 *         possibilitando a movimentação do elemento com o clique do mouse.
 *
 */

public class MouseAction {

	private double orgSceneX, orgSceneY;
	private double orgTranslateX, orgTranslateY;

	public EventHandler<MouseEvent> mousePressed = new EventHandler<MouseEvent>() {

		public void handle(MouseEvent t) {
			orgSceneX = t.getSceneX();
			orgSceneY = t.getSceneY();
			orgTranslateX = ((ImageView) (t.getSource())).getTranslateX();
			orgTranslateY = ((ImageView) (t.getSource())).getTranslateY();
		}
	};

	public EventHandler<MouseEvent> mouseDragged = new EventHandler<MouseEvent>() {

		public void handle(MouseEvent t) {
			double offsetX = t.getSceneX() - orgSceneX;
			double offsetY = t.getSceneY() - orgSceneY;
			double newTranslateX = orgTranslateX + offsetX;
			double newTranslateY = orgTranslateY + offsetY;

			((ImageView) (t.getSource())).setTranslateX(newTranslateX);
			((ImageView) (t.getSource())).setTranslateY(newTranslateY);
		}
	};
}
