import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {

	static final int SCREEN_WIDTH = 600;
	static final int SCREEN_HEIGHT = 600;
	static final int UNIT_SIZE = 25; // how big the objects size will be
	static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE; // how many objects will fit on the screen
	static final int DELAY = 105; // delay timer
	final int x[] = new int[GAME_UNITS]; // these array going to hold all the coordinates for all the body parts of the
											// snake including head too
	final int y[] = new int[GAME_UNITS];
	int bodyParts = 6; // initial amount for the body number of part of the snake
	int applesEaten;
	int appleX; // apple x coordinate
	int appleY; // apple y coordinate
	char direction = 'R';// Right for R at start of the game
	boolean running = false;
	Timer timer;
	Random random;

	GamePanel() {
		random = new Random();
		// preferred size for game pannel
		this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));

		// background color of game pannel
		this.setBackground(Color.black);

		// Sets the focusable state of this Component to the specified value. Thisvalue
		// overrides the Component's default focusability.
		// Parameters:focusable indicates whether this Component is focusable
		this.setFocusable(true);

		this.addKeyListener(new MyKeyAdapter());
		startGame();

	}

	public void startGame() {
		newApple();
		running = true;

		/*
		 * Creates a Timer and initializes both the initial delay andbetween-event delay
		 * to delay milliseconds. If delayis less than or equal to zero, the timer fires
		 * as soon as itis started. If listener is not null,it's registered as an action
		 * listener on the timer. Parameters:delay milliseconds for the initial and
		 * between-event delaylistener an initial listener; can be null
		 */
		timer = new Timer(DELAY, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {

		if (running) {

			// draw grid lines

			/*
			 * for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) { // draw line on x axis
			 * and y axis g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
			 * g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
			 * 
			 * }
			 */
			
			// draw apple
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

			// draw head and body of the snake
			for (int i = 0; i < bodyParts; i++) {
				if (i == 0) {
					//g.setColor(Color.green);
					g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				} else {
					//g.setColor(new Color(45, 180, 0));
					// different green color
					g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);

				}
			}

			// game over text
			g.setColor(Color.red);
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten)) / 2,
					g.getFont().getSize());

		} else {

			gameOver(g);

		}

	}

	public void newApple() {
		appleX = random.nextInt((int) (SCREEN_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
		appleY = random.nextInt((int) (SCREEN_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;

	}

	public void move() {
		// move body parts of the snake
		for (int i = bodyParts; i > 0; i--) {
			// move the part by one
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}

		// switch the direction of the snake
		switch (direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;// it will go to next position

		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;

		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;

		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
	}

	public void checkApple() {
		if ((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}

	public void checkCollisions() {
		// checks if head collide with the body
		for (int i = bodyParts; i > 0; i--) {
			if ((x[0] == x[i]) && (y[0] == y[i])) {
				running = false;
			}
		}

		// checks if head touches left border
		if (x[0] < 0) {
			running = false;
		}
		// x horizontal
		// check if head touches right border
		if (x[0] > SCREEN_WIDTH) {
			running = false;
		}

		// check if head touches top border
		if (y[0] < 0) {
			running = false;
		}

		// check if head touches bottom border
		if (y[0] > SCREEN_HEIGHT) {
			running = false;
		}

		// stop timer
		if (!running) {
			timer.stop();
		}

	}

	public void gameOver(Graphics g) {

		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: " + applesEaten)) / 2,
				g.getFont().getSize());

		// game over text
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 75));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over")) / 2, SCREEN_HEIGHT / 2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();

	}

	// inner class
	public class MyKeyAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (direction != 'R') {
					direction = 'L';
				}
				break;

			case KeyEvent.VK_RIGHT:
				if (direction != 'L') {
					direction = 'R';
				}
				break;

			case KeyEvent.VK_DOWN:
				if (direction != 'U') {
					direction = 'D';
				}
				break;

			case KeyEvent.VK_UP:
				if (direction != 'D') {
					direction = 'U';
				}
				break;

			}
		}

	}

}
