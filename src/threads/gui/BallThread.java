package threads.gui;

import javax.swing.JPanel;

public class BallThread extends Thread {
	
	private PanelThreads panelThreads;
	private boolean startStop = false; // false - объект работает, true - объект останавливается

	public void setStartStop(boolean startStop) {
		this.startStop = startStop;
	}

	public BallThread(PanelThreads panelThreads) {
		super();
		this.panelThreads = panelThreads;
	}

	@Override
	public void run() {
		while (true) {
			do {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} while (startStop);
			panelThreads.repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	

}
