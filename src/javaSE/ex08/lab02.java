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
			System.out.println("分母不可為0");
		} catch (MalformedURLException e2) {
			System.out.println("無法連結");
		} catch (FileNotFoundException e3) {
			System.out.println("找不到檔案");
		}finally{
			System.out.println("錯誤已被偵測");
		}
	}

}
