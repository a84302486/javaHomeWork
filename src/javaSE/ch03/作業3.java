package javaSE.ch03;

import java.util.Scanner;

public class �@�~3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0 ;
		System.out.println("����L��J����,�L�X���̪��M�t�n�өM�l��");
		if (scan.hasNextInt()){
			x=scan.nextInt();
			y=scan.nextInt();
	    int a = x+y;
	    int b = x-y;
	    int c = x*y;
	    int d = x/y;
	    int e = x%y;
	
		System.out.println("�M="+ a);
		System.out.println("�t="+ b);
		System.out.println("�n="+ c);
		System.out.println("��="+ d);
		System.out.println("�l��="+ e);
//
		}
	}

}
