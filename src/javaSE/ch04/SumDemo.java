package javaSE.ch04;

public class SumDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("i=" + i + ",sum=" + sum);
		}
		System.out.println("sum" + sum);
	}

}
