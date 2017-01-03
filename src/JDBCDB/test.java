package JDBCDB;

import java.text.SimpleDateFormat;
import java.util.Date;

import JDBCDB.Celebrity.celebrityBean;
import JDBCDB.Celebrity.celebrityUtil;

public class test {

	public static void main(String[] args) {
			  int count = 64 ;
			  String url = "http://www.space-fox.com/wallpapers/celebsm/vin-diesel/vin_diesel_1.jpg";
			  String urlEnd = url.substring(url.lastIndexOf("."));
			  for (int x=1;x <= count;x++ ) {
				String url2 = x + urlEnd;
				System.out.println("²Ä"+x+"­Ó="+url2);
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
			System.out.println(cd.getCeleName());
			System.out.println(cd.getGender());
			System.out.println(cd.getFilename());
			System.out.println(cd.getPicture());
			System.out.println(cd.getTimesave());
		}
	}
}

