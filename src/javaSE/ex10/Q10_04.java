package javaSE.ex10;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q10_04 {

	public static void main(String[] args) throws IOException {
		try(
			FileOutputStream fos =new FileOutputStream("D:\\data.txt");
			DataOutputStream dos =new DataOutputStream(fos);
		){
			int x = (int)(Math.random()*1000)+1;
			System.out.println(x);
			dos.writeInt(x);
		}
		try( 
			FileInputStream fis = new FileInputStream("D:\\data.txt");
			DataInputStream dis =new DataInputStream(fis);
		){
			int n=dis.read();
			System.out.println(n);
		}

	}

}
