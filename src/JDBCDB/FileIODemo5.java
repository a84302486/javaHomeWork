package JDBCDB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileIODemo5 {

	public static void main(String[] args) throws Exception {
		String dir = "C:\\myPictures";
		File folder = new File(dir);
		if (!folder.exists()) 
			folder.mkdirs();
		
		
		String surl1 = "http://www.space-fox.com/wallpapers/celebs/penelope-cruz/penelope_cruz_";
		String surl3 = ".jpg";				
		
		for(int n=1; n <=1; n++){
			String surl = surl1 + n + surl3;
			String filename = surl.substring(surl.lastIndexOf("/") + 1);
			URL  url = new URL(surl);
			File file = new File(folder, filename);
			int len = 0 ;
			int size = 0;
			
			try(
					InputStream is = url.openStream();
					FileOutputStream fos = new FileOutputStream(file);
				)
				{
					long s = System.currentTimeMillis();
					byte[] b = new byte[8192];
				    while ( (len = is.read(b)) != -1){
				    	fos.write(b, 0, len);
				    	size += len;
				    }
				    System.out.println("ÀÉ®×¤j¤p"+size);
				    System.out.println(filename + " OK");
				    long e = System.currentTimeMillis();
				    System.out.println("Time elapsed: " + (e - s) );
				  
				} 			
		}	
		
	}

}
