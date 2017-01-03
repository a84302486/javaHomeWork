package JDBCDB.Celebrity;



public class celebrityMain {

	public static void main(String[] args) {
		celebrityDAO dao = new celebrityDAO();
		dao.createTables();
		celebrityDAO.initCelebrity("celebrityData", "UTF8");
	}

}
