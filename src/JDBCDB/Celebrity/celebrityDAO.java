package JDBCDB.Celebrity;
import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.serial.SerialClob;



public class celebrityDAO {
	String dbURL = SystemConstant.URL + "?user=" + SystemConstant.USER + "&password=" 
    + SystemConstant.PASSWORD+ "&useSSL=true&useUnicode=yes&characterEncoding=UTF-8";
	
	public celebrityDAO() {
	}
	
	public celebrityDAO(String url) {
	}
	
	public void createTables() {
		int n = 0;
		String sql = "drop table if exists Celebrity";
		String sql2 = " Create Table Celebrity (" + 
				" id int NOT NULL auto_increment primary key," + 
				" CeleName    varchar(30), " + 
				" gender 	  varchar(10), " + 
				" filename    varchar(60), " + 
				" size             BigInt, " + 
				" timesave           timestamp, " + 
				" picture         longBlob " + ")";
		try (
			Connection con = DriverManager.getConnection(dbURL);
			PreparedStatement pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			) {
			n = pstmt.executeUpdate();
			n = pstmt2.executeUpdate();
			System.out.println("Table«Ø¥ß¦¨¥\");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public int insert(celebrityBean cd){
		int n = 0 ;
		String sql = "INSERT INTO Celebrity "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement pstmt = con.prepareStatement(sql);		
		) {
			pstmt.setInt(1, cd.getId());
			pstmt.setString(2, cd.getCeleName());
			pstmt.setString(3, cd.getGender());
			pstmt.setString(4, cd.getFilename());
			pstmt.setLong(5, cd.getSize());
			pstmt.setString(6, cd.getTimesave());	
			pstmt.setBytes(7, cd.getPicture());
			n = pstmt.executeUpdate();
			System.out.println("id=" + cd.getId());
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState() + " " + cd.getId());
			ex.printStackTrace() ;
		}
		return n;
	}
	
	public int update(celebrityBean cd) {
		int n = 0 ;
		String sql = "update Celebrity set id = ?, CeleName  = ?, gender  = ?,"
				+ "filename  = ?, size = ?, timesave = ?, "
				+ "picture  = ?";
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement pstmt = con.prepareStatement(sql);		
		) {
			pstmt.setInt(1, cd.getId());
			pstmt.setString(2, cd.getCeleName());
			pstmt.setString(3, cd.getGender());
			pstmt.setString(4, cd.getFilename());
			pstmt.setLong(5, cd.getSize());
			pstmt.setString(6, cd.getTimesave());	
			pstmt.setBytes(7, cd.getPicture());
			n = pstmt.executeUpdate();
			System.out.println("id=" + cd.getId());
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState() + " " + cd.getId());
			ex.printStackTrace() ;
		}
		return n;
	}
	
	public int delete(int key){
		int  n = 0;
		String sql = "delete from Pet where placeId = ?";
		try(
			Connection con = DriverManager.getConnection(dbURL);
			PreparedStatement pstmt = con.prepareStatement(sql);
			){
			pstmt.setInt(1, key);
			n = pstmt.executeUpdate();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		return n;
	}
	public celebrityBean findByPrimaryKey(int key){
		String sql = "SELECT * FROM Pet WHERE placeId = ?";
		celebrityBean cd = null;
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement pstmt = con.prepareStatement(sql);	
		) {
			pstmt.setInt(1, key);
			try (
			   ResultSet rs = pstmt.executeQuery();
            ) {
			   if (rs.next()){
				   cd = new celebrityBean();
				   cd.setId(rs.getInt(1));
				   cd.setCeleName(rs.getString(2));
				   cd.setGender(rs.getString(3));
				   cd.setFilename(rs.getString(4));
				   cd.setSize(rs.getInt(5));
				   cd.setTimesave(rs.getString(6));
				   cd.setPicture(rs.getBytes(7));
				
			   }	
			}
			System.out.println("id=" + cd.getId());
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState() + " " + cd.getId());
			ex.printStackTrace() ;
		}
		return cd;
	}
	
	private char[] clobToCharArray(Clob clob) {
		try (
        Reader rd = clob.getCharacterStream();
        CharArrayWriter caw = new CharArrayWriter();
		) {
           char[] ca = new char[8192];
           int len = 0 ;
           while ((len=rd.read(ca))!=-1){
        	  caw.write(ca, 0, len);
           }
           char[] output = caw.toCharArray();
		   return output;
		} catch(Exception ex){
			ex.printStackTrace();
		}   
		return null;
	}
	
	public List<celebrityBean> findAll(){
		List <celebrityBean> list = new ArrayList<>();
		String sql = "select * from place where Id % 2 =0";
		try (
			Connection con = DriverManager.getConnection(dbURL);
			PreparedStatement pstmt = con.prepareStatement(sql);
			){
				try (
					   ResultSet rs = pstmt.executeQuery();
		            ) {
					   while (rs.next()){
						   celebrityBean cd = new celebrityBean();
						   cd.setId(rs.getInt(1));
						   cd.setCeleName(rs.getString(2));
						   cd.setGender(rs.getString(3));
						   cd.setFilename(rs.getString(4));
						   cd.setSize(rs.getInt(5));
						   cd.setTimesave(rs.getString(6));
						   cd.setPicture(rs.getBytes(7));
		
						   list.add(cd);
					   }	
					}
					System.out.println("?Ÿ¥è©¢è?˜é?„æ?å??");
				} catch (SQLException ex) {
					ex.printStackTrace() ;
				}
				return list;
	}
	public static void initCelebrity(String filenameA, String encoding){
		celebrityDAO dao = new celebrityDAO();
	
		try (
			FileInputStream fis = new FileInputStream(filenameA);
			InputStreamReader in = new InputStreamReader(fis, encoding);
			BufferedReader br = new BufferedReader(in);
		) {
			
			String line = "";
			while ((line = br.readLine()) != null) {
			  String[] sa = line.split(",");
			  int id = Integer.parseInt(sa[0].trim());
			  String celeName  = sa[1].trim();
			  String gender	 = sa[2].trim();
			  String filename  = sa[3].trim();
			  int size = Integer.parseInt(sa[4].trim());
			  String timesave  = sa[5].trim();
			  byte[] picture = celebrityDAO.fileToBytes("pics\\"+ sa[6].trim());
			 
			  
			  celebrityBean cd = new celebrityBean (id, celeName, gender, filename, size, timesave, 
					  picture);
			  dao.insert(cd);

			}
			System.out.println("Åª¨ú" + filenameA + "¦¨¥\");
		} catch (IOException ex) {
			System.out.println(ex.getMessage() + "==>" + filenameA);
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
	public static char[] fileToChars(String filenameA, String encoding) {
		try (FileInputStream fis = new FileInputStream(filenameA);
				InputStreamReader in = new InputStreamReader(fis, encoding);
				CharArrayWriter caw = new CharArrayWriter();) {
			int len = 0;
			char[] ca = new char[8192];
			while ((len = in.read(ca)) != -1) {
				caw.write(ca, 0, len);
			}
			return caw.toCharArray();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}
}