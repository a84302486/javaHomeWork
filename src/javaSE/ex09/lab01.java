package javaSE.ex09;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class lab01 {


	public static void main(String[] args) {
		Collection<Object> v = new ArrayList<>();

		v.add(new Integer(100));
		v.add(new Double(3.14));
		v.add(new Long(21L));
		v.add(new Short("100"));
		v.add("Kitty");
		v.add(new Integer(200));
		v.add(new Object());
		v.add("Snoopy");
		v.add(new BigInteger("1000"));
		 System.out.println("印出v內所有元素"+v);
		Iterator<Object> it = v.iterator();
		while (it.hasNext()) {
			Object o = it.next();
		
			if (!(o instanceof Number)) {
				it.remove();
			}
		
		}
		System.out.println("再次印出v的元素" +v);
	}

}
