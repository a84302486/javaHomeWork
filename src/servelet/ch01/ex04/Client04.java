package servelet.ch01.ex04;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client04 {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("127.0.0.1",9527);
		
		try(
			OutputStream os = s.getOutputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
			){
			String[] sa ={"MLB/王建民登板 球速飆到150公里",
					  "中心打線發威貢獻6分-皇家拿下2連勝",
					  "MLB/王建民登板 球速飆到1500公里 ",
					  "光芒大破紅襪 結束11連敗"};
			
		int x = (int)(Math.random()*sa.length)*1;
		System.out.println("Client04:字串為"+sa[x]);

		pw.write(sa[x]);
		
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
}

