package Main;

public class Player {
	GameManager gm;

	public int playerMaxLife;
	public int playerLife;

	public int hasSword;
	public int hasShield;
	public int hasLatern;

	public Player(GameManager gm) {
		this.gm = gm;
	}

	public void setPlayerDefaultStatus() {
		playerMaxLife = 5;
		playerLife = 3;
		hasSword = 0;
		hasShield = 0;
		hasLatern = 0;
		updatePlayerStatus();
	}

	public void updatePlayerStatus() {
		// REMOVE ALL LIFE ICONS
		int i = 1;
		while (i < 6) {
			gm.ui.lifeLabel[i].setVisible(false);
			i++;
		}

		int lifeCount = playerLife;
		while (lifeCount != 0) {
			gm.ui.lifeLabel[lifeCount].setVisible(true);
			lifeCount--;
		}

		// CHECK PLAYER ITEMS
		if (hasSword == 0) {
			gm.ui.swordLabel.setVisible(false);
		}
		if (hasSword == 1) {
			gm.ui.swordLabel.setVisible(true);
		}
		if (hasShield == 0) {
			gm.ui.shieldLabel.setVisible(false);
		}
		if (hasShield == 1) {
			gm.ui.shieldLabel.setVisible(true);
		}
		if (hasLatern == 0) {
			gm.ui.laternLabel.setVisible(false);
		}
		if (hasLatern == 1) {
			gm.ui.laternLabel.setVisible(true);
		}

	}
}
