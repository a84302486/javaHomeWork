package JDBCDB.pet;


public class PetMain {

	public static void main(String[] args) {
		PetDAO dao = new PetDAO();
		dao.createTables();
		PetDAO.initPet("PetData.csv","BIG5");
	}
	
}
