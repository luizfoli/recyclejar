package elementos.latas;

import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class GlassTrashCan extends CompositionTrashCanPattern implements TrashCanPattern {

	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();
	
	private ImageView glassTrashCan;
	private Circle glassCircle;
	
	@Override
	public ImageView getIconTrashCan() {
		glassTrashCan = node.createImageView(var.get_trashCanVidro());
		glassTrashCan.setLayoutX(180);
		glassTrashCan.setLayoutY(420);
		return glassTrashCan;
	}

	@Override
	public Circle getCircleTrashCan() {
		glassCircle = node.createCircle(230, 500);
		return glassCircle;
	}

	@Override
	public void addAll(AnchorPane root) {
		super.addInPane(root, getIconTrashCan(), getCircleTrashCan());
	}

}
