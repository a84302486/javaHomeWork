package javaSE.ch04;

public class Ch04Lab10 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int sum = 0;
		for (x = 1; x <= 9; x++) {
			for (y = 1; y <= 9; y++) {
				sum=x*y;
				
				System.out.println(x + "X" + y + "="+sum);
			}
		}
		
	}

}
