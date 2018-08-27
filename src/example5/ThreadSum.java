package example5;

public class ThreadSum extends Thread {
	
	private Data data;

	public ThreadSum(Data data) {
		super();
		this.data = data;
	}


	@Override
	public void run() {
		data.setSumPos(0);
		for (int i = 0; i < data.getArray().length; i++) {
			if (data.getArray()[i] > 0) {
				data.setSumPos(data.getSumPos()+data.getArray()[i]);
			}
		}
		System.out.println("Summ is "+data.getSumPos());
	}
	
	

}
