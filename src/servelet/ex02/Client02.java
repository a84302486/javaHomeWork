package servelet.ex02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.*;

public class Client02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		Socket s1 = new Socket("127.0.0.1",5431);
		System.out.println("Client02:�PServer�s�u���\");

		try(
			OutputStream s1out = s1.getOutputStream();
			DataOutputStream dos = new DataOutputStream(s1out);
			InputStream is = s1.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			){
			int num = (int)(Math.random()*(10-5+1))+5;
			int xn[]=new int [num];
			dos.writeInt(num);
			System.out.print("Client02:"+num+"�ӶüƬ�:");
			
			for( int x = 0;x < num;x++){
			xn[x]= (int)(Math.random()*100)+1;
			}
			for (int i = 0; i < xn.length; i++) {
				dos.writeInt(xn[i]);
				System.out.print(xn[i]+",");
			}
			System.out.println("");
			System.out.println("-----------------------");
			System.out.print("Client02:"+num+"�Ӷüƶǰe����");
			System.out.println("");
			System.out.println("-----------------------");
			System.out.println("Client02:����Server02���");
			Object obj = null;
			while(( obj = ois.readObject())!=null){
				dataBean DB = (dataBean) obj;
				System.out.println("�üƭӼƬ�:"+DB.getNum());
				System.out.println("�ü��`�M��:"+DB.getSum());
				System.out.println("�üƳ̤j�Ȭ�:"+DB.getMax());
				System.out.println("�üƳ̤p�Ȭ�:"+DB.getMin());
				System.out.println("�üƥ�����:"+DB.getAvg());
			 }	
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
}
