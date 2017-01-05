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
		
		String dropTable = "drop table if exists Celebrity";
		String createTable = " Create Table Celebrity (" + 
				" id int NOT NULL auto_increment primary key," + 
				" CeleName    varchar(30), " + 
				" gender 	  varchar(1), " + 
				" filename    varchar(60), " + 
				" size             BigInt, " + 
				" timesave      timestamp, " + 
				" picture         longBlob " + ")";
		try (
			Connection con = DriverManager.getConnection(dbURL);
			PreparedStatement psDrop = con.prepareStatement(dropTable);
			PreparedStatement pscreate = con.prepareStatement(createTable);
			) {
			psDrop.executeUpdate();
			pscreate.executeUpdate();
			System.out.println("Table建立成功");
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void insert(celebrityBean cd){
	
		String insertInto = "INSERT INTO Celebrity "
				+ "VALUES(null, ?, ?, ?, ?, ?, ?)";
		try (
		  Connection con = DriverManager.getConnection(dbURL);
		  PreparedStatement psInsert = con.prepareStatement(insertInto);		
		) {

			psInsert.setString(1, cd.getCeleName());
			psInsert.setString(2, cd.getGender());
			psInsert.setString(3, cd.getFilename());
			psInsert.setLong(4, cd.getSize());
			psInsert.setString(5, cd.getTimesave());	
			psInsert.setBinaryStream(6, cd.getPicture());
			psInsert.executeUpdate();
			System.out.println("檔案寫入SQL完成");
		} catch (SQLException ex) {
			System.out.println(ex.getSQLState());
			ex.printStackTrace() ;
		}

	}
}
