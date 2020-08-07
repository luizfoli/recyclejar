package screen;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import elementos.latas.GlassTrashCan;
import elementos.latas.MetalTrashCan;
import elementos.latas.PaperTrashCan;
import elementos.latas.PlasticTrashCan;
import elementos.lixos.CompositionTrashTypePattern;
import elementos.lixos.GlassTrash;
import elementos.lixos.MetalTrash;
import elementos.lixos.PaperTrash;
import elementos.lixos.PlasticTrash;
import elementos.nodes.ButtonGame;
import javafx.animation.AnimationTimer;
import javafx.animation.PauseTransition;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;

public class ExecutionGame {

	private AnchorPane root;
	private Scene scene;

	private AnimationTimer execution;

	private static int seconds = 16;

	Canvas canvas = new Canvas(400, 150);
	final GraphicsContext gc = canvas.getGraphicsContext2D();
	Font theFont = Font.font("Helvetica", FontWeight.BOLD, 24);

	public ExecutionGame() {
		root();
	}

	PaperTrashCan paperTc = new PaperTrashCan();
	PlasticTrashCan plasticTc = new PlasticTrashCan();
	GlassTrashCan glassTc = new GlassTrashCan();
	MetalTrashCan metalTc = new MetalTrashCan();

	PaperTrash paperTrash = new PaperTrash();
	PlasticTrash plasticTrash = new PlasticTrash();
	GlassTrash glassTrash = new GlassTrash();
	MetalTrash metalTrash = new MetalTrash();

	public AnchorPane root() {

		root = new AnchorPane();
		canvas.getStyleClass().add("canvas");

		gc.setFont(theFont);
		gc.setStroke(Color.WHITE);
		gc.setLineWidth(1);

		root.getChildren().add(canvas);

		paperTc.addAll(root);
		plasticTc.addAll(root);
		glassTc.addAll(root);
		metalTc.addAll(root);

		paperTrash.addAll(root);
		paperTrash.moveTrash();

		plasticTrash.addAll(root);
		plasticTrash.moveTrash();

		glassTrash.addAll(root);
		glassTrash.moveTrash();

		metalTrash.addAll(root);
		metalTrash.moveTrash();

		getExecution().start();

		return root;
	}

	public Scene gameScene() {
		scene = new Scene(root(), 600, 600);
		scene.getStylesheets().add(getClass().getResource("styleGame.css").toExternalForm());
		return scene;
	}

	public void writeCountScoreInScreen() {

		gc.setFill(javafx.scene.paint.Color.WHITE);
		gc.fillRect(0, 0, 170, 550);

		String timeText = "Tempo: " + seconds;
		gc.setFill(Color.DARKBLUE);
		gc.fillText(timeText, 10, 150);

		String paperScoreText = "Papel: " + PaperTrash.paperScore;
		gc.setFill(Color.DARKBLUE);
		gc.fillText(paperScoreText, 10, 30);

		String plasticScoreText = "Plastico: " + PlasticTrash.plasticScore;
		gc.setFill(Color.DARKRED);
		gc.fillText(plasticScoreText, 10, 60);

		String glassScoreText = "Vidro: " + GlassTrash.glassScore;
		gc.setFill(Color.DARKGREEN);
		gc.fillText(glassScoreText, 10, 90);

		String metalScoreText = "Metal: " + MetalTrash.metalScore;
		gc.setFill(Color.YELLOW);
		gc.fillText(metalScoreText, 10, 120);
	}

	public AnimationTimer getExecution() {

		execution = new AnimationTimer() {

			@Override
			public void handle(long now) {

				if (ButtonGame.cond) {

					PauseTransition delay = new PauseTransition(Duration.seconds(17));
					delay.play();

					// Escreve os placares de pontos na tela
					writeCountScoreInScreen();

					// Verifica se houve alguma coliss�o entre as latas de lixos e os lixos
					paperTrash.condColission(root);
					plasticTrash.condColission(root);
					glassTrash.condColission(root);
					metalTrash.condColission(root);

					// Adiciona os lixos na tela
					paperTrash.loopPutTrashInScreen(root);
					plasticTrash.loopPutTrashInScreen(root);
					glassTrash.loopPutTrashInScreen(root);
					metalTrash.loopPutTrashInScreen(root);

				}
			}

		};

		return execution;
	}

	public static void countSeconds() {

		ScheduledExecutorService countSeconds = Executors.newScheduledThreadPool(1);
		countSeconds.scheduleAtFixedRate(() -> {
			
			if(seconds > 0) {
				seconds -= 1;
				return;
			}
			
			JOptionPane.showMessageDialog(null,
					"ACABOU O TEMPO!!!\nYour score: " + CompositionTrashTypePattern.getScoreFinal());
			System.exit(0);
			
		}, 1, 1, TimeUnit.SECONDS);
	}
}
