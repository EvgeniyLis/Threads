package competitions;

import java.util.ArrayList;

public class MainCompetition {

	public static void main(String[] args) {
		final int COUNTOFTRANSPORTS = 5;
		ArrayList<Player> playersList = new ArrayList<>();
		TransportThread[] playersTransports = new TransportThread[COUNTOFTRANSPORTS];
		for (int i = 0; i < playersTransports.length; i++) {
			playersTransports[i] = new TransportThread(new Player("Player"+(i+1), 0, 3000, 15), playersList);
		}
		System.out.println("Competition starts");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < playersTransports.length; i++) {
			playersTransports[i].start();
		}
		for (int i = 0; i < playersTransports.length; i++) {
			try {
				playersTransports[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Competition finished");
		System.out.println("Results of competition");
		for (Player player : playersList) {
			System.out.println(player.getName());
		}
	}

}
