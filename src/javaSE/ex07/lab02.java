package javaSE.ex07;

import java.util.*;

public class lab02 {
	static String season;

	public static void main(String[] args) {

		Calendar d = Calendar.getInstance();
		int month = d.get(Calendar.MONTH);
		
		
		if ((month+1) == 3 || (month+1) == 4 || (month+1) == 5) {
			season = "春天";
		} else if ((month+1) == 6 || (month+1) == 7 || (month+1) ==8) {
			season = "夏天";
		} else if ((month+1) == 9 || (month+1) ==10 || (month+1) ==11) {
			season = "秋天";
		} else {
			season = "冬天";
		}
		System.out.println("3,4,5月為春天/6,7,8月為夏天/9,10,11為秋天/12,1,2為冬天");
		System.out.println("現在月份為"+(month+1));
		System.out.println("季節為"+lab02.season);
	}

}
