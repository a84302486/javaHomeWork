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
			System.out.println("��J��ƫD�Ʀr");
		} finally {
			System.out.println("�����첧�`,�۰ʵ���");
		}
	}
	public static void main(String[] args) {
		subroutine(args);
	}
}
