package servelet.ch01.ex02;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {

	public static void main(String[] args) throws IOException {
		ServerSocket s = new ServerSocket(5431);
		System.out.println("Server02:伺服器待命中");
		Socket s1 = s.accept();
		try(
			InputStream is = s1.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream s1out = s1.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(s1out);
			){
			int num = dis.readInt();
			System.out.print("Server02:接收到Client02的亂數個數:"+num+"個為:");
			int arr[]= new int[num];
			int sum =0;
			int max=0;
			int min=0;
			double avg =  sum / num;
			
			for(int i = 0; i < arr.length; i++){
				arr[i]=dis.readInt();
				System.out.print(arr[i]+",");
				sum+=arr[i];
				avg=sum/arr.length;
				max =arr[0];
				min=arr[0];
				if(arr[i]>max){
					max=arr[i];
				}
				if(arr[i]<min){
					min=arr[i];
				}
			}
			System.out.println("");
			System.out.println("--------------------");
			System.out.println("Server02:max="+max);
			System.out.println("Server02:min="+min);
			System.out.println("Server02:sum="+sum);
			System.out.println("Server02:avg="+avg);
			System.out.println("--------------------");
			System.out.println("Server02:傳送資料至Client02");
			dataBean DB = new dataBean(num, max, min, sum, avg);
			System.out.println("max="+max+",min="+min+",sum="+sum+",avg="+avg);
			oos.writeObject(DB);
			oos.writeObject(null);

			System.out.println("Server02:資料傳送完畢");
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
