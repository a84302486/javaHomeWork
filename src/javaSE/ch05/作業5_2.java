package javaSE.ch05;

public class 作業5_2 {

	public static void main(String[] args) {
		int num1[] = new int[6];
		for (int i = 0; i < num1.length; i++) {

			num1[i] = (int) (Math.random() * 42 + 1);
			for (int j = 0; j < i; j++) {
				if (num1[i] == num1[j]) {
					num1[i] = (int) (Math.random() * 42) + 1;
				}
			}
			
		}
		System.out.print("亂數產生1-42的號碼為:");
		for (int n = 0; n < num1.length; n++) {
			
			System.out.print(num1[n]+",");
		}
		
	}
}