package JDBCDB;



public class PetUpdateMain {

	public static void main(String[] args) {
		byte [] picture = PetDAO.fileToBytes("123456");
		char [] comment = PetDAO.fileToChars("789", "BIGG");
		
		PetDAO dao = new PetDAO();
		PetBean pb = new PetBean( 2, "å¯µç‰©??ç¨±", "ä¸»äººå§“å??", "??Ÿæ—¥", 1000, 123, "??–ç?‡æ?”æ?”å??",picture, comment);
        int n =  dao.update(pb);  
		if (n == 1){
			System.out.println("å·²åˆª?™¤è©²ç?†è?‡æ??");
		} else {
			System.out.println("?Ÿ¥?„¡æ­¤ç?†è?‡æ??");
		}
	}
}
