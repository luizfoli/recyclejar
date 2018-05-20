package elementos.latas;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class CompositionTrashCanPattern {


	public void addInPane(AnchorPane root, ImageView img, Circle circle) {
		root.getChildren().add(img);
		root.getChildren().add(circle);
	}
	
}
