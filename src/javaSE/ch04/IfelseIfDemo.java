package javaSE.ch04;

public class IfelseIfDemo {

	public static void main(String[] args) {
		int score = (int) (Math.random()*110);
		System.out.println("����=" + score);
		if (score >= 60 & score<=100) {
			System.out.println("�����N�n�δ�");
			System.out.println("�����N�n�δ�");
			System.out.println("�����N�n�δ�");
		} else if (score > 50 & score < 60) {
			System.out.println("�����N�n���p");
			System.out.println("�����N�n���p");
			System.out.println("�����N�n���p");
		} else if (score < 49) {
			System.out.println("�z�p�ܪ��o��");
			System.out.println("�z�p�ܪ��o��");
			System.out.println("�z�p�ܪ��o��");
		} else {
			System.out.println("�z�p�ܪ��`���O100,�Q�F�֪�");
		}

	}

}
