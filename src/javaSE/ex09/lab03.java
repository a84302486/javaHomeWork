package javaSE.ex09;

import java.util.ArrayList;
import java.util.Collections;

public class lab03 {
	public static void main(String[] args) {
		ArrayList<Double> ad = new ArrayList<>();
		ad.add(new Double(98));
		ad.add(new Double(12.345));
		ad.add(new Double(97.85));
		ad.add(new Double(12));
		System.out.println("排序前:"+ad);
		Collections.sort(ad);
		System.out.println("排序後:"+ad);
	}
}
