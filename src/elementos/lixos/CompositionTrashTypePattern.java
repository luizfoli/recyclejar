package elementos.lixos;

import acoes.Action;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class CompositionTrashTypePattern {

	private Action action = new Action();

	private static int scoreFinal = 0;

	protected void moveTrash(ImageView imgOne, ImageView imgTwo, ImageView imgThree) {

		imgOne.setOnMousePressed(action.mousePressed);
		imgOne.setOnMouseDragged(action.mouseDragged);

		imgTwo.setOnMousePressed(action.mousePressed);
		imgTwo.setOnMouseDragged(action.mouseDragged);

		imgThree.setOnMousePressed(action.mousePressed);
		imgThree.setOnMouseDragged(action.mouseDragged);

	}

	protected void addAll(AnchorPane root, ImageView imgOne, ImageView imgTwo, ImageView imgThree) {
		root.getChildren().add(imgOne);
		root.getChildren().add(imgTwo);
		root.getChildren().add(imgThree);
	}

	protected void loopPutTrashInScreen(AnchorPane root, ImageView imgOne, ImageView imgTwo, ImageView imgThree) {

		action.putElementInScreen(root, imgOne);
		action.putElementInScreen(root, imgTwo);
		action.putElementInScreen(root, imgThree);

	}

	
	protected static void setScoreFinal() {
		scoreFinal = scoreFinal + 1;
	}

	public static int getScoreFinal() {
		return scoreFinal;
	}
}
