package javaSE.ch05;

public class 作業5_4 {

	public static void main(String[] args) {
		String[] ca = { "snoopy", "micky", "lucky", "kitty", "derby" };
		String[] x = { "a", "e", "i", "o", "u" };
		int sum[] = new int[5];
		for (int y = 0; y < ca.length; y++) {
			for (int y1 = 0; y1 < ca[y].length(); y1++) {
				for (int z = 0; z < x.length; z++) {
					int a = ca[y].charAt(y1);
					int b =  x[z].charAt(0);
					System.out.println("a"+a);
					System.out.println("b"+b);
					System.out.println("============");
					if (a == b) {
						sum[z]+=1;
					}
				}
			}
		}
		for(int i=0;i<sum.length;i++){
			System.out.println(ca[i]+"有"+sum[i]+"個母音");
		}

	}
}