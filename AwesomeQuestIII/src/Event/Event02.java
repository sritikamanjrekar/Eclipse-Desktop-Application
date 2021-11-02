package Event;

import Main.GameManager;

public class Event02 {
	public GameManager gm;

	public Event02(GameManager gm) {
		this.gm = gm;
	}

	public void lookCave() {
		gm.ui.messageText.setText("It's a cave!");
	}

	public void talkCave() {
		gm.ui.messageText.setText("You hear the echo of your voice.");
	}

	public void enterCave() {
		if(gm.player.hasLatern==0) {
			gm.ui.messageText.setText("It's too dark to enter.");
		}else {
			gm.sChanger.showScene3();
		}
	}

	public void lookRoot() {
		gm.ui.messageText.setText("This is a large tree.");
	}

	public void talkRoot() {
		gm.ui.messageText.setText("They say plant grows well if you talk to but this tree doesn't look like it needs encouragement.");
	}

	public void searchRoot() {
		if(gm.player.hasLatern==0) {
			gm.ui.messageText.setText("You find a latern!");
			gm.player.hasLatern=1;
			gm.player.updatePlayerStatus();
			//gm.playSE(gm.itemSound);

		}else {
			gm.ui.messageText.setText("You didn't find anything.");
		}
	}
}
