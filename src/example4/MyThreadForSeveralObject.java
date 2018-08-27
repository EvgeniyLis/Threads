package example4;

import java.util.Random;

public class MyThreadForSeveralObject implements Runnable {

	private String threadMane;
	Random random = new Random();
	
	public MyThreadForSeveralObject(String threadMane) {
		super();
		this.threadMane = threadMane;
	}

	public String getThreadMane() {
		return threadMane;
	}

	public void setThreadMane(String threadMane) {
		this.threadMane = threadMane;
	}

	@Override
	public void run() {
		int countOperations = random.nextInt(10)+20;
		for (int i = 0; i < countOperations;  i++) {
			System.out.println(" Operation is "+i+" of thread "+threadMane);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
