package JDBCDB.Celebrity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class celebrityDAO {
	String dbURL = SystemConstant.URL + "?user=" + SystemConstant.USER + "&password=" 
    + SystemConstant.PASSWORD+ "&useSSL=true&useUnicode=yes&characterEncoding=UTF-8";
	
	public celebrityDAO() {
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
				" timesave      timestamp, " + 
				" picture         longBlob " + ")";
		try (
			Connection con = DriverManager.getConnection(dbURL);
			PreparedStatement pstmt = con.prepareStatement(sql);
			PreparedStatement pstmt2 = con.prepareStatement(sql2);
			) {
			n = pstmt.executeUpdate();
			n = pstmt2.executeUpdate();
			System.out.println("Table建立成功");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public int insert(celebrityBean cd){
		int n = 0 ;
		String sql = "INSERT INTO Celebrity "
				+ "VALUES(null, ?, ?, ?, ?, ?, ?)";
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement pstmt = con.prepareStatement(sql);		
		) {
			
			pstmt.setString(2, cd.getCeleName());
			pstmt.setString(3, cd.getGender());
			pstmt.setString(4, cd.getFilename());
			pstmt.setLong(5, cd.getSize());
			pstmt.setString(6, cd.getTimesave());	
			pstmt.setBytes(7, cd.getPicture());
			n = pstmt.executeUpdate();
			System.out.println("讀檔完成");
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState());
			ex.printStackTrace() ;
		}
		return n;
	}
}
