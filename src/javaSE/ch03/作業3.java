package javaSE.ch03;

import java.util.Scanner;

public class 作業3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0 ;
		System.out.println("由鍵盤輸入兩整數,印出它們的和差積商和餘數");
		if (scan.hasNextInt()){
			x=scan.nextInt();
			y=scan.nextInt();
	    int a = x+y;
	    int b = x-y;
	    int c = x*y;
	    int d = x/y;
	    int e = x%y;
	
		System.out.println("和="+ a);
		System.out.println("差="+ b);
		System.out.println("積="+ c);
		System.out.println("商="+ d);
		System.out.println("餘數="+ e);
//
		}
	}

}
