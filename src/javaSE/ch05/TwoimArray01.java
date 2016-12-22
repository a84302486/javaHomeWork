package javaSE.ch05;

public class TwoimArray01 {
	public static void main(String[] args) {
		int[][] ax00 = { { 1,     2, 3,  5,  6  }, 
				         { 123, 111, 5,  5,  7  }, 
				         { 0,    20, 0,  9,  6  }, 
				         { 19,   29, 39, 8, 100, },
				       };
		
		// 橫向加總(列)
		int sum = 0;
		for (int x = 0; x < ax00.length; x++) {
			sum = 0;
			for (int a = 0; a < ax00[x].length; a++) {
				sum += ax00[x][a];
			}
			System.out.println("第" + x + "列的和=" + sum);
		}
				System.out.println("===================");
//		縱向加總(行)
		for(int x =0;x<ax00[0].length;x++){
			sum=0;
			for(int a =0;a<ax00.length;a++){
			sum+=ax00[a][x];
		}
		System.out.println("第" + x + "行的和=" + sum);
	}
}}