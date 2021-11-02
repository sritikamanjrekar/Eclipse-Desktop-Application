package Event;

import Main.GameManager;

public class Event01 {

	GameManager gm;

	public Event01(GameManager gm) {
		this.gm = gm;
	}

	public void lookHut() {
		gm.ui.messageText.setText("This is your house.");

	}

	public void talkHut() {
		gm.ui.messageText.setText("Who are you talking to?");

	}

	public void restHut() {
		if (gm.player.playerLife != gm.player.playerMaxLife) {
			gm.ui.messageText.setText("You rest at the house.\n(Your life has recovered)");
			gm.player.playerLife++;
			gm.player.updatePlayerStatus();
			gm.playSE(gm.healSound);
		} else {
			gm.ui.messageText.setText("Your Life is full.");
		}
	}

	public void lookGuard() {
		gm.ui.messageText.setText("A Guard is standing in front of you.");

	}

	public void talkGuard() {
		gm.ui.messageText
				.setText("Guard: Don't go any further without a weapon!\nYou should check the chest over there!");

		gm.playSE(gm.guard_01);
	}

	public void attackGuard() {
		if (gm.player.hasShield == 0) {
			if (gm.player.hasSword == 0) {
				if (gm.player.playerLife != 1) {
					gm.ui.messageText.setText("Guard: Hey, don't be stupid!\n(The guard hits you back and your life is deacreasing by 1");
					gm.player.playerLife--;
					//gm.player.updatePlayerStatus();
					gm.playSE(gm.guard_02);
					//gm.playSE(gm.hitSound);

				}
				else if(gm.player.playerLife==1) {
					gm.ui.messageText.setText("Guard: What the fool.");
					gm.player.playerLife--;
					gm.sChanger.showGameOverScreen(1);
					//gm.player.updatePlayerStatus();

				}
			}else if(gm.player.hasSword==1) {
				gm.ui.messageText.setText("Guard: Oh shit! \n(You have defeated the guard and gotten his shield!)");
				gm.player.hasShield=1;
				
				gm.playSE(gm.guard_03);
				//gm.playSE(gm.hitSound);	
			}
			gm.player.updatePlayerStatus();
		}else {
			gm.ui.messageText.setText("Guard: Just leave me alone.");
			gm.playSE(gm.guard_04);
		}

	}

	public void lookChest() {

		gm.ui.messageText.setText("A chest is on the ground.");

	}

	public void talkChest() {
		gm.ui.messageText.setText("You talk to the chest but it says nothing.");

	}

	public void openChest() {
		if (gm.player.hasSword == 0) {
			gm.ui.messageText.setText("You open the chest and find a sword!");
			gm.player.hasSword = 1;
			gm.player.updatePlayerStatus();
			//gm.playSE(gm.itemSound);
		} else {
			gm.ui.messageText.setText("There's nothing inside...");

		}
	}

}
