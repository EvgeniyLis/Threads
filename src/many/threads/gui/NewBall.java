package many.threads.gui;

public class NewBall {
	
	public NewBall(int centerX, int centerY, int radius, int stepX, int stepY, int koefX, int koefY) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
		this.radius = radius;
		this.stepX = stepX;
		this.stepY = stepY;
		this.koefX = koefX;
		this.koefY = koefY;
	}

	private int centerX;
	private int centerY;
	private int radius;
	private int stepX;
	private int stepY;
	private int koefX;
	private int koefY; // -1, 1 - коэф. движения вправо, влево
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
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
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
	public int getkX() {
		return koefX;
	}
	public void setkX(int kX) {
		this.koefX = kX;
	}
	public int getkY() {
		return koefY;
	}
	public void setkY(int kY) {
		this.koefY = kY;
	}
	
	public int getXleftTopCorner() {
		return centerX - radius;
	}
	
	public int getYleftTopCorner() {
		return centerY - radius;
	}
	
	public int getDiametr() {
		return radius*2;
	}
	
	private int getDistance(NewBall ball) { // определение расстояния между шарами напанели
		int distanceX = Math.abs(this.centerX - ball.centerX);
		int distanceY = Math.abs(this.centerY - ball.centerY);
		return (int)Math.sqrt(distanceX*distanceX + distanceY*distanceY);
	}
	
	public boolean checDistance(NewBall ball) {
		int distance = getDistance(ball);
		return distance>(this.radius+ball.getRadius())?true:false; // проверка расстояния между шарами
	}
	
	public void invertX() { // меняет направление движения на противоположный при столкновении
		koefX = -koefX;
	}
	
	public void invertY() {
		koefY = -koefY;
	}
	
	public void changeX() { // приращение шага
		centerX+=stepX*koefX;
	}
	
	public void changeY() {
		centerY+=stepY*koefY;
	}
	
	public void checkCoefX(int panelX) {
		if (centerX<=radius || centerX+radius>=panelX) {
			invertX();
		}
	}
	
	public void checkCoefY(int panelY) {
		if (centerY<=radius || centerY+radius>=panelY) {
			invertY();
		}
	}
}
