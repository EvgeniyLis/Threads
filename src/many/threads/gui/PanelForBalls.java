package many.threads.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelForBalls extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NewBall[] balls;
	

	public NewBall[] getBalls() {
		return balls;
	}


	/**
	 * Create the panel.
	 */
	public PanelForBalls(NewBall[] balls) {
		this.balls=balls;
	}


	@Override
	protected void paintComponent(Graphics gr) {
		gr.setColor(Color.ORANGE);
		gr.fillRect(0, 0, this.getWidth(), this.getHeight());
		for (NewBall ball : balls) {
			gr.setColor(Color.BLACK);
			gr.fillOval(ball.getCenterX(), ball.getCenterY(), ball.getDiametr(), ball.getDiametr());
		}
	}
	
	

}
