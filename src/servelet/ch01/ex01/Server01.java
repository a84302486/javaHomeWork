package servelet.ch01.ex01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	
	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(5431);
		System.out.println("S:���A���ݩR��");
		try(
			Socket s1 = s.accept();
			OutputStream s1out = s1.getOutputStream();
			InputStream s1in = s1.getInputStream();
			DataInputStream dis = new DataInputStream(s1in);
			DataOutputStream dos = new DataOutputStream(s1out);
			){
					int x = dis.readInt();
					int y = dis.readInt();
					System.out.println("S:����"+x +"&"+ y);

					int sum = x+y ; 
					dos.write(sum);
					System.out.println("S:��X��Ӷüƪ��M:" + sum);
				    int sub = x-y ; 
				    dos.write(sub);
				    System.out.println("S:��X��Ӷüƪ��t:" + sub);
				    int mul = x*y;
					dos.write(mul);
					System.out.println("S:��X��Ӷüƪ��n:" + mul);
				    double div = x/y ; 
					dos.writeDouble(div);
					System.out.println("S:��X��Ӷüƪ���:" + div);
					System.out.println("S:�{������");

			}catch(IOException e){
				System.out.println("Server:�غcSocket����o��IO�C�~"+e.getMessage());
				e.printStackTrace();
		}
	}
}