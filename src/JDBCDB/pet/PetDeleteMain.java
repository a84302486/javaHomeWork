package JDBCDB.pet;



public class PetDeleteMain {

	public static void main(String[] args) {
		
		PetDAO dao = new PetDAO();
        int n =  dao.delete(3);  
		if (n==1){
			System.out.println("已刪?��該�?��?��??");
		} else {
			System.out.println("?��?��此�?��?��??");
		}
		n =  dao.delete(300);  
		if (n==1){
			System.out.println("已刪?��該�?��?��??");
		} else {
			System.out.println("?��?��此�?��?��??");
		}
	}

	
	
	
	
	
}
