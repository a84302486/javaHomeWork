package javaSE.ch03;

public class cast {

	public static void main(String[] args) {
		short s = 200;
		s = (short) (s + 1); // int型別的資料轉換為short型別�臧G
		System.out.println(s);
		byte b = 100;
		b = (byte) (b + 1); // int型別的資料轉換為byte型別�臧G
		System.out.println(b);
		int i = 100;
		i = i + 1;
		// double型別的資料轉換為float型別�臧G
		
		float area0 = (float) (30 * 30 * 3.14);
		System.out.println(area0);
		
		double area1 = 30 * 30 * 3.14;
		System.out.println(area1);
	}

}
