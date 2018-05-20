package elementos.lixos;

import acoes.Action;
import elementos.latas.PlasticTrashCan;
import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PlasticTrash extends CompositionTrashTypePattern implements TrashTypePattern {

	private Action action = new Action();
	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private ImageView plasticOne;
	private ImageView plasticTwo;
	private ImageView plasticThree;

	private PlasticTrashCan plasticTc = new PlasticTrashCan();
	public static int plasticScore = 0;

	@Override
	public ImageView trashOne() {
		plasticOne = node.createImageView(var.get_trashPlastico(), action.getRandomX(), action.getRandomY());
		return plasticOne;
	}

	@Override
	public ImageView trashTwo() {
		plasticTwo = node.createImageView(var.get_trashPlastico(), action.getRandomX(), action.getRandomY());
		return plasticTwo;
	}

	@Override
	public ImageView trashThree() {
		plasticThree = node.createImageView(var.get_trashPlastico(), action.getRandomX(), action.getRandomY());
		return plasticThree;
	}

	@Override
	public void moveTrash() {
		super.moveTrash(plasticOne, plasticTwo, plasticThree);
	}

	@Override
	public void addAll(AnchorPane root) {
		super.addAll(root, trashOne(), trashTwo(), trashThree());
	}

	@Override
	public void loopPutTrashInScreen(AnchorPane root) {
		super.loopPutTrashInScreen(root, plasticOne, plasticTwo, plasticThree);
	}

	@Override
	public boolean condColission(AnchorPane root) {

		if (action.isCollision(plasticTc.getCircleTrashCan(), plasticOne)) {
			action.removeTrash(root, plasticOne);
			plasticScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(plasticTc.getCircleTrashCan(), plasticTwo)) {
			action.removeTrash(root, plasticTwo);
			plasticScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(plasticTc.getCircleTrashCan(), plasticThree)) {
			action.removeTrash(root, plasticThree);
			plasticScore += 1;
			setScoreFinal();
			return true;
		}

		return false;
	}	
}
