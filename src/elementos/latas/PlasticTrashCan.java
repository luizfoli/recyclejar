package elementos.latas;

import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class PlasticTrashCan extends CompositionTrashCanPattern implements TrashCanPattern {

	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private ImageView plasticTrashCan;
	private Circle plasticCircle;

	@Override
	public ImageView getIconTrashCan() {
		plasticTrashCan = node.createImageView(var.get_trashCanPlastico());
		plasticTrashCan.setLayoutX(320);
		plasticTrashCan.setLayoutY(420);
		return plasticTrashCan;
	}

	@Override
	public Circle getCircleTrashCan() {
		plasticCircle = node.createCircle(350, 490);
		return plasticCircle;
	}

	
	@Override
	public void addAll(AnchorPane root) {
		super.addInPane(root, getIconTrashCan(), getCircleTrashCan());
	}

}
