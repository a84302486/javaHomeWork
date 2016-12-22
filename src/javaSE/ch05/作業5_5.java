package javaSE.ch05;

public class 作業5_5 {

	public static void main(String[] args) {
		int[][]test={{ 10,35, 40,100,90,85,75,70},
			         { 37,75, 77, 89,64,75,70,95},
				    { 100,70, 79, 90,75,70,79,90},
				     { 77,95, 70, 89,60,75,85,89},
				     { 98,70, 89, 90,75,90,89,90},
				     { 90,80,100, 75,50,20,99,75}};
		int sum = 0;
		for (int n = 0; n < test.length; n++) {
			sum=0;
			for (int a = 0; a < test[n].length; a++) {
				sum += test[n][a];
			}
			System.out.println("第" + (n+1) + "列的總和=" + sum);
		}
		System.out.println("=================");

		for (int i = 0; i < test[0].length; i++) {
			sum=0;
			for (int v = 0; v < test.length; v++) {
				
				sum += test[v][i];
			}
			System.out.println("第" + (i+1) + "行的總和="+sum);
		}

	}
}