package javaSE.ch05;

public class lab02 {

	public static void main(String[] args) {
		int[] ar = { 100, 35, 46, 75, 56, 69 };
		int max = ar[0];
		int min = ar[0];
		int sum = 0;
		int avg = 0;

		for (int n = 0; n < ar.length; n++) {
			sum += ar[n];
			avg = sum / ar.length;
			if (ar[n] > max) {
				max = ar[n];
			}
			if (ar[n] < min) {
				min = ar[n];
			}

		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		System.out.println("sum=" + sum);
		System.out.println("avg=" + avg);
	}

}
