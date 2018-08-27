package example1;

public class UseThread {
	
	// создание потока через класс

	public static void main(String[] args) {
		System.out.println("Start of the main thread");
		MyThread myThread = new MyThread();
		System.out.println("Start of subthread");
		myThread.start();
		/*for (int i = 0; i < 600000; i++) {
			
		}*/
		System.out.println("End of main thread");

	}

}
