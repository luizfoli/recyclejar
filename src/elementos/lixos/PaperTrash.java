package elementos.lixos;

import acoes.Action;
import elementos.latas.PaperTrashCan;
import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class PaperTrash extends CompositionTrashTypePattern implements TrashTypePattern {

	private Action action = new Action();
	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();
	
	private ImageView paperOne;
	private ImageView paperTwo;
	private ImageView paperThree;

	private PaperTrashCan paperTc = new PaperTrashCan();
	public static int paperScore = 0;

	@Override
	public ImageView trashOne() {
		paperOne = node.createImageView(var.get_trashPapel(), action.getRandomX(), action.getRandomY());
		return paperOne;
	}

	@Override
	public ImageView trashTwo() {
		paperTwo = node.createImageView(var.get_trashPapel(), action.getRandomX(), action.getRandomY());
		return paperTwo;
	}

	@Override
	public ImageView trashThree() {
		paperThree = node.createImageView(var.get_trashPapel(), action.getRandomX(), action.getRandomY());
		return paperThree;
	}

	@Override
	public void moveTrash() {
		super.moveTrash(paperOne, paperTwo, paperThree);
	}

	@Override
	public void addAll(AnchorPane root) {
		super.addAll(root, trashOne(), trashTwo(), trashThree());
	}

	@Override
	public void loopPutTrashInScreen(AnchorPane root) {
		super.loopPutTrashInScreen(root, paperOne, paperTwo, paperThree);
	}

	@Override
	public boolean condColission(AnchorPane root) {
		
		if (action.isCollision(paperTc.getCircleTrashCan(), paperOne)) {
			action.removeTrash(root, paperOne);
			paperScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(paperTc.getCircleTrashCan(), paperTwo)) {
			action.removeTrash(root, paperTwo);
			paperScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(paperTc.getCircleTrashCan(), paperThree)) {
			action.removeTrash(root, paperThree);
			paperScore += 1;
			setScoreFinal();
			return true;
		}
		
		return false;
	}

}
