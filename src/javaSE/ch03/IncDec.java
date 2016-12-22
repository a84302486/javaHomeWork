package javaSE.ch03;

public class IncDec {

	public static void main(String[] args) {
		int x = 5;
		int y;
		System.out.println("x=5");
		++x;
		System.out.println("++X=" + x);

		x = 5;
		x++;
		System.out.println("x++=" + x);

		x = 5;
		y = ++x;
		System.out.println("y=++x=,y=" + y + ",x=" + x);

		x = 5;
		y = ++x;
		System.out.println("y=x++=,y=" + y + ",x=" + x);

		x = 5;
		y = x++ * 4;
		System.out.println("y=x++*4,y=" + y);

		x = 5;
		y = ++x * 4;
		System.out.println("y=++x*4,y=" + y);
	}

}
