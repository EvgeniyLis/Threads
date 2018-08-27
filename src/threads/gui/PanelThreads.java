package threads.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelThreads extends JPanel {
	
	private Ball ball;
	private Ball ball2;

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	public Ball getBall2() {
		return ball2;
	}

	public void setBall2(Ball ball2) {
		this.ball2 = ball2;
	}

	@Override
	protected void paintComponent(Graphics gr) { // этот метод вызывается каждый раз при обновлении панели
		incCordBall();
		invStep();
		gr.setColor(Color.ORANGE);
		gr.fillRect(0, 0, this.getWidth(), this.getHeight());
		gr.setColor(Color.BLACK);
		gr.fillOval(ball.getCenterX()-(ball.getDiameter()/2), ball.getCenterY()-(ball.getDiameter()/2), ball.getDiameter(), ball.getDiameter());
		
	}

	/**
	 * Create the panel.
	 */
	public PanelThreads() {
		ball = new Ball(100, 100, 30);
		ball.setStepX(2);
		ball.setStepY(2);
	}
	
	private void incCordBall() {
		ball.setCenterX(ball.getCenterX()+ball.getStepX());
		ball.setCenterY(ball.getCenterY()+ball.getStepY());
	}
	
	private void invStep() {
		if (ball.getCenterX() < ball.getDiameter()/2 || ball.getCenterX() > getWidth()-ball.getDiameter()/2) {
			ball.setStepX(-ball.getStepX());
		}
		if (ball.getCenterY() < ball.getDiameter()/2 || ball.getCenterY() > getHeight()-ball.getDiameter()/2) {
			ball.setStepY(-ball.getStepY());
		}
	}

}
