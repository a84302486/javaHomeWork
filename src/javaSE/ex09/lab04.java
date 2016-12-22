package javaSE.ex09;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lab04 {
	public static void main(String[] args) {
		System.out.println("方法一");
		String[] n = { "張君雅", "潘美雪", "劉雪莉", "黃彬彬", "潘美雪", "黃美華", "劉雪麗", "黃彬彬", "潘美雪", "潘美雪" };
		List<String> list = Arrays.asList(n);
		System.out.println("除去重複前:" + list);
		HashSet h = new HashSet(list);
		System.out.println("除去重複後:" + h);
		System.out.println("---------------------");

		System.out.println("方法二");
		String[] n1 = { "張君雅", "潘美雪", "劉雪莉", "黃彬彬", "潘美雪", "黃美華", "劉雪麗", "黃彬彬", "潘美雪", "潘美雪" };
		Set<String> s = new HashSet<String>();
		for (String a : n1) {
			s.add(a);
		}
		System.out.println("除去重複後:" + s);
		System.out.println("---------------------");

	}

}
