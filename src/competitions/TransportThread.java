package competitions;

import java.util.ArrayList;
import java.util.Random;

public class TransportThread extends Thread {
	
	private Player player;
	private Random randon = new Random();
	final double MINSTEP = 15;
	final double MAXSTEP = 25;
	final int MINSLEEP = 300;
	final int MAXSLEEP = 900;
	ArrayList<Player> prizePlayes;
	


	public TransportThread(Player player, ArrayList<Player> prizePlayes) {
		super();
		this.player = player;
		this.prizePlayes = prizePlayes;
	}



	@Override
	public void run() {
		System.out.println(player.getStartMessage());
		while (player.getCurrentDistance() < player.getFinishDistance()) {
			player.setStepDistance(randon.nextDouble()*(MAXSTEP-MINSTEP)+MINSTEP);
			player.setCurrentDistance(player.getCurrentDistance()+player.getStepDistance());
			player.setSleepInterval(randon.nextInt(MAXSLEEP-MINSLEEP)+MINSLEEP);
			try {
				Thread.sleep((long) player.getSleepInterval());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(player.getCurrentMessage()+player.getCurrentDistance()+" meters");
		}
		prizePlayes.add(player);
		System.out.println(player);
	}
}
