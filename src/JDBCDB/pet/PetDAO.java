package JDBCDB.pet;
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



public class PetDAO {
	String dbURL = SystemConstant.URL + "?user=" + SystemConstant.USER + "&password=" 
    + SystemConstant.PASSWORD+ "&useSSL=true&useUnicode=yes&characterEncoding=UTF-8";
	
	public PetDAO() {
	}
	
	public PetDAO(String url) {
	}
	
	public void createTables() {
		int n = 0;
		String sql = "drop table if exists Pet";
		String sql2 = " Create Table Pet (" + 
				" id int NOT NULL auto_increment primary key," + 
				" petName    varchar(20), " + 
				" masterName varchar(32), " + 
				" birthday          date, " + 
				" price              int, " + 
				" weight          double, " + 
				" filename   varchar(60), " + 
				" picture       longBlob, " + 
				" comment        longBlob " + ")";
		try (
			Connection con = DriverManager.getConnection(dbURL);
			PreparedStatement pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			) {
			n = pstmt.executeUpdate();
			n = pstmt2.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public int insert(PetBean pb){
		int n = 0 ;
		String sql = "INSERT INTO Pet "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement pstmt = con.prepareStatement(sql);		
		) {
			pstmt.setInt(1, pb.getId());
			pstmt.setString(2, pb.getPetName());
			pstmt.setString(3, pb.getMasterName());
			pstmt.setString(4, pb.getBirthday());
			pstmt.setDouble(5, pb.getPrice());
			pstmt.setDouble(6, pb.getWeight());	
			pstmt.setString(7, pb.getFilename());
			pstmt.setBytes(8, pb.getPicture());
			SerialClob clob = new SerialClob(pb.getComment());
			pstmt.setClob(9, clob);
			n = pstmt.executeUpdate();
			System.out.println("Ë°®Ê†ºË®òÈ?ÑÊ?êÂ??, id=" + pb.getId());
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState() + " " + pb.getId());
			ex.printStackTrace() ;
		}
		return n;
	}
	
	public int update(PetBean pb) {
		int n = 0 ;
		String sql = "update Pet set id = ?, petName = ?, masterName = ?,"
				+ "birthday = ?, price = ?, weight= ?, "
				+ "filename = ?, picture = ?, comment = ?";
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement pstmt = con.prepareStatement(sql);		
		) {
			pstmt.setInt(1, pb.getId());
			pstmt.setString(2, pb.getPetName());
			pstmt.setString(3, pb.getMasterName());
			pstmt.setString(4, pb.getBirthday());
			pstmt.setDouble(5, pb.getPrice());
			pstmt.setDouble(6, pb.getWeight());	
			pstmt.setString(7, pb.getFilename());
			pstmt.setBytes(8, pb.getPicture());
			SerialClob clob = new SerialClob(pb.getComment());
			pstmt.setClob(9, clob);
			n = pstmt.executeUpdate();
			System.out.println("‰øÆÊîπË°®Ê†ºË®òÈ?ÑÊ?êÂ??, id=" + pb.getId());
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState() + " " + pb.getId());
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
	public PetBean findByPrimaryKey(int key){
		String sql = "SELECT * FROM Pet WHERE placeId = ?";
		PetBean pb = null;
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement pstmt = con.prepareStatement(sql);	
		) {
			pstmt.setInt(1, key);
			try (
			   ResultSet rs = pstmt.executeQuery();
            ) {
			   if (rs.next()){
				   pb = new PetBean();
				   pb.setId(rs.getInt(1));
				   pb.setPetName(rs.getString(2));
				   pb.setMasterName(rs.getString(3));
				   pb.setBirthday(rs.getString(4));
				   pb.setPrice(rs.getInt(5));
				   pb.setWeight(rs.getDouble(6));
				   pb.setFilename(rs.getString(7));
				   pb.setPicture(rs.getBytes(8));
				   pb.setComment(clobToCharArray(rs.getClob(9)));
			   }	
			}
			System.out.println("?ü•Ë©¢Ë?òÈ?ÑÊ?êÂ??, id=" + pb.getId());
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState() + " " + pb.getId());
			ex.printStackTrace() ;
		}
		return pb;
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
	
	public List<PetBean> findAll(){
		List <PetBean> list = new ArrayList<>();
		String sql = "select * from place where Id % 2 =0";
		try (
			Connection con = DriverManager.getConnection(dbURL);
			PreparedStatement pstmt = con.prepareStatement(sql);
			){
				try (
					   ResultSet rs = pstmt.executeQuery();
		            ) {
					   while (rs.next()){
						   PetBean pb = new PetBean();
						   pb.setId(rs.getInt(1));
						   pb.setPetName(rs.getString(2));
						   pb.setMasterName(rs.getString(3));
						   pb.setBirthday(rs.getString(4));
						   pb.setPrice(rs.getInt(5));
						   pb.setWeight(rs.getDouble(6));
						   pb.setFilename(rs.getString(7));
						   pb.setPicture(rs.getBytes(8));
						   pb.setComment(clobToCharArray(rs.getClob(9)));
						   list.add(pb);
					   }	
					}
					System.out.println("?ü•Ë©¢Ë?òÈ?ÑÊ?êÂ??");
				} catch (SQLException ex) {
					ex.printStackTrace() ;
				}
				return list;
	}
	public static void initPet(String filename, String encoding){
		PetDAO dao = new PetDAO();
	
		try (
			FileInputStream fis = new FileInputStream(filename);
			InputStreamReader in = new InputStreamReader(fis, encoding);
			BufferedReader br = new BufferedReader(in);
		) {
			
			String line = "";
			while ((line = br.readLine()) != null) {
			  String[] sa = line.split(",");
			  int id = Integer.parseInt(sa[0].trim());
			  String petName = sa[1].trim();
			  String masterName	 = sa[2].trim();
			  String birthday    = sa[3].trim();
			  int price = Integer.parseInt(sa[4].trim());
			  double weight  = Double.parseDouble(sa[5].trim());
			  String picfilename  = sa[6].trim();
			  byte[] picture = PetDAO.fileToBytes("pics\\"+ sa[7].trim());
			  char[] comment = PetDAO.fileToChars("txts\\" + sa[8].trim(), encoding);
			  
			  PetBean pb = new PetBean (id, petName, 
					  masterName, birthday, price, weight, picfilename, 
					  picture, comment);
			  dao.insert(pb);

			}
			System.out.println("Ê™îÊ??" + filename + "?ñ∞Â¢ûÂ?åÁï¢");
		} catch (IOException ex) {
			System.out.println(ex.getMessage() + "==>" + filename);
			ex.printStackTrace();
		}
	}
	public static byte[] fileToBytes(String filename) {
		File f = new File(filename);
		int len = (int) f.length();
		byte[] b = new byte[len];
		try (FileInputStream fis = new FileInputStream(f);) {
			fis.read(b);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return b;
	}
	public static char[] fileToChars(String filename, String encoding) {
		try (FileInputStream fis = new FileInputStream(filename);
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