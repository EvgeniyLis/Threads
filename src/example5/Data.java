package example5;

public class Data {
	
	private double[] array; 
	private double sumPos;
	private int countPos;
	
	public double[] getArray() {
		return array;
	}
	public void setArray(double[] array) {
		this.array = array;
	}
	public double getSumPos() {
		return sumPos;
	}
	public void setSumPos(double sumPos) {
		this.sumPos = sumPos;
	}
	public int getCountPos() {
		return countPos;
	}
	public void setCountPos(int countPos) {
		this.countPos = countPos;
	}
	
	public Data(double[] array) {
		super();
		this.array = array;
	}
	
	
}
