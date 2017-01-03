package JDBCDB.pet;



public class PetDeleteMain {

	public static void main(String[] args) {
		
		PetDAO dao = new PetDAO();
        int n =  dao.delete(3);  
		if (n==1){
			System.out.println("å·²åˆª?™¤è©²ç?†è?‡æ??");
		} else {
			System.out.println("?Ÿ¥?„¡æ­¤ç?†è?‡æ??");
		}
		n =  dao.delete(300);  
		if (n==1){
			System.out.println("å·²åˆª?™¤è©²ç?†è?‡æ??");
		} else {
			System.out.println("?Ÿ¥?„¡æ­¤ç?†è?‡æ??");
		}
	}

	
	
	
	
	
}
