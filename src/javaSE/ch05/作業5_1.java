package javaSE.ch05;

public class 作業5_1 {

	public static void main(String[] args) {
		double a[] = { 84.0, 94, 79.9, 90.5, 82.4, 65.7, 72.8, 99.0, 85.2, 100 };
		double sum = 0;
		double avg = 0;
		int n = 0;
		for (n = 0; n < a.length; n++) {
			sum += a[n];
			avg = sum / a.length;
		}

		System.out.println("元素平均數=" + avg);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > avg) {
				System.out.println("大於" + avg + "的有" + a[i]);
			}

		}
	}
}
