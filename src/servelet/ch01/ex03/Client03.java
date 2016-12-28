package servelet.ch01.ex03;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client03 {

	public static void main(String[] args) throws ParseException, IOException  {
		Socket s = new Socket("127.0.0.1",5432);
		System.out.println("Client02:�PServer�s�u���\");
		String date = "2010-12-20 18:27:36";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date ndate = sdf.parse(date);
		long ins = ndate.getTime();
		int x = (int)(Math.random()*10)+1;
		System.out.println("Client03:�üƬ�"+x);
		
		try(
			OutputStream s1out = s.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(s1out);
			){
			
			if(x % 2 ==0){
				Cat c =new Cat("kitty", ins);
				oos.writeObject(c);
				System.out.println("Client03:�g�X" + c +"����");
			}else if (x % 2 !=0){
				Dog d =new Dog("Snoopy", ins);
				oos.writeObject(d);
				System.out.println("Client03:�g�X" + d +"����");
			}
			oos.flush();
		}catch(IOException e ){
			e.printStackTrace();
	}
}
}
