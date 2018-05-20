package elementos.latas;

import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class PaperTrashCan extends CompositionTrashCanPattern implements TrashCanPattern {

	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private ImageView paperTrashCan;
	private Circle circlePaper;

	@Override
	public ImageView getIconTrashCan() {
		paperTrashCan = node.createImageView(var.get_trashCanPapel());
		paperTrashCan.setLayoutX(var.get_trashCanPapelLayX());
		paperTrashCan.setLayoutY(var.get_trashCanPapelLayY());
		return paperTrashCan;
	}

	@Override
	public Circle getCircleTrashCan() {
		circlePaper = node.createCircle(490, 500);
		return circlePaper;
	}

	
	@Override
	public void addAll(AnchorPane root) {
		super.addInPane(root, getIconTrashCan(), getCircleTrashCan());
	}

}
