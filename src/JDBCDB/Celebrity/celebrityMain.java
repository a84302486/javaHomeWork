package JDBCDB.Celebrity;



public class celebrityMain {

	public static void main(String[] args) {
		celebrityDAO dao = new celebrityDAO();
		dao.createTables();
		
		celebrityUtil.initCelebrity("http://www.space-fox.com/wallpapers/celebsm/vin-diesel/vin_diesel_1.jpg","UTF8",9);
		celebrityUtil.initCelebrity("http://www.space-fox.com/wallpapers/celebs/penelope-cruz/penelope_cruz_1.jpg","UTF8",64);
		celebrityUtil.initCelebrity("http://www.space-fox.com/wallpapers/celebsm/tom-cruise/tom_cruise_1.jpg", "UTF8",10);
	}

}
