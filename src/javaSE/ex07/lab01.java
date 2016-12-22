package javaSE.ex07;

public class lab01 {
	static {
		System.out.println("此處為靜態區塊(static code block)A");
	}
	lab01() {
		System.out.println("此處為建構子");
	}
	static {
		System.out.println("此處為靜態區塊(static code block)B");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		lab01 la = new lab01();
		System.out.println("HaHaHa");
	}
	static {
		System.out.println("此處為靜態區塊(static code block)C");
	}
}