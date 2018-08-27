package guessnumber;

public class GuessThread extends Thread {
	
	private PlayerNum player;
	private int gNumber;
	
	
	public GuessThread(PlayerNum player) {
		super();
		this.player = player;
	}

	@Override
	public void run() {
		do {
			gNumber = player.callNumber();
			System.out.println(player.getCurrentMessage()+gNumber);
			try {
				Thread.sleep((long) player.setSleepInterval());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (gNumber!=player.getGoalNumber());
		System.out.println(player + " finished with "+gNumber);
	}



	
	
	

}
