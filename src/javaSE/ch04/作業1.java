package javaSE.ch04;

public class �@�~1 {

	public static void main(String[] args) {
		int x = 0;
		int n = 0;
		int sum=0;
		double avg=0;
		for (x = 1; x <= 10; x++) {
			n = (int) (Math.random() * 100) + 1;
			sum=sum+n;
			avg=(double)sum/10;
			System.out.println("�ü�"+x+"="+n);
//			System.out.println(sum);
			

		}
		System.out.println("�ü��`�M��="+sum);
		System.out.println("�üƥ����Ȭ�="+avg);
	}

}