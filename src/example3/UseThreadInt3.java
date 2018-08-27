package example3;

public class UseThreadInt3 {

	public static void main(String[] args) {
		System.out.println("Start main thread");
		ThreadInt3 threadInt3 = new ThreadInt3();
		Thread thread = new Thread(threadInt3);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // ожидает, пока дочерний поток закончится
		System.out.println("End main thread");

	}

}
