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
			String[] sa ={"MLB/���إ��n�O �y�t�t��150����",
					  "���ߥ��u�o�°^�m6��-�Ӯa���U2�s��",
					  "MLB/���إ��n�O �y�t�t��1500���� ",
					  "���~�j�}���� ����11�s��"};
			
		int x = (int)(Math.random()*sa.length)*1;
		System.out.println("Client04:�r�ꬰ"+sa[x]);

		pw.write(sa[x]);
		
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
}

