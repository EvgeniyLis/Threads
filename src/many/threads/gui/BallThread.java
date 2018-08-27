package many.threads.gui;

public class BallThread extends Thread {
	
	private PanelForBalls panelForBalls;
	private int ballNumber;

	public BallThread(PanelForBalls panelForBalls, int ballNumber) {
		super();
		this.panelForBalls = panelForBalls;
		this.ballNumber = ballNumber;
	}

	@Override
	public void run() {
		while(true) {
			panelForBalls.getBalls()[ballNumber].checkCoefX(panelForBalls.getWidth());
			panelForBalls.getBalls()[ballNumber].checkCoefY(panelForBalls.getHeight());
			for (int i = 0; i < panelForBalls.getBalls().length; i++) {
				if (i!=ballNumber) {
					if (!panelForBalls.getBalls()[ballNumber].checDistance(panelForBalls.getBalls()[i])) {
						panelForBalls.getBalls()[ballNumber].invertX();
						panelForBalls.getBalls()[ballNumber].invertY();
					}
				}
			}
			panelForBalls.getBalls()[ballNumber].changeX();
			panelForBalls.getBalls()[ballNumber].changeY();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			panelForBalls.repaint();
		}
		
	
	}
	
	

}
