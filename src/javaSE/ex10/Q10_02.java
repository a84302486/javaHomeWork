package javaSE.ex10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Q10_02 {

	public static void main(String[] args) throws IOException {
		
		File in =new File("D://Sample.txt");
		try(
		FileReader fr =new FileReader(in);
		FileInputStream fis =new FileInputStream(in);
		BufferedReader br =new BufferedReader(fr);)
		{
			int count = 0 ; int count2 = 0;
			while ((br.read()) != -1) {
				count++;
			}
			while ((br.readLine()) != null) {
				count2++;
			}
			System.out.println("sample.txt 含有"+in.length()+"個位元組,"+count+"個字元,"+count2+"列資料");
			
		}
		
		
		

	}

}
