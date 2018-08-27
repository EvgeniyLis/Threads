package example2;

// создание потока через интерфейс

public class MyThreadInterface implements Runnable {

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
