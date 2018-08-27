package example5;

public class ThreadCount extends Thread {
	
	private Data data;

	public ThreadCount(Data data) {
		super();
		this.data = data;
	}


	@Override
	public void run() {
		data.setCountPos(0);;
		for (int i = 0; i < data.getArray().length; i++) {
			if (data.getArray()[i] > 0) {
				data.setCountPos(data.getCountPos()+1);
			}
		}
		System.out.println("Count is "+data.getCountPos());
	}
	
	

}
