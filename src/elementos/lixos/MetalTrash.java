package elementos.lixos;

import acoes.Action;
import elementos.latas.MetalTrashCan;
import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MetalTrash extends CompositionTrashTypePattern implements TrashTypePattern {

	private Action action = new Action();
	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private ImageView metalOne;
	private ImageView metalTwo;
	private ImageView metalThree;

	private MetalTrashCan metalTc = new MetalTrashCan();
	public static int metalScore = 0;

	@Override
	public ImageView trashOne() {
		metalOne = node.createImageView(var.get_trashMetal(), action.getRandomX(), action.getRandomY());
		return metalOne;
	}

	@Override
	public ImageView trashTwo() {
		metalTwo = node.createImageView(var.get_trashMetal(), action.getRandomX(), action.getRandomY());
		return metalTwo;
	}

	@Override
	public ImageView trashThree() {
		metalThree = node.createImageView(var.get_trashMetal(), action.getRandomX(), action.getRandomY());
		return metalThree;
	}

	@Override
	public void moveTrash() {
		super.moveTrash(metalOne, metalTwo, metalThree);
	}

	@Override
	public void addAll(AnchorPane root) {
		super.addAll(root, trashOne(), trashTwo(), trashThree());
	}

	@Override
	public void loopPutTrashInScreen(AnchorPane root) {
		super.loopPutTrashInScreen(root, metalOne, metalTwo, metalThree);
	}

	@Override
	public boolean condColission(AnchorPane root) {

		if (action.isCollision(metalTc.getCircleTrashCan(), metalOne)) {
			action.removeTrash(root, metalOne);
			metalScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(metalTc.getCircleTrashCan(), metalTwo)) {
			action.removeTrash(root, metalTwo);
			metalScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(metalTc.getCircleTrashCan(), metalThree)) {
			action.removeTrash(root, metalThree);
			metalScore += 1;
			setScoreFinal();
			return true;
		}

		return false;
	}
}
