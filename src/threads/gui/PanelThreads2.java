package threads.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelThreads2 extends JPanel {
	
	private Ball ball2;

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
		gr.fillOval(ball2.getCenterX()-(ball2.getDiameter()/2), ball2.getCenterY()-(getHeight()-ball2.getDiameter()/2), ball2.getDiameter(), ball2.getDiameter());
		
	}

	/**
	 * Create the panel.
	 */
	public PanelThreads2() {
		ball2 = new Ball(100, 100, 30);
		ball2.setStepX(2);
		ball2.setStepY(2);
	}
	
	private void incCordBall() {
		ball2.setCenterX(ball2.getCenterX()+ball2.getStepX());
		ball2.setCenterY(ball2.getCenterY()+ball2.getStepY());
	}
	
	private void invStep() {
		if (ball2.getCenterX() < ball2.getDiameter()/2 || ball2.getCenterX() > getWidth()-ball2.getDiameter()/2) {
			ball2.setStepX(-ball2.getStepX());
		}
		if (ball2.getCenterY() < ball2.getDiameter()/2 || ball2.getCenterY() > getHeight()-ball2.getDiameter()/2) {
			ball2.setStepY(-ball2.getStepY());
		}
	}

}
