package javaSE.ex07;

import java.util.*;

public class lab02 {
	static String season;

	public static void main(String[] args) {

		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);
		
		
		if ((month+1) == 3 || (month+1) == 4 || (month+1) == 5) {
			season = "�K��";
		} else if ((month+1) == 6 || (month+1) == 7 || (month+1) ==8) {
			season = "�L��";
		} else if ((month+1) == 9 || (month+1) ==10 || (month+1) ==11) {
			season = "���";
		} else {
			season = "�V��";
		}
		System.out.println("3,4,5�묰�K��/6,7,8�묰�L��/9,10,11�����/12,1,2���V��");
		System.out.println("�{�b�����"+(month+1));
		System.out.println("�u�`��"+lab02.season);
	}

}
