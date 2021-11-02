package Main;

import java.net.URL;


import Event.Event01;
import Event.Event02;

public class GameManager {

	ActionHandler aHandler = new ActionHandler(this);
	public UI ui = new UI(this);

	public Player player = new Player(this);

	public SceneChanger sChanger = new SceneChanger(this);

	Music music = new Music();
	SE se = new SE();
	
	public Event01 ev1 = new Event01(this);
	public Event02 ev2 = new Event02(this);
	
	
	
	//SOUND
	public URL fieldMusic=getClass().getClassLoader().getResource("audio//bensound-acousticbreeze_1.wav");
	public URL fieldMusic2=getClass().getClassLoader().getResource("audio//bensound-ofeliasdream_1.wav");
	public URL guard_03=getClass().getClassLoader().getResource("audio//ohshit_1.wav");
	public URL guard_04=getClass().getClassLoader().getResource("audio//guard_04.wav");
	public URL guard_01=getClass().getClassLoader().getResource("audio//guard_01.wav");
	public URL guard_02=getClass().getClassLoader().getResource("audio//guard_02.wav");

	public URL awesome=getClass().getClassLoader().getResource("audio//awesome.wav");
	public URL epic=getClass().getClassLoader().getResource("audio//bensound-epic_1.wav");
	public URL healSound=getClass().getClassLoader().getResource("audio//healSound.wav");

	public URL currentMusic;
	
	public static void main(String[] args) {

		new GameManager();
	}

	
	
public GameManager() {
		
		currentMusic = fieldMusic;
		playMusic(currentMusic);
		
		player.setPlayerDefaultStatus();
		sChanger.showScene1();
	}
	
	public void playSE(URL url) {
		
		se.setFile(url);
		se.play(url);
	}
	public void playMusic(URL url) {
		
		music.setFile(url);
		music.play(url);
		music.loop(url);		
	}
	public void stopMusic(URL url) {
		
		music.stop(url);
	}

}
