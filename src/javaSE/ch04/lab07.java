package javaSE.ch04;

public class lab07 {

	public static void main(String[] args) {
		int sum = 0; int n =1;
		int sum1 = 0; int a =1;
		int sum2 = 0; int b =2;
		while (n<=20) {

			sum = sum + n;
			n++;
			System.out.println("n="+n+"sum="+sum);
			
		}
		while (a<=19) {
			sum1 = sum1 + a;
			a+=2;
			System.out.println("a="+a+"sum="+sum1);
			

		}
		while (b<=20) {
			
			sum2 = sum2 + b;
			b+=2;
			System.out.println("b="+b+"sum="+sum2);
		
		}
		System.out.println("1. 1 + 2 + 3 + .... + 19 + 20 的總和=" + sum);
		System.out.println("2. 1 + 3 + 5 + .... + 17 + 19 的總和=" + sum1);
		System.out.println("3. 2 + 4 + 6 + .... + 18 + 20 的總和=" + sum2);
	}
}
