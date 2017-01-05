package JDBCDB.Celebrity;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class celebrityUtil {
	public static void initCelebrity(String url, String encoding , int count) throws IOException{
		celebrityDAO dao = new celebrityDAO();
	
			String urlHead = url.substring(0,url.lastIndexOf("_")+1);
			String urlEnd = url.substring(url.lastIndexOf("."));
			
			for (int x=1;x <= count;x++ ) {
			url = urlHead + x + urlEnd;
			  String[] sa = url.split("/");
			  String gender	 = sa[4].trim();
			  String celeName  = sa[5].trim();
			  if(gender.equals("celebsm")){
				  gender = "M";
			  }else{
				  gender = "F";
			  }
			  String filename  = sa[6].trim();
			  int size = 0;
			  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			  String timesave  = sdf.format(new Date());
			  System.out.println("第"+x+"個圖片讀取成功");
			  byte[] picture = celebrityUtil.fileToBytes(url);

			  celebrityBean cd = new celebrityBean (celeName, gender, filename, size, timesave, 
					  picture);
			  dao.insert(cd);
			}
			System.out.println("讀取成功");
	}
	
	public static byte[] fileToBytes(String surl) throws IOException {
		try {
			URL url = new URL(surl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			int contentLength = con.getContentLength();
			byte[] img = new byte[contentLength];
			byte[] tempImg = new byte[8192];
			int readLen = 0,desPos = 0;
			System.out.println("開始下載");
			// System.out.println(contentLength);
			try (InputStream is = con.getInputStream();) {
				if(contentLength!=-1){
					while((readLen = is.read(tempImg))!=-1){
						System.arraycopy(tempImg, 0, img, desPos, readLen);
						desPos += readLen;
					}
				}
				return img;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

