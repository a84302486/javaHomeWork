package JDBCDB.Celebrity;

import java.io.Serializable;

public class celebrityBean implements Serializable{
	 int id; String CeleName; String gender; 		
	 String filename  ; long size; String timesave ; 	
	 byte[] picture;
	
	 public celebrityBean() {
		super();
	}

	public celebrityBean(int id, String celeName, String gender, String filename, long size, String timesave,
			byte[] picture) {
		super();
		this.id = id;
		CeleName = celeName;
		this.gender = gender;
		this.filename = filename;
		this.size = size;
		this.timesave = timesave;
		this.picture = picture;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	 
	 
}
