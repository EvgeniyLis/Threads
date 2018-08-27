package example4;

public class UseMultiThreads {

	public static void main(String[] args) {
		System.out.println("Start of main thread");
		MyThreadForSeveralObject[] myThreads = new MyThreadForSeveralObject[3];
		for (int i = 0; i < myThreads.length; i++) {
			myThreads[i] = new MyThreadForSeveralObject("Name"+i);
		}
		Thread thread;
		System.out.println("Start sub threads");
		for (int i = 0; i < myThreads.length; i++) {
			thread = new Thread(myThreads[i]);
			thread.start();
		}
		System.out.println("End of main thread");

	}

}
