package acoes;

import java.util.Random;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe responsável por gerar localizações de forma aleatória.
 *
 */

public class RandomLocation extends MouseAction {

	private static Random random = new Random();

	public int getRandomX() {
		return random.nextInt(500) + 50;
	}

	public int getRandomY() {
		return random.nextInt(350) + 10;
	}
}
