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
		System.out.println("C:�PServer�s�u���\");
		
			try(
				OutputStream s1out = s1.getOutputStream();
				InputStream s1in = s1.getInputStream();
				DataInputStream dis = new DataInputStream(s1in);
				DataOutputStream dos = new DataOutputStream(s1out);
				){
					int x = (int)(Math.random()*100)+1;
					int y = (int)(Math.random()*100)+1;
					System.out.println("C:���ͨ���H���ü�:"+x+"&"+y);
					dos.writeInt(x);
					dos.writeInt(y);
					System.out.println("C:��X�ü�"+x+"&"+y);
		
					int sum = dis.read();
					System.out.println("C:�����Ӷüƪ��M:"+sum);
					int sub = dis.read();
					System.out.println("C:�����Ӷüƪ��t:"+sub);
					int mul = dis.read();
					System.out.println("C:�����Ӷüƪ��n:"+mul);
					int div = dis.read();
					System.out.println("C:�����Ӷüƪ���:"+div);
					System.out.println("C:�{������");
					
		}catch(IOException e){
			System.out.println("Client:�غcSocket����o��IO�C�~"+e.getMessage());
			e.printStackTrace();
		}
	}
}

