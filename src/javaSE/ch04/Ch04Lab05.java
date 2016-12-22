package javaSE.ch04;

public class Ch04Lab05 {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int n = 1; n <= 20; n++) {

			sum = sum + n;
			System.out.println();
			
		}
		for (int a = 1; a <= 19; a++) {
			sum1 = sum1 + a;
			System.out.println("a="+a+"sum="+sum1);
			

		}
		for (int b = 2; b <= 20; b++){
			;
		sum2 = sum2 + b;
		System.out.println("b="+b+"sum2="+sum2);
		
		}
		System.out.println("1. 1 + 2 + 3 + .... + 19 + 20 的總和=" + sum);
		System.out.println("2. 1 + 3 + 5 + .... + 17 + 19 的總和=" + sum1);
		System.out.println("3. 2 + 4 + 6 + .... + 18 + 20 的總和=" + sum2);
	}
}
