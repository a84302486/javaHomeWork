package javaSE.ch05;

public class TwoimArray01 {
	public static void main(String[] args) {
		int[][] ax00 = { { 1,     2, 3,  5,  6  }, 
				         { 123, 111, 5,  5,  7  }, 
				         { 0,    20, 0,  9,  6  }, 
				         { 19,   29, 39, 8, 100, },
				       };
		
		// ��V�[�`(�C)
		int sum = 0;
		for (int x = 0; x < ax00.length; x++) {
			sum = 0;
			for (int a = 0; a < ax00[x].length; a++) {
				sum += ax00[x][a];
			}
			System.out.println("��" + x + "�C���M=" + sum);
		}
				System.out.println("===================");
//		�a�V�[�`(��)
		for(int x =0;x<ax00[0].length;x++){
			sum=0;
			for(int a =0;a<ax00.length;a++){
			sum+=ax00[a][x];
		}
		System.out.println("��" + x + "�檺�M=" + sum);
	}
}}