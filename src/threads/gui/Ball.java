package threads.gui;

public class Ball {
	
	private int centerX;
	private int centerY;
	private int diameter;
	private int stepX;
	private int stepY;
	
	public int getCenterX() {
		return centerX;
	}

	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	public int getCenterY() {
		return centerY;
	}

	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	public int getStepX() {
		return stepX;
	}

	public void setStepX(int stepX) {
		this.stepX = stepX;
	}

	public int getStepY() {
		return stepY;
	}

	public void setStepY(int stepY) {
		this.stepY = stepY;
	}

	public Ball(int centerX, int centerY, int diameter) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
		this.diameter = diameter;
	}
	
	
	
	
	
	

}
