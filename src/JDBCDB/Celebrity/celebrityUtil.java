package JDBCDB.Celebrity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class celebrityUtil {
	public static void initCelebrity(String url, String encoding , int count){
		celebrityDAO dao = new celebrityDAO();
	
		try (
			FileInputStream fis = new FileInputStream(url);
			InputStreamReader in = new InputStreamReader(fis, encoding);
			BufferedReader br = new BufferedReader(in);
			){
			String urlHead = url.substring(url.lastIndexOf("_"));
			String urlEnd = url.substring(url.lastIndexOf("."));
			for (int x=1;x <= count;x++ ) {
			url = urlHead + x + urlEnd;
			  String[] sa = url.split("/");
			  String gender	 = sa[4].trim();
			  String celeName  = sa[5].trim();
			  if(gender.equals("celebsm")){
				  gender = "Male";
			  }else{
				  gender = "Female";
			  }
			  String filename  = sa[6].trim();
			  int size = 0;
			  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			  
			  String timesave  = sdf.format(new Date());
			  byte[] picture = celebrityUtil.fileToBytes("pics\\"+ sa[6].trim());
			 
			  
			  celebrityBean cd = new celebrityBean (celeName, gender, filename, size, timesave, 
					  picture);
			  dao.insert(cd);

			}
			System.out.println("┼ки·жие\");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	public static byte[] fileToBytes(String filenameA) {
		File f = new File(filenameA);
		int len = (int) f.length();
		byte[] b = new byte[len];
		try (FileInputStream fis = new FileInputStream(f);) {
			fis.read(b);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return b;
	}
}	

