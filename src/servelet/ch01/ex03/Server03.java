package servelet.ch01.ex03;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server03 {
	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException  {
		ServerSocket ss = new ServerSocket(5432);
		System.out.println("Server03:���A���ݩR��");
		Socket s1 = ss.accept();
		
		try(
			InputStream s1in = s1.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(s1in);
			){
			Object o = ois.readObject();
			if(o instanceof Cat){
				Cat c = (Cat) o;
				System.out.println("Server03:Ū��" + o.toString());
				long l = ((Cat) o).getBirthday();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String ndate =sdf.format(l);
				Date date = sdf.parse(ndate);
				System.out.println(ndate);
//				System.out.println(date);
				
			}else if(o instanceof Dog){
				Dog d = (Dog) o;
				System.out.println("Server03:Ū��" + o.toString());
				long l = ((Dog) o).getBirthday();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
				String ndate =sdf.format(l);
				Date date = sdf.parse(ndate);
				System.out.println(ndate);
//				System.out.println(date);
				
				
			}
			
			
			System.out.println("Server03:�{������");
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
}