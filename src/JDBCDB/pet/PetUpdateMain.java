package JDBCDB.pet;



public class PetUpdateMain {

	public static void main(String[] args) {
		byte [] picture = PetDAO.fileToBytes("123456");
		char [] comment = PetDAO.fileToChars("789", "BIGG");
		
		PetDAO dao = new PetDAO();
		PetBean pb = new PetBean( 2, "寵物??�稱", "主人姓�??", "??�日", 1000, 123, "??��?��?��?��??",picture, comment);
        int n =  dao.update(pb);  
		if (n == 1){
			System.out.println("已刪?��該�?��?��??");
		} else {
			System.out.println("?��?��此�?��?��??");
		}
	}
}
