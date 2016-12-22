package javaSE.ch04;

public class lab04 {

	public static void main(String[] args) {
		int x =(int)(Math.random()*11)-5;
		System.out.println("隨機亂數="+x);
		if (x>0){
			System.out.println("這是正數="+x);
		}else{
			System.out.println("這是負數="+x);
		}

	}

}
