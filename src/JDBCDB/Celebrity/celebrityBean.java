package JDBCDB.Celebrity;

import java.io.InputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class celebrityBean implements Serializable{
	 int id; String CeleName; String gender; 		
	 String filename  ; long size; String timesave ; 	
	 InputStream picture;
	
	 public celebrityBean() {
		super();
	}

	public celebrityBean(String celeName, String gender, String filename, long size, String timesave,
			InputStream picture) {
		super();
		CeleName = celeName;
		this.gender = gender;
		this.filename = filename;
		this.size = size;
		this.timesave = timesave;
		this.picture = picture;
	}

	public String getCeleName() {
		return CeleName;
	}

	public void setCeleName(String celeName) {
		CeleName = celeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public String getTimesave() {
		return timesave;
	}

	public void setTimesave(String timesave) {
		this.timesave = timesave;
	}

	public InputStream getPicture() {
		return picture;
	}

	public void setPicture(InputStream picture) {
		this.picture = picture;
	}
	public static String getDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String Date = sdf.format(new Date());
		return Date;
	}
	 
}
