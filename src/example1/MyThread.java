package example1;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Start of thread");
		for (int i = 0; i < 600000; i++) {
			
		}
		System.out.println("End of thread");
		super.run();
	}
	

}