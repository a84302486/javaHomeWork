package hw02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Tools.RiverTools;
import Tools.SysInfo;

public class CelebrityDAO {
	String conInfo = SysInfo.getMySqlLogin(true, true, "UTF-8");

	public void dropTable() {
		String sql = readSQLFile("hw02/dropCelebrityTable.sql");
		try (Connection con = DriverManager.getConnection(conInfo);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			int n = pstmt.executeUpdate();
			if (n == 0) {
				System.out.println("刪除表格完成");
			} else {
				System.out.println("刪除表格發生問題");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String readSQLFile(String file) {
		try (FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);) {
			String line = "";
			StringBuilder sb = new StringBuilder();
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
			return sb.toString();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void createTable() {
		String sql = readSQLFile("hw02/createCelebrityTable.sql");
		try (Connection con = DriverManager.getConnection(conInfo);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			int n = pstmt.executeUpdate();
			if (n == 0) {
				System.out.println("建立表格完成");
			} else {
				System.out.println("建立表格發生問題");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertData() {
		String vin_diesel = "9http://www.space-fox.com/wallpapers/celebsm/vin-diesel/vin_diesel_";
		String penelope_cruz = "64http://www.space-fox.com/wallpapers/celebs/penelope-cruz/penelope_cruz_";
		String tom_cruise = "10http://www.space-fox.com/wallpapers/celebsm/tom-cruise/tom_cruise_";
		List<String> list = new ArrayList();
		String sql = "insert into celebrity values (null, ?,?,?,?,?,?)";
		try (Connection con = DriverManager.getConnection(conInfo);
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			list.add(vin_diesel);
			list.add(penelope_cruz);
			list.add(tom_cruise);
			for (String s : list) {
				String url = s.substring(s.indexOf("http://"));

				int picNumber = Integer.parseInt(s.substring(0, s.indexOf("http://")));
				for (int i = 1; i <= picNumber; i++) {
					String surl = url + i + ".jpg";
					String filename = surl.substring(surl.lastIndexOf("/") + 1);
					// System.out.println(surl);
					byte[] pic = download(surl, filename);
					int size = pic.length;
					System.out.println("下載完成, size = " + size + " bytes");
					pstmt.setString(1, url.substring(url.lastIndexOf("/") + 1, url.length() - 1));
					if (url.substring(url.lastIndexOf("celebs"), url.lastIndexOf("celebs") + 7).equals("celebsm")) {
						pstmt.setString(2, "男");
					} else {
						pstmt.setString(2, "女");
					}
					pstmt.setString(3, filename);
					pstmt.setInt(4, size);
					pstmt.setDate(5, new Date(Calendar.getInstance().getTime().getTime()));

					pstmt.setBytes(6, pic);
					pstmt.executeUpdate();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static byte[] download(String surl, String filename) {
		try {
			URL url = new URL(surl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			int contentLength = con.getContentLength();
			byte[] img = new byte[contentLength];
			byte[] tempImg = new byte[8192];
			int readLen = 0,desPos = 0;
			System.out.println("開始下載" + filename);
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
