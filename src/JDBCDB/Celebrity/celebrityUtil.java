package JDBCDB.Celebrity;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class celebrityUtil {
	public static void initCelebrity(String url) throws IOException{
		
		celebrityDAO dao = new celebrityDAO();
		String urlHead = url.substring(0,url.lastIndexOf("_")+1);
		String urlEnd = url.substring(url.lastIndexOf("."));
			try{
				int x = 1;
				while (true){
				HttpURLConnection connection = HttpToSQL(url = urlHead + x + urlEnd);
				  String[] sa = url.split("/");
				  String celeName  = sa[5].trim();
				  String gender	 = sa[4].trim();
				  if(gender.equals("celebsm")){
					  gender = "M";
				  }else{
					  gender = "F";
				  }
				  String filename  = sa[6].trim();
				  int filesize = connection.getContentLength();
				  String timesave  = celebrityBean.getDate();
				  InputStream picture = connection.getInputStream();
				  System.out.println("明星"+celeName+"第"+x+"張圖片讀取成功");

				  celebrityBean cd = new celebrityBean (celeName, gender, filename, filesize, 
						  timesave, picture);
				  dao.insert(cd);
				  x++;
				}
			}catch(IOException e){
				System.out.println("已無圖檔");
			}
	}
	public static HttpURLConnection HttpToSQL(String setUrl) throws IOException {
		URL getUrl = new URL(setUrl);
		HttpURLConnection connection =  (HttpURLConnection) getUrl.openConnection();
		return connection;
	}
	
}