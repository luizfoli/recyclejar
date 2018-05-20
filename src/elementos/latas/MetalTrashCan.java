package elementos.latas;

import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class MetalTrashCan extends CompositionTrashCanPattern implements TrashCanPattern {

	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private ImageView metalTrashCan;
	private Circle metalCircle;

	@Override
	public ImageView getIconTrashCan() {
		metalTrashCan = node.createImageView(var.get_trashCanMetal());
		metalTrashCan.setLayoutX(40);
		metalTrashCan.setLayoutY(420);
		return metalTrashCan;
	}

	@Override
	public Circle getCircleTrashCan() {
		metalCircle = node.createCircle(70, 500);
		return metalCircle;
	}

	@Override
	public void addAll(AnchorPane root) {
		super.addInPane(root, getIconTrashCan(), getCircleTrashCan());
	}

}
