package servelet.ex02;

import java.io.Serializable;

public class dataBean implements Serializable {
	private int num;
	private int max;
	private int min;
	private int sum;
	private double avg;
	
	public dataBean(int num, int max, int min, int sum, double avg) {
		super();
		this.num = num;
		this.max = max;
		this.min = min;
		this.sum = sum;
		this.avg = avg;
	}
	
	public dataBean(){
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}

