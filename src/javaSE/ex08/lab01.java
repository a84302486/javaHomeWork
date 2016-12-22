package javaSE.ex08;

public class lab01 {

	static void subroutine(String[] ar) {
		int sum = 0;
		try {
			for (int i = 0; i < ar.length; i++) {
				sum += Integer.parseInt(ar[i]);
			}
			System.out.println("sum=" + sum);
		} catch (NumberFormatException e) {
			System.out.println("輸入資料非數字");
		} finally {
			System.out.println("偵測到異常,自動結束");
		}
	}
	public static void main(String[] args) {
		subroutine(args);
	}
}
