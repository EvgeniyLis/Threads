package example3;

public class ThreadInt3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Start sub thread");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End sub thread");
		
	}

}
