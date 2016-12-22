package javaSE.ch05;

public class lab01 {

	public static void main(String[] args) {
		int []ar={59,27,-18,98,10};
	
		
		double []br={3.14,75.9,18.9};
	
		String []cr={"kitty","snoopy","garfield"};
	
		int []xa={33,19,25,50,-8};
		for(int i =0;i<xa.length;i++){
			System.out.println(xa[i]);
		}
		int[]xb={33,19,25,50,-8};
		for(int n :xa){
			System.out.println(n);
		}
	}

}
