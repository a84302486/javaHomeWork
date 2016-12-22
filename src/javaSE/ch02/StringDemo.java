package javaSE.ch02;

public class StringDemo {

	public static void main(String[] args) {
		String s = "aaa";
		System.out.println("字串長度=" + s.length());
		String b ="xx";
		s = s + b ;
		System.out.println("字串S的長度=" + s.length());
		System.out.println("字串幹幹幹的長度=" + "幹幹幹".length());
		System.out.println("字串\"大S 小s\"的長度=" + "大S 小s".length());

	}

}
