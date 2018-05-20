package elementos.latas;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public interface TrashCanPattern {

	ImageView getIconTrashCan();
	
	Circle getCircleTrashCan();
	
	void addAll(AnchorPane root);
	
}



