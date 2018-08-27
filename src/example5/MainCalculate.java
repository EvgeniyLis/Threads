package example5;

public class MainCalculate {

	public static void main(String[] args) {
		System.out.println("Start main thread");
		double[] array = {23.6, -4.45, 3.5, 12.56, -56,43};
		Data data = new Data(array);
		ThreadSum threadSum = new ThreadSum(data);
		ThreadCount threadCount = new ThreadCount(data);
		threadSum.start();
		threadCount.start();
		try {
			threadSum.join();
			threadCount.join();
		} catch (InterruptedException e) {
		}
		System.out.println("Result = "+(data.getSumPos()/data.getCountPos()));

	}

}
