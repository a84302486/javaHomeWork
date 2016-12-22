package javaSE.ch03;

import java.util.Scanner;

public class 作業4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "";
		System.out.println("請輸入三個字串：");
		if (scan.hasNext()) {
			s = scan.next();
			System.out.println("字慣長度為:" + s.length());
		}

	}
}
//