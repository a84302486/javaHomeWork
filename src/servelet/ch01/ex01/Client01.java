package servelet.ch01.ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

	public class Client01 {

	public static void main(String[] args) throws IOException {
		Socket s1 = new Socket("127.0.0.1",5431);
		System.out.println("C:與Server連線成功");
		
			try(
				OutputStream s1out = s1.getOutputStream();
				InputStream s1in = s1.getInputStream();
				DataInputStream dis = new DataInputStream(s1in);
				DataOutputStream dos = new DataOutputStream(s1out);
				){
					int x = (int)(Math.random()*100)+1;
					int y = (int)(Math.random()*100)+1;
					System.out.println("C:產生兩個隨機亂數:"+x+"&"+y);
					dos.writeInt(x);
					dos.writeInt(y);
					System.out.println("C:輸出亂數"+x+"&"+y);
		
					int sum = dis.read();
					System.out.println("C:收到兩個亂數的和:"+sum);
					int sub = dis.read();
					System.out.println("C:收到兩個亂數的差:"+sub);
					int mul = dis.read();
					System.out.println("C:收到兩個亂數的積:"+mul);
					int div = dis.read();
					System.out.println("C:收到兩個亂數的商:"+div);
					System.out.println("C:程式結束");
					
		}catch(IOException e){
			System.out.println("Client:建構Socket物件發生IO列外"+e.getMessage());
			e.printStackTrace();
		}
	}
}

