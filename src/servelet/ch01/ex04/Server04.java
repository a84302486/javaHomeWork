package servelet.ch01.ex04;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;



public class Server04 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket ss = new ServerSocket(9527);
		System.out.println("Server04:伺服器待命中");
		Socket s1 = ss.accept();
		
		try(
			InputStream s1in = s1.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(s1in));
			){
			String s = br.readLine();
			System.out.println("Server04:收到字串"+s);
			
			}catch(IOException e ){
				e.printStackTrace();
			}
		}
	}