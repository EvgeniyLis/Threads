package example4;

public class UseMultiThreadWithJoin {

	public static void main(String[] args) {
		System.out.println("Start of main thread");
		Thread[] threads = new Thread[3];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(new MyThreadForSeveralObject("Name "+i));
		}
		System.out.println("Start sub threads");
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		for (int i = 0; i < threads.length; i++) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("End of main thread");

	}

}
