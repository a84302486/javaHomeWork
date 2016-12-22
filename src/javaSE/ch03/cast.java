package javaSE.ch03;

public class cast {

	public static void main(String[] args) {
		short s = 200;
		s = (short) (s + 1); // int«¬§Oªº¸ê®ÆÂà´«¬°short«¬§O„»NG
		System.out.println(s);
		byte b = 100;
		b = (byte) (b + 1); // int«¬§Oªº¸ê®ÆÂà´«¬°byte«¬§O„»NG
		System.out.println(b);
		int i = 100;
		i = i + 1;
		// double«¬§Oªº¸ê®ÆÂà´«¬°float«¬§O„»NG
		
		float area0 = (float) (30 * 30 * 3.14);
		System.out.println(area0);
		
		double area1 = 30 * 30 * 3.14;
		System.out.println(area1);
	}

}
