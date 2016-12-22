package javaSE.ex10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Q10_03 {

	public static void main(String[] args) throws IOException {
		
		try(
				FileOutputStream fos = new FileOutputStream("D:\\data.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
			oos.writeDouble(17.625);
		}
		try(
				FileInputStream fis =new FileInputStream("D:\\data.txt");
				ObjectInputStream ois =new ObjectInputStream(fis);
				){
			double d = ois.readDouble();	
			System.out.println(d);
		}
		}
		
}

