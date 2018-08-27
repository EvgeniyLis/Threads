package many.threads.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainApp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainApp window = new MainApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		NewBall[] ballsArray = new NewBall[5];
		ballsArray[0] = new NewBall(100, 100, 10, 1, 1, +1, -1);
		ballsArray[1] = new NewBall(40, 40, 15, 1, 1, -1, -1);
		ballsArray[2] = new NewBall(160, 160, 10, 1, 1, -1, +1);
		ballsArray[3] = new NewBall(180, 180, 15, 1, 1, +1, +1);
		ballsArray[4] = new NewBall(20, 20, 10, 1, 1, -1, +1);
		PanelForBalls panelForBalls = new PanelForBalls(ballsArray);
		panelForBalls.setBounds(0, 0, 400, 250);
		frame.getContentPane().add(panelForBalls);
		BallThread[] ballThreads = new BallThread[5];
		for (int i = 0; i < ballThreads.length; i++) {
			ballThreads[i] = new BallThread(panelForBalls, i);
			ballThreads[i].start();
		}
	}
}
