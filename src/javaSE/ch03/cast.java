package javaSE.ch03;

public class cast {

	public static void main(String[] args) {
		short s = 200;
		s = (short) (s + 1); // int���O������ഫ��short���O��NG
		System.out.println(s);
		byte b = 100;
		b = (byte) (b + 1); // int���O������ഫ��byte���O��NG
		System.out.println(b);
		int i = 100;
		i = i + 1;
		// double���O������ഫ��float���O��NG
		
		float area0 = (float) (30 * 30 * 3.14);
		System.out.println(area0);
		
		double area1 = 30 * 30 * 3.14;
		System.out.println(area1);
	}

}
