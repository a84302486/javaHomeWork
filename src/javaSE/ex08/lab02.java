package javaSE.ex08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class lab02 {

	public static void main(String[] args) {
		methodA();
		System.out.println("program ends");
	}
	static void methodA(){
		try {
			int i = 3/0;
			URL urlA = new URL("http://www.seed.net.tw");
			FileInputStream fis =new FileInputStream("D:\\Test.text");
		} catch (ArithmeticException e1) {
			System.out.println("�������i��0");
		} catch (MalformedURLException e2) {
			System.out.println("�L�k�s��");
		} catch (FileNotFoundException e3) {
			System.out.println("�䤣���ɮ�");
		}finally{
			System.out.println("���~�w�Q����");
		}
	}

}
