package servelet.ch01.ex03;

import java.io.Serializable;

public class Dog extends Mammal implements Serializable {

	public Dog(String name, long birthday) {
		super(name, birthday);
	}
	public Dog(long birthday) {
		super(birthday);
	}
	
}
