package elementos.nodes;

/*
 * Classe responsável por armezar as variaveis das classes do package elemenst
 * */

public class VarElements {

	/***************************************************/
	/******************** VARIAVEIS ********************/

	// Latas de Lixo
	private static final String _TRASH_CAN_PAPEL = "rec_papel.png";
	private static final String _TRASH_CAN_PLASTICO = "rec_plastico.png";
	private static final String _TRASH_CAN_VIDRO = "rec_vidro.png";
	private static final String _TRASH_CAN_METAL = "rec_metal.png";
	
	// X, Y Layout latas de lixo
	private static final int _TRASH_CAN_PAPEL_LAY_X = 460;
	private static final int _TRASH_CAN_PAPEL_LAY_Y = 420;
	
	// Lixos
	private static final String _TRASH_PAPEL = "trash_papel.png";
	private static final String _TRASH_PLASTICO = "trash_plastico.png";
	private static final String _TRASH_VIDRO = "trash_vidro.png";
	private static final String _TRASH_METAL = "trash_metal.png";
	
	// Botões
	private static final String _TEXT_BUTTON_START = "START GAME";
	private static final String _TEXT_BUTTON_EXIT = "         EXIT        ";
	
	// Labels
	private static final String _TEXT_LABEL_TITLE_GAME = "RECICLE!";
	private static final String _TEXT_LABEL_SUB_TITLE_GAME = "RECICLE O MÁXIMO QUE CONSEGUIR";

	/***************************************************/
	/***************************************************/

	/***************************************************/
	/******************** GETTERS **********************/

	/***** LATAS DE LIXO *****/
	
	public String get_trashCanPapel() {
		return _TRASH_CAN_PAPEL;
	}

	public String get_trashCanPlastico() {
		return _TRASH_CAN_PLASTICO;
	}

	public String get_trashCanMetal() {
		return _TRASH_CAN_METAL;
	}

	public String get_trashCanVidro() {
		return _TRASH_CAN_VIDRO;
	}

	public int get_trashCanPapelLayX() {
		return _TRASH_CAN_PAPEL_LAY_X;
	}
	
	public int get_trashCanPapelLayY() {
		return _TRASH_CAN_PAPEL_LAY_Y;
	}
	
	/*************************/
	
	public String get_trashPapel() {
		return _TRASH_PAPEL;
	}

	public String get_trashPlastico() {
		return _TRASH_PLASTICO;
	}

	public String get_trashVidro() {
		return _TRASH_VIDRO;
	}
	
	public String get_trashMetal() {
		return _TRASH_METAL;
	}
	
	
	// Butões
	
	public String get_textButtonStart() {
		return _TEXT_BUTTON_START;
	}
	
	public String get_textButtonExit() {
		return _TEXT_BUTTON_EXIT;
	}
	
	// Labels 
	
	public String get_textLabelTitleGame() {
		return _TEXT_LABEL_TITLE_GAME;
	}
	
	public String get_textLabelSubTitleGame() {
		return _TEXT_LABEL_SUB_TITLE_GAME;
	}
	
	/***************************************************/
	/***************************************************/
}
