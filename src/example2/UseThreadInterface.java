package example2;

public class UseThreadInterface {

	public static void main(String[] args) {
		System.out.println("Start main thread");
		MyThreadInterface myThreadInterface = new MyThreadInterface();
		Thread thread = new Thread(myThreadInterface);
		thread.start();
		System.out.println("End main thread");

	}

}
