package elementos.nodes;

import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * 
 * @author Luiz Felipe Oliveira
 *
 *         Classe responsável pelo metodos que criam os objetos da tela, todos
 *         são do tipo Node.
 *
 */

public class CreateNodes {

	// Metodo que cria um node do tipo ImageView
	public ImageView createImageView(String nome_img) {
		ImageView img = new ImageView(nome_img);
		return img;
	}

	// Sobrecarga do metodo de criar imagem, para passa a posição dos lixos
	public ImageView createImageView(String nome_img, int x, int y) {
		ImageView img = new ImageView(nome_img);
		img.setTranslateX(x);
		img.setTranslateY(y);
		img.setCursor(Cursor.HAND);
		return img;
	}

	// Metodo que cria um node do tipo Circle
	public Circle createCircle(int x, int y) {
		Circle cir = new Circle(80.0f, Color.GREEN);
		cir.setCenterX(x);
		cir.setCenterY(y);
		cir.setVisible(false);
		return cir;
	}

	// Metodo que cria um node do tipo Button
	public Button createButton(String texto, int x, int y) {
		Button btn = new Button(texto);
		btn.setTranslateX(x);
		btn.setTranslateY(y);
		return btn;
	}

	// Metodo que cria um node do tipo Label
	public Label createLabel(String texto) {
		Label lb = new Label(texto);
		return lb;
	}
}
