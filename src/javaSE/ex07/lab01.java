package javaSE.ex07;

public class lab01 {
	static {
		System.out.println("���B���R�A�϶�(static code block)A");
	}
	lab01() {
		System.out.println("���B���غc�l");
	}
	static {
		System.out.println("���B���R�A�϶�(static code block)B");
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		lab01 la = new lab01();
		System.out.println("HaHaHa");
	}
	static {
		System.out.println("���B���R�A�϶�(static code block)C");
	}
}