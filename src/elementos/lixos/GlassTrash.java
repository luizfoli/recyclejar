package elementos.lixos;

import acoes.Action;
import elementos.latas.GlassTrashCan;
import elementos.nodes.CreateNodes;
import elementos.nodes.VarElements;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class GlassTrash extends CompositionTrashTypePattern implements TrashTypePattern {

	// Instância das classes necessárias
	private Action action = new Action();
	private CreateNodes node = new CreateNodes();
	private VarElements var = new VarElements();

	private ImageView glassOne;
	private ImageView glassTwo;
	private ImageView glassThree;

	private GlassTrashCan glassTc = new GlassTrashCan();
	public static int glassScore = 0;

	@Override
	public ImageView trashOne() {
		glassOne = node.createImageView(var.get_trashVidro(), action.getRandomX(), action.getRandomY());
		return glassOne;
	}

	@Override
	public ImageView trashTwo() {
		glassTwo = node.createImageView(var.get_trashVidro(), action.getRandomX(), action.getRandomY());
		return glassTwo;
	} 

	@Override
	public ImageView trashThree() {
		glassThree = node.createImageView(var.get_trashVidro(), action.getRandomX(), action.getRandomY());
		return glassThree;
	}

	@Override
	public void moveTrash() {
		super.moveTrash(glassOne, glassTwo, glassThree);
	}

	@Override
	public void addAll(AnchorPane root) {
		super.addAll(root, trashOne(), trashTwo(), trashThree());
	}

	@Override
	public void loopPutTrashInScreen(AnchorPane root) {
		super.loopPutTrashInScreen(root, glassOne, glassTwo, glassThree);
	}

	@Override
	public boolean condColission(AnchorPane root) {

		if (action.isCollision(glassTc.getCircleTrashCan(), glassOne)) {
			action.removeTrash(root, glassOne);
			glassScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(glassTc.getCircleTrashCan(), glassTwo)) {
			action.removeTrash(root, glassTwo);
			glassScore += 1;
			setScoreFinal();
			return true;
		}

		else if (action.isCollision(glassTc.getCircleTrashCan(), glassThree)) {
			action.removeTrash(root, glassThree);
			glassScore += 1;
			setScoreFinal();
			return true;
		}

		return false;
	}
}
