package javaSE.ch04;

public class IfelseIfDemo {

	public static void main(String[] args) {
		int score = (int) (Math.random()*110);
		System.out.println("分數=" + score);
		if (score >= 60 & score<=100) {
			System.out.println("阿不就好棒棒");
			System.out.println("阿不就好棒棒");
			System.out.println("阿不就好棒棒");
		} else if (score > 50 & score < 60) {
			System.out.println("阿不就好雖小");
			System.out.println("阿不就好雖小");
			System.out.println("阿不就好雖小");
		} else if (score < 49) {
			System.out.println("干妳嗎的廢物");
			System.out.println("干妳嗎的廢物");
			System.out.println("干妳嗎的廢物");
		} else {
			System.out.println("干妳嗎的總分是100,想騙誰阿");
		}

	}

}
