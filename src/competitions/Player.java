package competitions;

public class Player {
	
	private String name;
	private double currentDistance;
	private double finishDistance;
	private double stepDistance;
	private int sleepInterval;
	private String startMessage;
	private String currentMessage; 
	
	public Player(String name, double currentDistance, double finishDistance, double stepDistance) {
		this.name = name;
		this.currentDistance = currentDistance;
		this.finishDistance = finishDistance;
		this.stepDistance = stepDistance;
		startMessage = name+" has started";
		currentMessage = name+" ran ";
	}
	
	public String getStartMessage() {
		return startMessage;
	}

	public String getCurrentMessage() {
		return currentMessage;
	}
	
	public double getSleepInterval() {
		return sleepInterval;
	}

	public void setSleepInterval(int sleepInterval) {
		this.sleepInterval = sleepInterval;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCurrentDistance() {
		return currentDistance;
	}

	public void setCurrentDistance(double currentDistance) {
		this.currentDistance = currentDistance;
	}

	public double getFinishDistance() {
		return finishDistance;
	}

	public void setFinishDistance(double finishDistance) {
		this.finishDistance = finishDistance;
	}

	public double getStepDistance() {
		return stepDistance;
	}

	public void setStepDistance(double stepDistance) {
		this.stepDistance = stepDistance;
	}

	@Override
	public String toString() {
		return "Player " + name + " finished";
	}

	

}
