package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class UI {
	JFrame window;
	GameManager gm;
	public JTextArea messageText;

	// for multiple background images
	public JPanel bgPanel[] = new JPanel[10];// 10 background images
	public JLabel bgLabel[] = new JLabel[10];

	// PLAYER UI
	JPanel lifePanel;
	JLabel lifeLabel[] = new JLabel[6];
	JPanel inventoryPanel;
	public JLabel swordLabel, shieldLabel, laternLabel;
	
	//GAME OVER UI
	public JLabel titleLabel;
	public JButton restartButton;
	

	public UI(GameManager gm) {
		this.gm = gm;

		createMainField();
		createPlayerField();
		createGameOverField();
		generateScene();

		window.setVisible(true);
	}

	public void createGameOverField() {
		titleLabel=new JLabel("",JLabel.CENTER);
		titleLabel.setBounds(200,150,400,200);
		titleLabel.setForeground(Color.red);
		titleLabel.setFont(new Font("Times New Roman",Font.PLAIN,70));
		titleLabel.setVisible(false);
		window.add(titleLabel);
		
		restartButton=new JButton();
		restartButton.setBounds(340,320,120,50);
		restartButton.setBorder(null);
		restartButton.setBackground(null);
		restartButton.setForeground(Color.white);
		restartButton.setFocusPainted(false);
		restartButton.addActionListener(gm.aHandler);
		restartButton.setActionCommand("restart");
		restartButton.setVisible(false);
		window.add(restartButton);
		
	}

	public void createPlayerField() {
		lifePanel = new JPanel();
		lifePanel.setBounds(50, 0, 250, 50);
		lifePanel.setBackground(Color.black);
		lifePanel.setLayout(new GridLayout(1, 5));
		window.add(lifePanel);

		ImageIcon lifeIcon = new ImageIcon(getClass().getClassLoader().getResource("hearts.png"));
		Image image = lifeIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);

		lifeIcon = new ImageIcon(image);

		int i = 1;
		while (i < 6) {
			lifeLabel[i] = new JLabel();
			lifeLabel[i].setIcon(lifeIcon);
			lifePanel.add(lifeLabel[i]);
			i++;
		}

		inventoryPanel = new JPanel();
		inventoryPanel.setBounds(650, 0, 100, 50);
		inventoryPanel.setBackground(Color.black);
		inventoryPanel.setLayout(new GridLayout(1, 3));
		window.add(inventoryPanel);

		// CREATE ITEMS
		swordLabel = new JLabel();
		ImageIcon swordIcon = new ImageIcon(getClass().getClassLoader().getResource("plain-dagger.png"));
		image = swordIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		swordIcon = new ImageIcon(image);
		swordLabel.setIcon(swordIcon);
		inventoryPanel.add(swordLabel);

		shieldLabel = new JLabel();
		ImageIcon shieldIcon = new ImageIcon(getClass().getClassLoader().getResource("dragon-shield.png"));
		image = shieldIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		shieldIcon = new ImageIcon(image);
		shieldLabel.setIcon(shieldIcon);
		inventoryPanel.add(shieldLabel);

		laternLabel = new JLabel();
		ImageIcon laternIcon = new ImageIcon(getClass().getClassLoader().getResource("lantern-flame.png"));
		image = laternIcon.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT);
		laternIcon = new ImageIcon(image);
		laternLabel.setIcon(laternIcon);
		inventoryPanel.add(laternLabel);
	}

	public void createMainField() {

		window = new JFrame("AWESOME QUEST III");
		window.setSize(800, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);

		messageText = new JTextArea("this is sample text......");
		messageText.setBounds(50, 410, 700, 150);
		messageText.setBackground(Color.black);
		messageText.setForeground(Color.white);
		messageText.setEditable(false);
		// breaks the line
		messageText.setLineWrap(true);
		messageText.setWrapStyleWord(true);
		messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 26));
		window.add(messageText);
	}

	public void createBackground(int bgNum, String bgFileName) {
		bgPanel[bgNum] = new JPanel();
		bgPanel[bgNum].setBounds(50, 50, 700, 350);
		bgPanel[bgNum].setBackground(Color.blue);
		bgPanel[bgNum].setLayout(null);
		bgPanel[bgNum].setVisible(false);
		window.add(bgPanel[bgNum]);

		bgLabel[bgNum] = new JLabel();
		bgLabel[bgNum].setBounds(0, 0, 700, 350);

		ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
		bgLabel[bgNum].setIcon(bgIcon);

	}

	public void createObject(int bgNum, int objx, int objy, int objWidth, int objHeight, String objFileName,
			String choice1Name, String choice2Name, String choice3Name, String choice1Command, String choice2Command,
			String choice3Command) {

		// CREATE POP UP MENU
		JPopupMenu popMenu = new JPopupMenu();

		// CREATE POP UP MENU ITEMS
		JMenuItem menuItem[] = new JMenuItem[4];

		menuItem[1] = new JMenuItem(choice1Name);
		menuItem[1].addActionListener(gm.aHandler);
		menuItem[1].setActionCommand(choice1Command);
		popMenu.add(menuItem[1]);

		menuItem[2] = new JMenuItem(choice2Name);
		menuItem[2].addActionListener(gm.aHandler);
		menuItem[2].setActionCommand(choice2Command);
		popMenu.add(menuItem[2]);

		menuItem[3] = new JMenuItem(choice3Name);
		menuItem[3].addActionListener(gm.aHandler);
		menuItem[3].setActionCommand(choice3Command);
		popMenu.add(menuItem[3]);

		JLabel objectLabel = new JLabel();
		// objectLabel.setBounds(420,140,200,200);
		// CREATE OBJECTS
		objectLabel.setBounds(objx, objy, objWidth, objHeight);

//		objectLabel.setOpaque(true);
//		objectLabel.setBackground(Color.BLUE);

		ImageIcon objectIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
		objectLabel.setIcon(objectIcon);

		objectLabel.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
			}

			public void mousePressed(MouseEvent e) {

				if (SwingUtilities.isRightMouseButton(e)) {
					popMenu.show(objectLabel, e.getX(), e.getY());
				}

			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

		});

		bgPanel[bgNum].add(objectLabel);

	}

	public void createArrowButton(int bgNum, int x, int y, int width, int height, String arrowFileName,
			String command) {
		ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(arrowFileName));

		JButton arrowButton = new JButton();
		arrowButton.setBounds(x, y, width, height);
		arrowButton.setBackground(null);
		arrowButton.setContentAreaFilled(false);
		arrowButton.setFocusPainted(false);
		arrowButton.setIcon(arrowIcon);
		arrowButton.addActionListener(gm.aHandler);
		arrowButton.setActionCommand(command);
		arrowButton.setBorderPainted(false);

		bgPanel[bgNum].add(arrowButton);
	}

	public void generateScene() {
		// scene 1
		createBackground(1, "greenbg.jpg");
		createObject(1, 440, 140, 200, 200, "hut.png", "Look", "Talk", "Rest", "lookHut", "talkHut", "restHut");
		createObject(1, 100, 180, 150, 150, "guard.png", "Look", "Talk", "Attack", "lookGuard", "talkGuard",
				"attackGuard");
		createObject(1, 350, 260, 70, 70, "chest.png", "Look", "Talk", "Open", "lookChest", "talkChest", "openChest");
		createArrowButton(1, 0, 150, 50, 50, "arrow left.png", "goScene2");
		bgPanel[1].add(bgLabel[1]);

		// scene 2
		createBackground(2, "cave2.jpg");
		createObject(2, 0, 100, 100, 300, "blank.png", "Look", "Talk", "Enter", "lookCave", "talkCave", "enterCave");
		createObject(2, 355, 250, 50, 50, "blank.png", "Look", "Talk", "Search", "lookRoot", "talkRoot", "searchRoot");
		createArrowButton(2, 650, 150, 50, 50, "arrow right.png", "goScene1");
		bgPanel[2].add(bgLabel[2]);

		// scene 2
		createBackground(3, "cave1.png");
		createArrowButton(3, 650, 150, 50, 50, "arrow right.png", "goScene2");
		bgPanel[3].add(bgLabel[3]);

	}

}
