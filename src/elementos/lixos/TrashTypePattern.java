package elementos.lixos;

import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public interface TrashTypePattern {

	ImageView trashOne();
	
	ImageView trashTwo();
	
	ImageView trashThree();
	
	void moveTrash();

	void addAll(AnchorPane root);
	
	void loopPutTrashInScreen(AnchorPane root);
	
	boolean condColission(AnchorPane root);

}


