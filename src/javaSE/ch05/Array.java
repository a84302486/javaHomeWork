package javaSE.ch05;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		Integer[]arr={100,50,70,88,99,39,91};
		Arrays.sort(arr);
		System.out.print("���W�Ƨ�");
		System.out.println(Arrays.toString(arr));
		
List<Integer>list=Arrays.asList(arr);
Collections.reverse(list);
System.out.print("����Ƨ�");
System.out.println(Arrays.toString(list.toArray()));

	}

}
