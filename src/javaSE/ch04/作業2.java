package javaSE.ch04;

public class 作業2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int x = 1; x <= 1000; x++) {
		
			if (x % 2 == 0) {
						
				sum = sum + x;
				
//				System.out.println(sum);
			}
			
		}
		System.out.println("1-1000的偶數和="+sum);
	}
}
