package javaSE.ex09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class lab02 {

	public static void main(String[] args) {
		System.out.println("��k�@");
		String[] n = { "�i�g��", "�����", "�B����", "���l�l", "�����", "������", "�B���R", "���l�l", "�����", "�����" };
		List<String> list = Arrays.asList(n);
		System.out.println("���h���ƫe:" + list);
		HashSet h = new HashSet(list);
		System.out.println("���h���ƫ�:" + h);
		System.out.println("---------------------");
		
		
		System.out.println("��k�G");
		String[] n1 = { "�i�g��", "�����", "�B����", "���l�l", "�����", "������", "�B���R", "���l�l", "�����", "�����" };
		Set<String> s = new HashSet<String>();
		for(String a : n1){
			s.add(a);
		}
		System.out.println("���h���ƫ�:" +s);
		System.out.println("---------------------");
		
	}
	}
	

